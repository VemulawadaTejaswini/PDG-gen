public class A{
	private boolean load() {
		InputStream input;
		try {
			input = inputURL.openStream();
			try {
				if (inputURL.getFile().toLowerCase().endsWith(".xml")) {
					return loadFromXML(input);
				} else {
					return loadFromFile(input);
				}
			} finally {
				input.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}