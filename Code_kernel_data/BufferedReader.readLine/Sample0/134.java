//133
public class func{
	public void doGet(HttpServletRequest req,HttpServletResponse resp){
        ServletInputStream in = req.getInputStream();
        BufferedReader r = new BufferedReader(new InputStreamReader(in));
        String line = r.readLine();
}
}
