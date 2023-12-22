import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String a = scan.next();
	String b = scan.next();

	if(a.charAt(0) == 'H'){
	    if(b.charAt(0) == 'H'){
		System.out.println("H");
	    }else{
		System.out.println("D");
	    }
	}else{
	    if(b.charAt(0) == 'D'){
		System.out.println("H");
	    }else{
		System.out.println("D");
	    }
	}
    }
}
