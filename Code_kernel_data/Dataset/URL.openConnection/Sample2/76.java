//75
public class func{
	public void dumpFields(String url){
        URLConnection conn = (new URL(url)).openConnection();
        Map<String, List<String>> headerFields = conn.getHeaderFields();
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            System.out.print(entry.getKey() + "  ");
            for (String v : entry.getValue()) {
                System.out.println(v + "  ");
            }
        }
}
}
