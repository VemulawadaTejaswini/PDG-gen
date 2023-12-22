import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int x=sc.nextInt();
	int a=sc.nextInt();
	int b=sc.nextInt();

	a=Math.abs(a-x);
	b=Math.abs(b-x);
if(a<b){
	System.out.println("A");
}else{System.out.println("B");}
	}}