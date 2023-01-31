//0
public class func{
	public void timestampInRange(Timestamp lowerBound,Timestamp upperBound,Timestamp timestamp){
        if (timestamp == null) {
            if (lowerBound == null) {
                return true;
            } else {
                return false;
            }
        }
        if ((lowerBound == null) || (timestamp.compareTo(lowerBound) > 0)) {
            if ((upperBound == null) || (timestamp.compareTo(upperBound) < 0)) {
           
}
}
//1
public class func{
	public void compare(Object o1,Object o2){
                        if (t2 == null)
                            t2 = UIUtilities.getDefaultTimestamp();
                        int r = t1.compareTo(t2);
                        if (r < 0) v = -1;
                        else if (r > 0) v = 1;
}
}
//2
public class func{
	public void getMaxTimestamp(FemAbstractColumnSet table,FemRowCountStatistics stats){
        String dmlTime = stats.getDmlTimestamp();
        String analyzeTime = stats.getAnalyzeTimestamp();
        if (analyzeTime == null) {
            if (dmlTime == null) {
                return null;
            } else {
                return Timestamp.valueOf(dmlTime);
            }
        }
        if (dmlTime == null) {
            return Timestamp.valueOf(analyzeTime);
        }
        Timestamp analyzeTimestamp = Timestamp.valueOf(analyzeTime);
        if (dmlTimestamp.compareTo(analyzeTimestamp) > 0) {
            return dmlTimestamp;
        } else {
            return analyzeTimestamp;
        }
}
}
//3
public class func{
	public void createManufacturingOrder(String facilityId,Date date,String workEffortName,String description,String routingId,String orderId,String orderItemSeqId,String shipGroupSeqId,String shipmentId,boolean useSubstitute,boolean ignoreSupplierProducts){
                    if (maxEndDate == null) {
                        maxEndDate = childEndDate;
                    }
                    if (childEndDate != null && maxEndDate.compareTo(childEndDate) < 0) {
                        maxEndDate = childEndDate;
                    }
                    if (childProductionRunId != null) {
                        childProductionRuns.add(childProductionRunId);
                    }
            Timestamp startDate = UtilDateTime.toTimestamp(UtilDateTime.toDateTimeString(date));
}
}
//4
public class func{
	public void getHistogram(FemAbstractColumn column,Timestamp labelTimestamp){
        List<FemColumnHistogram> histogramList = column.getHistogram();
        int listSize = histogramList.size();
        if ((labelTimestamp == null) && (listSize > 0)) {
            return histogramList.get(listSize - 1);
        }
        for (int i = listSize - 1; i >= 0; i--) {
            FemColumnHistogram histogram = histogramList.get(i);
            Timestamp statTime = Timestamp.valueOf(histogram.getAnalyzeTime());
            if (statTime.compareTo(labelTimestamp) < 0) {
                return histogram;
            }
        }
}
}
//5
public class func{
	public void getPageCount(FemLocalIndex index,Timestamp labelTimestamp){
            return index.getPageCount();
        List<FemIndexStatistics> indexStatsList = index.getIndexStats();
        if (indexStatsList.isEmpty()) {
            return index.getPageCount();
        } else {
            // Work backwards through the list until we find the first set
            // of stats that are older than the label timestamp passed
            // in.
            for (int i = indexStatsList.size() - 1; i >= 0; i--) {
                FemIndexStatistics stats = indexStatsList.get(i);
                Timestamp statTime = Timestamp.valueOf(stats.getAnalyzeTime());
                if (statTime.compareTo(labelTimestamp) < 0) {
                    return stats.getPageCount();
                }
            }
        }
}
}
//6
public class func{
	public void getRowCounts(FemAbstractColumnSet table,Timestamp labelTimestamp,Long[] rowCounts){
            rowCounts[0] = table.getRowCount();
            rowCounts[1] = table.getDeletedRowCount();
            table.getRowCountStats();
        if (rowCountStatsList.isEmpty()) {
            rowCounts[0] = table.getRowCount();
            rowCounts[1] = table.getDeletedRowCount();
            return;
        } else {
            // Work backwards through the list until we find the first set
            // of row counts that are older than the label timestamp passed
            // in.
            for (int i = rowCountStatsList.size() - 1; i >= 0; i--) {
                FemRowCountStatistics stats = rowCountStatsList.get(i);
                Timestamp statTime = getMaxTimestamp(table, stats);
                if ((statTime == null)
                    || (statTime.compareTo(labelTimestamp) < 0))
                {
                    rowCounts[0] = stats.getRowCount();
                    rowCounts[1] = stats.getDeletedRowCount();
                    return;
                }
            }
        }
}
}
//7
public class func{
	public void compareTimestamps(Timestamp t1,Timestamp t2){
        int r = t1.compareTo(t2);
        if (r < 0) v = -1;
        else if (r > 0) v = 1;
}
}
//8
public class func{
	public void add(final PatchSetApproval ca){
    approvals.add(ca);
    final Timestamp g = ca.getGranted();
    if (g != null && g.compareTo(sortOrder) < 0) {
      sortOrder = g;
    }
    if (ca.getValue() != 0) {
      hasNonZero = 1;
    }
}
}
//9
public class func{
	public void compare(Hashtable<String,String> a,Hashtable<String,String> b){
          String t2Str = b.get("tgtChangeDate");
          if (t1Str.length() != 0 && t2Str.length() != 0) {
            Timestamp t1 = DateUtils.getTimestampFromUTC(t1Str);
            Timestamp t2 = DateUtils.getTimestampFromUTC(t2Str);
            return t2.compareTo(t1);

          } else if (t1Str.length() == 0 && t2Str.length() != 0) {
            return -1;
          }
}
}
//10
public class func{
	public void compare(FuzzySearchResult a,FuzzySearchResult b){
          String t2Str = b.getTu().getChangeDate();
          if (t1Str.length() != 0 && t2Str.length() != 0) {
            Timestamp t1 = DateUtils.getTimestampFromUTC(t1Str);
            Timestamp t2 = DateUtils.getTimestampFromUTC(t2Str);
            return t2.compareTo(t1);

          } else if (t1Str.length() == 0 && t2Str.length() != 0) {
            return -1;
          }
}
}
//11
public class func{
	public void getHistogramForUpdate(FarragoRepos repos,FemAbstractColumn column,boolean createNewHistogram){
            if ((newestLabelTimestamp != null)
                && (newestLabelTimestamp.compareTo(
                        Timestamp.valueOf(histogram.getAnalyzeTime())) > 0))
            {
                if (createNewHistogram) {
                    histogram = repos.newFemColumnHistogram();
                    histogram.setColumn(column);
                } else {
                    histogram = null;
                }
            }
}
}
//12
public class func{
	public void updatePageCount(FemLocalIndex index,Long pageCount,FarragoRepos repos){
        if ((newestLabelTimestamp == null)
            || noExistingStat
            || (newestLabelTimestamp.compareTo(
                    Timestamp.valueOf(
                        indexStats.getAnalyzeTime())) < 0))
        {
            indexStats.setPageCount(pageCount);
            indexStats.setAnalyzeTime(currTimestamp);
        } else {
            indexStats = repos.newFemIndexStatistics();
            indexStats.setLocalIndex(index);
            indexStats.setPageCount(pageCount);
            indexStats.setAnalyzeTime(currTimestamp);
        }
        index.setAnalyzeTime(currTimestamp);
        index.setPageCount(pageCount);
}
}
//13
public class func{
	public void fromSqlDateTimeNullFarFuture(Timestamp timestamp){
    if (timestamp.compareTo(EFFECTIVE_MAX_TIMESTAMP) > 0) {
      return null;
    }
    return fromSqlDateTime(timestamp);
}
}
//14
public class func{
	public void updateRowCounts(FemAbstractColumnSet table,List<RowCountStat> rowCounts,FarragoRepos repos){
        Timestamp newestLabelTimestamp = getNewestLabelCreationTimestamp(repos);
        Timestamp maxTimestamp = getMaxTimestamp(table, rowCountStats);
        if ((newestLabelTimestamp == null)
            || (maxTimestamp == null)
            || (newestLabelTimestamp.compareTo(maxTimestamp) < 0))
        {
            setNewRowCounts(table, rowCountStats, rowCounts);
        } else {
            FemRowCountStatistics newRowCountStats =
                repos.newFemRowCountStatistics();
            newRowCountStats.setColumnSet(table);

            // initialize the record with the values from the previous
            // record
            newRowCountStats.setDmlTimestamp(rowCountStats.getDmlTimestamp());
            newRowCountStats.setRowCount(rowCountStats.getRowCount());
            newRowCountStats.setDeletedRowCount(
                rowCountStats.getDeletedRowCount());
            newRowCountStats.setAnalyzeTimestamp(
                rowCountStats.getAnalyzeTimestamp());
            newRowCountStats.setAnalyzeRowCount(
                rowCountStats.getAnalyzeRowCount());

            // now, set the new, current values
            setNewRowCounts(table, newRowCountStats, rowCounts);
        }
}
}
//15
public class func{
	public void fromSqlTimestampNullFarFuture(Timestamp timestamp){
    if (timestamp.compareTo(EFFECTIVE_MAX_TIMESTAMP) > 0) {
      return null;
    }
    return fromSqlTimestamp(timestamp);
}
}
//16
public class func{
	public void checkFeatureTimestamp(final String schema,final String uniquename,final GmodDAO dao,final String keyName,final Hashtable<String,Feature> featureIdStore,final ChadoTransaction tsn){
      timestamp.setNanos(0);
      if(now.compareTo(timestamp) != 0)
      {
        final SimpleDateFormat date_format = 
                   new SimpleDateFormat("dd.MM.yyyy hh:mm:ss z");
        
        //System.out.println(date_format.format(now)+"   "+
        //                   date_format.format(timestamp));
        int select = JOptionPane.showConfirmDialog(null, uniquename +
                                      " has been altered at :\n"+
                                      date_format.format(now)+"\nOverwite?", 
                                      "Feature Changed", 
                                      JOptionPane.OK_CANCEL_OPTION);
        if(select == JOptionPane.OK_OPTION)
          return true;
        else
          return false;
      }
}
}
