import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        String S1 = stdIn.next();
	String S2 = stdIn.next();
	String S3 = stdIn.next();
	if(S1.equals(S2)&&S1.equals(S3)){
	    System.out.println("No");
	}else{
	    System.out.println("Yes");
	}
    }
}
