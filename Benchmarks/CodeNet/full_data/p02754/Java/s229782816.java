import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long a=sc.nextLong();
		long b=sc.nextLong();
		long s=n/(a+b);
  		long ama=n%(a+b);

  		long ans=s*a;
    
 	if(ama>=a){
    		ans+=a;
    	}else{
     		ans+=ama;
   	 }

    	System.out.println(ans);
    }
}