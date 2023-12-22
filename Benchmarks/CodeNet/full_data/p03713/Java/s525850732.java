import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int result=0;
		if((x%3==0)||(y%3==0)){
			System.out.println(result); return;
		}
		
		int area1=0;
		int area2=0;
		int area3=0;
		
		if(differ((x/3)*(double)y,(double)(x*y)/3)<differ((y/3)*(double)x,(double)(x*y)/3)){
			area1=(x/3)*y;
			x=x-x/3;
		}else{
			area1=(y/3)*x;
			y=y-y/3;
		}
		
		if((x%2==0)||(y%2==0)){
			area2=x*y/2;
			result=(int) differ(area1,area2);
			System.out.println(result);
			return;
		}
		
		if(differ((x/2)*(double)y,(double)(x*y)/2)<differ((y/2)*(double)x,(double)(x*y)/2)){
			area2=(x/2)*y;
			area3=x*y-area2;
		}else{
			area2=(y/2)*x;
			area3=x*y-area2;
		}
		
		result=Math.max((int) differ(area1,area2),(int) differ(area1,area3));
		result=Math.max(result,(int) differ(area2,area3));
		
		System.out.println(result);
		
		
	}
	
	public static double differ(double x,double y){
		if(x>y) return x-y;
		return y-x;
	}
	
}