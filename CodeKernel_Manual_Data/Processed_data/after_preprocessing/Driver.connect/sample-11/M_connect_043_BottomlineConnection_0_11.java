public class A{
	public BottomlineConnection(String url, Properties props)throws BottomlineException, SQLException {
		JarClassLoader jcl;
		try {
			jcl = new JarClassLoader(props.getProperty(BottomlineConstants.DRIVER_JAR));
		} catch (IOException e1) {
			throw new BottomlineException(e1.getMessage());
		}
		Driver driver = null;
		try {
			driver = (Driver) jcl.loadClass(props.getProperty(BottomlineConstants.DRIVER_CLASS)).newInstance();
		} catch (InstantiationException e) {
			throw new BottomlineException(e);
		} catch (IllegalAccessException e) {
			throw new BottomlineException(e);
		} catch (ClassNotFoundException e) {
			throw new BottomlineException(e);
		}
		conn = driver.connect(url.replaceFirst("jdbc:bottomline:", "jdbc:"),props);
	}
}