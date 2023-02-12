public class func{
public void CliTableManager(){
    File f=new File(ConfUtil.getHiveConfDir()+File.separator+"hive-site.xml");
    if(f.exists()){
      conf.addResource(f.toURI().toURL());
    }
    client=new HiveMetaStoreClient(conf);
}
}
