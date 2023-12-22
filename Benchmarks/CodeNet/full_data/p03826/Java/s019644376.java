import java.util.Scanner;
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
long a=sc.nextInt();
long b=1;
for(int i=1;i<=a;i++){
b*=i;
}
a=0;
for(int i=1;i<=b;i++){
	if(b%i==0){
		a++;
	}
}
b=a%10000000007L;
System.out.println(b);
}
}