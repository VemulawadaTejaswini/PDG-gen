import java.util.*;
public class Main{
	public static void main(String sp[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String st = String.valueOf(n);
long total=0;
if(n<10){
	System.out.println(n);
}
else if(n<100){
	System.out.println(9);
}
else if(n<1000){
	System.out.println(9+(n-100+1));
}
else if(n<10000){
	System.out.println(910);
}
else if(n<100000)
	System.out.println(9+900+(n-10000+1));
else System.out.println(9+900+(n-10001+1));
}
}
