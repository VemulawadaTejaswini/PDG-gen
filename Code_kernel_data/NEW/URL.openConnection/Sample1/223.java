//222
public class func{
	public void getJarEntries(String jarName,String entryName){
        JarURLConnection urlConnection = (JarURLConnection) new URL("jar:file:" + jarName + "!/" + entryName).openConnection();
            JarURLConnection jarConnection = ((JarURLConnection)urlConnection);
            JarFile jarFile = jarConnection.getJarFile();
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                if (entry.getName().startsWith(jarConnection.getEntryName())) {
                    if (!entry.isDirectory()) {
                        files.add(entry.getName());
                    }
                }
            }
}
}
