//85
public class func{
	public void createXOManagerFactory(Collection<Class<?>> types){
        XOUnit xoUnit = XOUnitBuilder.create(database.toURI(), Neo4jXOProvider.class, types.toArray(new Class<?>[0]))
                .property(PROPERTY_NEO4J_CACHE_TYPE, VALUE_NEO4J_CACHE_TYPE_NONE).property(PROPERTY_NEO4J_ALLOW_STORE_UPGRADE, Boolean.TRUE.toString())
                .property(PROPERTY_NEO4J_KEEP_LOGICAL_LOGS, Boolean.FALSE.toString()).property(PROPERTY_NEO4J_LOCK_MANAGER, NoOpLockFactory.KEY)
                .property(PROPERTY_NEO4J_DBMS_PAGE_CACHE_MEMORY, "100M").create();
        return XO.createXOManagerFactory(xoUnit);
}
}
