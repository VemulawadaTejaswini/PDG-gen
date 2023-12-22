import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long c1[] = new long[10000];
    long c2[] = new long[10000];
    long a=Long.MAX_VALUE;
    int g = 0;
    
    for(long i=1;i<(long)Math.sqrt(n)+1;i++){
    	if(n%i==0){
        	c1[g]=i;
          	c2[g]=n/i;
          	g++;
        }
    }
    
    for(int j=0;j<g;j++){
      a = Math.min(a,c1[j]+c2[j]-2);
    }
    System.out.println(a);
  }
}
