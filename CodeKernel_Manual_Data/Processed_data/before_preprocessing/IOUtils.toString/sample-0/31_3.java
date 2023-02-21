public void dummy {

protected String providePerfLoadVersion() {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		InputStream is = loader.getResourceAsStream("com/mgmtp/perfload/core/common/version.txt");
		try {
			return IOUtils.toString(is, "UTF-8");
		} catch (IOException ex) {
			throw new IllegalStateException("Could not read perfLoad version.", ex);
		} finally {
			IOUtils.closeQuietly(is);
		}
	}

}