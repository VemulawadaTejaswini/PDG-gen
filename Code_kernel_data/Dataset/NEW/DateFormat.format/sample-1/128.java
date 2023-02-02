//128
public class func{
public void getRecord(Study study,String metadataPrefix){
        String dateStamp = "<datestamp>"+gmtFormat.format(study.getLastExportTime())+"</datestamp>";
        String setSpec = "<setSpec>"+study.getAuthority()+"</setSpec>";
        File studyFileDir = FileUtil.getStudyFileDir(study);
        String exportFileName= studyFileDir.getAbsolutePath() + File.separator + "export_" + metadataPrefix+".xml";
        String record = identifier+dateStamp+setSpec+readFile(new File(exportFileName));
}
}
