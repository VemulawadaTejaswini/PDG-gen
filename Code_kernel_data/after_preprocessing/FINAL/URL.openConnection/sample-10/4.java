public class func{
public void readFromJar(URL jarUrl,List resources){
        JarURLConnection jarConnection = (JarURLConnection) jarUrl.openConnection();
        Enumeration entries = jarConnection.getJarFile().entries();
        while (entries.hasMoreElements())
        {
            JarEntry entry = (JarEntry) entries.nextElement();
            String name = new File(entry.getName()).getName();
            if (name.startsWith(MULE) && name.endsWith(XSD))
            {
                logger.debug("entry: " + entry);
                resources.add(new URL(jarUrl, entry.getName()));
            }
        }
}
}
