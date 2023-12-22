import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
	int B = stdIn.nextInt();
	int C = stdIn.nextInt();
	if((a==B&&A==C)||(a!=B&&a!=C&&B!=C)){
	    System.out.println("No");
	}else{
	    System.out.println("Yes");
	}
    }
}