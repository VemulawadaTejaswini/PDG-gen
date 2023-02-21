public class dummy {

public void compile(File input, File targetFile) throws TypescriptException, IOException {
		String result = compile(input);
		FileUtils.writeStringToFile(targetFile, result);
	}

}