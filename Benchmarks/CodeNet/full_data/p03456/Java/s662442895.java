import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String a = scan.next();
	String b = scan.next();

	String sq = a + b;
	int n = Integer.parseInt(sq);

	int sqrt = (int)Math.sqrt(n);

	if(Math.pow(sqrt, 2) == n){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}
