public class Main {
	 public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	String a=scanner.next();
	String b=scanner.next();
	for (int i = 0; i < a.length(); i++) {
	    String str1 = String.valueOf(a.charAt(i));
	    String str2 = String.valueOf(b.charAt(i));
	    if(str1.equals(str2)){
	    	if(i==a.length()-1) {
	    		System.out.println("Yes");
	    		break;
	    	}
        }
	    else {
	    	System.out.println("No");
	    	break;
	    }
	}}
}
