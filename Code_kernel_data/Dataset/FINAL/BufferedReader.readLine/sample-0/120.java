public class func{
public void getString(String option){
                Process p = Runtime.getRuntime().exec(new String[] { ID_CMD, option });
                BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
                return r.readLine();
}
}
