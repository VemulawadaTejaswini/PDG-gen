public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s,r = "";
		s = sc.next();
        for(int i=s.length()-1;i>=0;i--){
        	 r += String.valueOf(s.charAt(i));
        }
         System.out.println(r);
	}
}
