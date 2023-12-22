import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        long ans=0;
        long sum=0;

		while(sum<x){
        ans++;
        sum+=ans;
        }
    

    	System.out.println(ans);
    }
}
