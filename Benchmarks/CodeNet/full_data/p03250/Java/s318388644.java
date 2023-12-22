import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
int max=a;
if(max<b){
max=b;
}
if(max<c){
max=c;
}
if(max==a){
a=0;
}
else if(max==b){
b=0;
}
else if(max==c){
c=0;
}
System.out.println(max*10+a+b+c);
}
}