public class A{
	//...
	public static void main(){
		String key = it.next();
		query += encode(key) + "=" + encode(queryMap.get(key));
	}
}