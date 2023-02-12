public class func{
public void scanXMLFiles(){
    File[] jobBeansFiles = FileLocator.findFiles(BatchFrameworkConstants.SPRING_BATCH_CONFIG);          
    for (File jobBeansFile : jobBeansFiles) {
      for(String jobName: ConfigFileUtils.getJobName(new FileSystemResource(jobBeansFile))) {
        this.jobXMLFile.put(jobName, jobBeansFile.toURI());
      }
    }
}
}
