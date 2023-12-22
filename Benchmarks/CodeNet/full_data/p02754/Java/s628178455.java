import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
int n =sc.nextInt();
int a= sc.nextInt();
int b =sc.nextInt();
int res;
if(a==0&&b==0){
	res=0;
}
else{
res=n/(a+b)*a;
if(n%(a+b)<=a){
	res=res+n%(a+b);
}
else{
	res=res+a;
}
}
System.out.println(res);
}
}