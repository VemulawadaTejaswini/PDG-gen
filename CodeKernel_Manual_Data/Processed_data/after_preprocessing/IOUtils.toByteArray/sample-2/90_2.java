public class dummy {
private void addTestJars(final Element elem, final DaemonConfig daemonConfig) throws IOException {
		@SuppressWarnings("unchecked")
		List<Element> jarElems = elem.element("testJars").elements();
		for (Element jarElem : jarElems) {
			String fileName = jarElem.attributeValue("name");
			String fileLocation = jarElem.attributeValue("dir");
			File jarFile = new File(fileLocation, fileName);
			InputStream is = null;
			try {
				is = new FileInputStream(jarFile);
				byte[] jarBytes = IOUtils.toByteArray(is);
				daemonConfig.addTestJar(fileName, jarBytes);
			} finally {
				IOUtils.closeQuietly(is);
			}
		}
	}
}