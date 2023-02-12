public class func{
public void batchRun(){
      Reader r = "-".equals(inputFile) ? new InputStreamReader(System.in) : new FileReader(inputFile);
      BufferedReader br = new BufferedReader(r);
         for (String line = br.readLine(); line != null; line = br.readLine()) {
            execute(line);
         }
         br.close();
}
}
