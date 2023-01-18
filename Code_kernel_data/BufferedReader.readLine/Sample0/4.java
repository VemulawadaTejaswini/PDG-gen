//3
public class func{
	public void exec(String cmd){
        Process p = Runtime.getRuntime().exec(cmd);
        p.waitFor();
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
}
}
