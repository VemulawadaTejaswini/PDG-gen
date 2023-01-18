//37
public class func{
	public void printOutput(Process p){
            BufferedReader input = new BufferedReader (new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null) {
                System.out.println(line);
                System.out.flush();
            }
            input.close();
}
}
