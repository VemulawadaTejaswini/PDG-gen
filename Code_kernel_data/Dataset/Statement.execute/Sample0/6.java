//5
public class func{
	public void createTestTable(String name,String signature,String src){
        Statement s = createStatement();
        s.execute(CT+name+signature);
        s.execute(insertFrom(name, src));
        s.close();
}
}
