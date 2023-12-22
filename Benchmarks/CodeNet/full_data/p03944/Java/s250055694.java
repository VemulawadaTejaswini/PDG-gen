import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int w=sc.nextInt();
		
		int h=sc.nextInt();
		
		int n=sc.nextInt();
		
		int l=0,r=w;
		int t=h,d=0;
		
		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			int a=sc.nextInt();
			//System.out.println(a);
			if(a==1){
				
				l=Math.max(x, l);
			}else if(a==2){
				r=Math.min(x, r);
			}else if(a==3){
				d=Math.max(d, y);
			}else if(a==4){
				t=Math.min(t, y);
			}
			
			
			
			
		}
		int sum=(r-l)*(t-d);
		if(sum<0){
			System.out.println("0");
		}else{
			System.out.println(sum);
		}
				
		
	}

}
