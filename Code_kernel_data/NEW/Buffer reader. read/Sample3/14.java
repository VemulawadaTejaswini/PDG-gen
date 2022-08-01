//13
public class func{
	public void call(){
            sb = new StringBuilder();
            while ((len = br.read(buf)) != -1 && sb.length() < OUTPUT_MAX_LEN) {
                sb.append(buf, 0, len);
            }
            if (sb.length() >= OUTPUT_MAX_LEN) {
                executionResult.setResult(ExecutionResultCode.RUNTIME);
                executionResult.setMsg("Output limit exceeded");
                killTest();
                throw new IOException("Output limit exceeded");
            }
            programOutput = sb.toString();
}
}
