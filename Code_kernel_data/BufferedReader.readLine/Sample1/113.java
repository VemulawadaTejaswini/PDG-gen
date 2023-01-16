//112
public class func{
	public void readAll(final BufferedReader in,final boolean split){
       while ((record=in.readLine()) != null) {
           count++;
           fields+= split ? record.split(",").length : 1;
       }
       return new Stats(count, fields);
}
}
