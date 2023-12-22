import java.util.*;
class Main{
	public static void main(String [] args){
    	Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
      	long mod = (long)(1e9)+7;
      	int freq[] = new int[n];
      	for(int i = 0; i< n ; i++){
        	freq[in.nextInt()]++;
        }
      	int chalu = n-1;
      	for(int i = chalu; i>0;i-=2){
        	if(freq[i]!=2){
            	System.out.println("0");
              	return;
            }
          	if(freq[i-1]!=0){
            	System.out.println("0");
              	return;
            } 
        }
      	if(n%2!=0){
        	if(freq[0]!=1){
            	System.out.println("0");
              	return;
            }
        }
      	else{
        	if(freq[0]!=0){
 				System.out.println("0");
              	return;           
            }
        }
      	long x = n/2;
      	System.out.println(power(2,x,mod));
    }
  	
    public static long power(long i,long j , long mod){
        if(j==0){
            return 1;
     }
        if(j%2==0)return (power(i,j/2,mod)%mod)*(power(i,j/2,mod)%mod);
        else return ((power(i,j/2,mod)%mod)*(power(i,j/2,mod)%mod)*i)%mod;
    }
}