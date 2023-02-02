//218
public class func{
public void setUpForTest(String pathDDL,String config){
            File ddlFile = new File(pathDDL);
            URL ddlURL = ddlFile.toURI().toURL();
            s_singleton.setupSchema(ddlURL, config, false);
}
}
