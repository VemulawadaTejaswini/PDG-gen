//409
public class func{
	public void openConnection(File path,String name,boolean createIfNotExists){
                sb.append(";ifexists=true");
            return DriverManager.getConnection(sb.toString(), "SA", "");
}
}
