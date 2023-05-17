//13
public class func{
public void MimeTypeUploadPlugin(InitParams initParams,ConfigurationManager configurationService){
        ValueParam param = initParams.getValueParam(MIMETYPE_PATH);
        URL filePath = configurationService.getURL(param.getValue());
        URLConnection connection = filePath.openConnection();
        mimeTypes.load(connection.getInputStream());
        param = initParams.getValueParam(DEFAULT_MIMETYPE);
        if (param != null)
            mimetypeDefault = param.getValue();
}
}
