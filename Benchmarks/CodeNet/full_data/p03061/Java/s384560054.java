import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n= scan.nextInt();
      	int[] num = new int[n];
      	int[] gcdi = new int[n];
      	int[] gcdj = new int[n];
      	int[] gcds = new int[n];
      
      	for(int i=0;i<n;i++){
        	num[i] = scan.nextInt();
        }
      	gcdi[0] = num[0];
      	for(int i=1;i<n;i++){
        	gcdi[i] = gcd(gcdi[i-1],num[i]);
        }
      	gcdj[n-1] = num[n-1];
      	for(int i=2;i<n+1;i++){
        	gcdj[n-i] = gcd(gcdj[n-i+1],num[n-i]);
        }
      	gcds[0] = gcdj[1];
      	for(int i=1;i<n-1;i++){
        	gcds[i] = gcd(gcdi[i-1],gcdj[i+1]);
        }
      	gcds[n-1] = gcdi[n-2];
      	
      
      	System.out.println(max(gcds));
    }
  	static int gcd(int a, int b){
		int tmp;
      	while((tmp = a%b) != 0){
        	a = b;
            b = tmp;
        }
      	return b;
    }
  	static int max(int[] a){
    	int max=a[0];
      	for(int i=0;i<a.length;i++){
        	if(max < a[i]){
            	max = a[i];
            }
        }
      	return max;
    }
}