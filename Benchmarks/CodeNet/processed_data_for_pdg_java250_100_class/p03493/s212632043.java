public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		String s =scan.next();
		char[] charArray1; 
            charArray1 = new char[3]; 
            charArray1[0] =s.charAt(0); 
            charArray1[1] =s.charAt(1);
            charArray1[2] =s.charAt(2);
        if(charArray1[0]=='1') {
            count++;
        }
        if(charArray1[1]=='1') {
            count++;
        }
        if(charArray1[2]=='1') {
            count++;
        }
        System.out.println(count);
	}
}
