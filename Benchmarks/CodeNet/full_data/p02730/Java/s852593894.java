import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	String S = stdIn.next();
	int N = S.length();
	String mae = S.substring(0,N/2);
	String ato = S.substring(N/2+1,N);
	if(mae.equals(ato)){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}
