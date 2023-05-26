//118
public class func{
public void dumpXACMLRequest(HttpServletRequest req){
        BufferedReader r = req.getReader();
        while ((line = r.readLine()) != null)
            System.out.println(line);
}
}
