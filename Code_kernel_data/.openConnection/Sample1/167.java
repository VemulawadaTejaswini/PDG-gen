//166
public class func{
	public void url(String urls){
        URL url = new URL(urls);
        InputStream ins = url.openConnection().getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(ins));
        while((str = reader.readLine()) != null)
            System.out.println(str);
}
}
