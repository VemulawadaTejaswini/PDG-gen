public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			if(str.length() > 1200) {
			}
			StringBuilder b1 = new StringBuilder(str);
			for(int i=0; i < str.length(); i++) {
				if( Character.isUpperCase(str.charAt(i))){ 
				    b1.replace(i,i+1,String.valueOf(str.charAt(i)).toLowerCase() );
				}
				else {
				   b1.replace(i,i+1,String.valueOf(str.charAt(i)).toUpperCase() );
				}
			}
			String t = b1.toString();
			System.out.println(t);
		}catch(IOException e) {
			System.out.println("Exception : " + e);
		}
	}
}
