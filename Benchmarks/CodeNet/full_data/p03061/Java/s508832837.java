import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int[] num = new int[n];
      	for(int i=0;i<n;i++){
        	num[i] = scan.nextInt();
        }
      	int[] gcdi = new int[n];
      	for(int i=0;i<n;i++){
        	gcdi[i] = gcds(num,i);
        }
      
      	System.out.println(max(gcdi));
      
    }
  	static int gcd(int a, int b){
      	int tmp;
        while ((tmp = a % b) != 0) {
            a = b;
            b = tmp;
        }
      	return b;
    }
  	static int gcds(int[] a,int leng){
      	int ans;
      	if(leng == 0){
      		 ans = a[1];
        } else {
        	 ans = a[0];
        }
      	for(int i=0;i<leng;i++){
        	ans = gcd(ans,a[i]);
        }
        for(int i=leng+1;i<a.length;i++){
        	ans = gcd(ans,a[i]);
        }
          return ans;
    }
  	static int max(int[] a){
    	int ans = a[0];
      	for(int i=0;i<a.length;i++){
     		if(ans < a[i]){
            	ans = a[i];
            } 
        }
      	return ans;
    }
}