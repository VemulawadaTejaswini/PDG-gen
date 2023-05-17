//5
public class func{
public void loadExistingDataMap(File dataMapFile){
        if (dataMapFile != null && dataMapFile.exists() && dataMapFile.canRead()) {
            DataMap dataMap = mapLoader.loadDataMap(new InputSource(dataMapFile.getCanonicalPath()));
            dataMap.setNamespace(new EntityResolver(Collections.singleton(dataMap)));
            dataMap.setConfigurationSource(new URLResource(dataMapFile.toURI().toURL()));

            return dataMap;
        }
}
}
