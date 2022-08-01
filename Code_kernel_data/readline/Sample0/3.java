//2
public class func{
	public void testURLPathToInputStream(){
        BufferedReader in = new BufferedReader(
                new InputStreamReader(ResourceUtil.pathToInputStream(URL_PATH)));
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
}
}
