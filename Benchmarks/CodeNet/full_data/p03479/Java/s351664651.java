import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        long y=sc.nextLong();
  		long ans=1;
  
  		while(y>x){
         if(y>=x*2){
         x*=2;
         ans++;  
         }else{
         break;
         }
        }
    

    	System.out.println(ans);
    }
}

