public class dummy {

public void compile(String input, File basePath, File targetFile) throws IOException, TypescriptException {
		String result = compile(input,basePath);
		FileUtils.writeStringToFile(targetFile, result);
	}

}