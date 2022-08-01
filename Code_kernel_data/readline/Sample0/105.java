//104
public class func{
	public void printMappings(){
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/self/maps")));
            for (String line; (line = br.readLine()) != null; ) {
                System.out.println(line);
            }
            br.close();
}
}
