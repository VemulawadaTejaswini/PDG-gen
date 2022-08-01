//129
public class func{
	public void download(LicenseInfo licenseInfo,File outputDir){
        URL url = new URL(licenseInfo.getUrl());
            in = new BufferedInputStream(url.openConnection().getInputStream());
            out = new BufferedOutputStream(new FileOutputStream(path));
            IOUtil.copy(in, out);
            if (in != null) in.close();
            if (out != null) out.close();
}
}
