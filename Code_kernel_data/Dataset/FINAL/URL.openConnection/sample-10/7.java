public class func{
public void readDefinitionsFromJar(URL url){
        JarURLConnection con = (JarURLConnection) url.openConnection();
        JarFile archive = con.getJarFile();
        Enumeration<JarEntry> entries = archive.entries();
        while (entries.hasMoreElements()) {
            JarEntry entry = entries.nextElement();
            if (entry.getName().endsWith(".gplot")) {
                String filename = entry.getName().substring(entry.getName().lastIndexOf("/") + 1);
                String plotName = filename.substring(0, filename.indexOf("."));
                URL resource = GPlotParser.class.getResource(filename);
                result.put(plotName, parse(Resources.toString(resource, Charsets.UTF_8)));
            }
        }
}
}
