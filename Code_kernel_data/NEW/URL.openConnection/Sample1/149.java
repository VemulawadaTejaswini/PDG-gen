//148
public class func{
	public void closeLauncherJarFile(final File launcherJar){
            final URI launcherJarUri = launcherJar.toURI();
            final URL launcherJarRoot = new URL("jar:" + launcherJarUri + "!/");
            final URLConnection conn = launcherJarRoot.openConnection();
            if (conn instanceof JarURLConnection) {
                final JarFile jarFile = ((JarURLConnection) conn).getJarFile();
                jarFile.close();
            }
}
}
