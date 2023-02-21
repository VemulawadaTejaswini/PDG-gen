public class dummy {
	
	public static String readAsDataURL(InputStream is, String contentType)
			throws IOException {
		String base64file = IOUtils.toString(new Base64InputStream(is, true, 0,
				null));
		return "data:" + contentType + ";base64," + base64file;
	}
	
}