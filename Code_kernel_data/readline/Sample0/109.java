//108
public class func{
	public void call(){
                FileInputStream is = new FileInputStream(pidFile);
                        new BufferedReader(new InputStreamReader(is));
                pidval = bufR.readLine();
                bufR.close();
                return (Integer.parseInt(pidval));
}
}
