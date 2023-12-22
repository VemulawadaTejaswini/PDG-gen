import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int ans=0;
	 if(Math.abs(a-b)%2==1){
	 ans=1;
	 }
	 else{
	 ans=2;
	 }
	System.out.println(ans==1?"YES":"NO");
}
}