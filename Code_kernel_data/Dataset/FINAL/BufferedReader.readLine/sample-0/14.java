public class func{
public void dumpOutput(Process process){
        InputStream is = process.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        while ((line = br.readLine()) != null) {
          System.out.println(line);
        }
}
}
