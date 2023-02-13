public class func{
public void loadJarContent(URL url){
        final JarURLConnection uc = (JarURLConnection) url.openConnection();
        final JarEntry jarEntry = uc.getJarEntry();
        if (jarEntry != null)
        {
            if (logger.isLoggable(Level.FINEST))
                logger.finest(dump(jarEntry));
            return NetworkUtil.download(uc.getInputStream(), jarEntry.getSize(), null);
        }
        throw new IOException("JarResources.loadJarContent(" + url.toString() + ") error:\nEntry not found !");
}
}
