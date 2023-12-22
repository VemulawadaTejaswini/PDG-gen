import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	int a = stdIn.nextInt();
	int b = stdIn.nextInt();
	int c = stdIn.nextInt();
	int d = stdIn.nextInt();
	int ab=a-b;
	int bc=b-c;
	int ac=a-c;
	if(Math.abs(ab)<=d&&Math.abs(bc)<=d){
	    System.out.println("Yes");
	}else if(Math.abs(ac)<=d){
	    System.out.println("Yes");	    
	}else{
	    System.out.println("No");
	}
    }
}
