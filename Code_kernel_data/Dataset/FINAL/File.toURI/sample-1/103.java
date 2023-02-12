public class func{
public void deserialize(File tmpDir){
        IMetadataRepository repository = manager.loadRepository(tmpDir.toURI(), null);
        IQueryResult<IInstallableUnit> queryResult = repository.query(QueryUtil.ALL_UNITS, null);
        Set<IInstallableUnit> result = queryResult.toSet();
}
}
