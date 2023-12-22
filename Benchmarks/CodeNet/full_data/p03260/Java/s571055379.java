import java.util.Scanner;

public class Test {
	
	public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	int a=0,b=0,sum=0;	
	a = in.nextInt();	
	b= in.nextInt();
	if(a==b & a%2==0){
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}
	if((a-b==1 || a-b==-1)&& (a*b*a)%2==0 ){
		System.out.println("Yes");
		
		
	}else{
		System.out.println("No");
	}
	if((a-b==2 || a-b==-2)&& ((a*b*a)%2==0 )||((a*b*a)%2==0 )||((a*b*b)%2==0 )||((a*b*(b-1))%2==0 )||((a*b*(b+1))%2==0 )||((a*b*(a-1))%2==0 )||((a*b*(a+1))%2==0 )){
		System.out.println("Yes");
		
		
	}else{
		System.out.println("No");
	}
	
}


	
}
//#17024799 | chen_fei's solution for [AtCoder-4250] [Problem A]