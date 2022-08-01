//73
public class func{
	public void ExecResult(final ExecResultType type,final BufferedReader br){
         while (((line = br.readLine()) != null)) {
            _result.append(line);
         }
         br.close();
}
}
