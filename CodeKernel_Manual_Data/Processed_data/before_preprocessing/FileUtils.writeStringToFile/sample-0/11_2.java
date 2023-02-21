public class dummy {

public void compile(String input, File targetFile, CompilationContext context) throws IOException, TypescriptException {
		String result = compile(input,context);
		FileUtils.writeStringToFile(targetFile, result);
	}

}