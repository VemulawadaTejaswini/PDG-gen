//5
public class func{
	public void listAvailableLogs(OutputStreamWriter writer){
      writer.write(olf.filename.getName()+" : "+tempDF.format(new Date(olf.start))+" to "+tempDF.format(new Date(olf.end))+ " - "+olf.size+" bytes\n");
}
}
