import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
  		int c500=a/500;
		a=a-c500*500;
  		int c5=a/5;
  		long ans=c500*1000+c5*5;
  	
    	System.out.println(ans);
    }
}