public class func{
public void alterTable(RawStore msdb,Warehouse wh,String dbname,String name,Table newt){
      if (!newt.getTableName().equalsIgnoreCase(name)
          || !newt.getDbName().equalsIgnoreCase(dbname)) {
        if (msdb.getTable(newt.getDbName(), newt.getTableName()) != null) {
          throw new InvalidOperationException("new table " + newt.getDbName()
              + "." + newt.getTableName() + " already exists");
        }
        rename = true;
      }
      Table oldt = msdb.getTable(dbname, name);
      if (oldt == null) {
        throw new InvalidOperationException("table " + newt.getDbName() + "."
            + newt.getTableName() + " doesn't exist");
      }
      if (oldt.getPartitionKeys().size() != newt.getPartitionKeys().size()
          || !oldt.getPartitionKeys().containsAll(newt.getPartitionKeys())) {
        throw new InvalidOperationException(
            "partition keys can not be changed.");
      }
      if (rename
          && (oldt.getSd().getLocation().compareTo(newt.getSd().getLocation()) == 0
            || StringUtils.isEmpty(newt.getSd().getLocation()))
          && !MetaStoreUtils.isExternalTable(oldt)) {
        newTblLoc = wh.getDefaultTablePath(newt.getDbName(), newt.getTableName()).toString();
        newt.getSd().setLocation(newTblLoc);
        oldTblLoc = oldt.getSd().getLocation();
        moveData = true;
        srcPath = new Path(oldTblLoc);
        srcFs = wh.getFs(srcPath);
        destPath = new Path(newTblLoc);
        destFs = wh.getFs(destPath);
        if (srcFs != destFs) {
          throw new InvalidOperationException("table new location " + destPath
              + " is on a different file system than the old location "
              + srcPath + ". This operation is not supported");
        }
        try {
          srcFs.exists(srcPath); // check that src exists and also checks
          if (destFs.exists(destPath)) {
            throw new InvalidOperationException("New location for this table "
                + newt.getDbName() + "." + newt.getTableName()
                + " already exists : " + destPath);
          }
        } catch (IOException e) {
          Warehouse.closeFs(srcFs);
          Warehouse.closeFs(destFs);
          throw new InvalidOperationException("Unable to access new location "
              + destPath + " for table " + newt.getDbName() + "."
              + newt.getTableName());
        }
        List<Partition> parts = msdb.getPartitions(dbname, name, 0);
        for (Partition part : parts) {
          String oldPartLoc = part.getSd().getLocation();
          String oldTblLocPath = new Path(oldTblLoc).toUri().getPath();
          String newTblLocPath = new Path(newTblLoc).toUri().getPath();
          if (oldPartLoc.contains(oldTblLocPath)) {
            URI newPartLocUri = null;
            try {
              URI oldPartLocUri = new URI(oldPartLoc);
              newPartLocUri = new URI(
                  oldPartLocUri.getScheme(),
                  oldPartLocUri.getUserInfo(),
                  oldPartLocUri.getHost(),
                  oldPartLocUri.getPort(),
                  oldPartLocUri.getPath().replace(oldTblLocPath, newTblLocPath),
                  oldPartLocUri.getQuery(),
                  oldPartLocUri.getFragment());
            } catch (URISyntaxException e) {
              throw new InvalidOperationException("Old partition location " +
                  " is invalid. (" + oldPartLoc + ")");
            }
            part.getSd().setLocation(newPartLocUri.toString());
            msdb.alterPartition(dbname, name, part);
          }
        }
      }
      msdb.alterTable(dbname, name, newt);
      success = msdb.commitTransaction();
}
}
