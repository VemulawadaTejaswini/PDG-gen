import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
  	long a=0;
  	long b=0;
    for(long c=1;(c*c)<=n;c++){
    if(n%c==0){
    a=n/c;
    b=c;
    }
    }
    
     System.out.println(a+b-2);
    
    }
}
