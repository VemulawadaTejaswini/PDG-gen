import java.util.*;

public class Main{
    static int parity = -1; 
    public static void printminusbinary(int n){
	parity *= -1;
	if(n == 0) return;
	printminusbinary((n - parity * Math.abs(n) % 2) / 2);
	System.out.print(Math.abs(n) % 2);
}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
	if(N == 0){
	    System.out.println("0");
	}
	else{
	printminusbinary(N);
	System.out.println("");
	}
    }
}
        
