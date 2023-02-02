//43
public class func{
	public void getRom(Socket client){
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            return br.readLine();
            br.close();
}
}
