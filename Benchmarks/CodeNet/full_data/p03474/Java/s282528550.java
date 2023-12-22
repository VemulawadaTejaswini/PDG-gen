import java.util.Scanner;
 
class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	String s = scan.next();
	if(s.length() != a+b+1){
	    System.out.println("No");
	    return;
	}
	for(int i = 0; i < a; i++){
	    if('0' <= s.charAt(i) && s.charAt(i) <= '9'){
	    }else{
		    System.out.println("No");
		    return;
	    }
	}
	if(s.charAt(a) != '-'){
	    System.out.println("No");
	    return;
	}
	for(int i = a+1; i < s.length(); i++){
	    if('0' <= s.charAt(i) && s.charAt(i) <= '9'){
	    }else{
		    System.out.println("No");
		    return;
	    }
	}
	    System.out.println("Yes");
    }
}