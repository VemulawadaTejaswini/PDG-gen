//106
public class func{
public void execAndGetOutput(ProcessBuilder builder){
    Process process = builder.redirectErrorStream(true).start();
    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
      return reader.readLine();
      reader.close();
}
}
