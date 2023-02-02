//130
public class func{
	public void checkAll(String scope){
    while((line = in.readLine()) != null) {
      String out = normalizers.normalize(line, scope);
      System.out.println(out);
    }
}
}
