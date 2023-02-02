//4
public class func{
public void generate(){
      ClassLoader loader = GenHiveTemplate.class.getClassLoader();
      URL url = loader.getResource("org/apache/hadoop/hive/conf/HiveConf.class");
      if (url != null) {
        File file = new File(url.getFile());
        if (file.exists() && file.lastModified() < current.lastModified()) {
          return;
        }
      }
}
}
