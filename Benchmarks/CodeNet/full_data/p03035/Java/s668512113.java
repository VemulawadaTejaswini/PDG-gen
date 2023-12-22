import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	if(A>=13){
	    System.out.print(B);
	}else if(A>=6 && A<=12){
	    System.out.print(B/2);
	}else{
	    System.out.print(0);
	}
    }
}
