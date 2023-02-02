//10
public class func{
public void dumpProcessOutput(Process p){
        istream = new BufferedReader(new InputStreamReader(p.getInputStream()));
        while ((line = istream.readLine()) != null) {
            System.out.println(line);
        }
}
}
