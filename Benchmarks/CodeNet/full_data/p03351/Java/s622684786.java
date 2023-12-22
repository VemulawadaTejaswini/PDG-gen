import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		// 整数の入力


int a= sc.nextInt();
int b= sc.nextInt();
int c= sc.nextInt();
int d= sc.nextInt();

int max=a;
int min=a;

if(max<b){
	max=b;
}
if(max<c){
	max=c;
}
if(min>b){
	min=b;
}
if(min>c){
	min=c;
}
int mid =a+b+c-(min+max);

if(max==b || min==b){
	if(mid-min<=d){
			System.out.println("Yes");
	}else{
			System.out.println("No");
	}
}else{
	if(max-b<=d && b-min<=d){
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}
}
}
}