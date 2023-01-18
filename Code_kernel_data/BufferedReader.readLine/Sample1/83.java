//82
public class func{
	public void getBodyMessage(HttpServletRequest request){
    BufferedReader reader = request.getReader();
    while ((line = reader.readLine()) != null)
      jb.append(line);
    return jb.toString();
}
}
