import java.util.Scanner;
class ABC112_A {
    public static void main(String args[]){

	Scanner scan = new Scanner(System.in);

	int a,b;
	int n = scan.nextInt();

	if(n == 1){
	    System.out.println("Hello World!");
	} else {
	    a = scan.nextInt();
	    b = scan.nextInt();
	    System.out.println(a+b);
	}
    }
}
