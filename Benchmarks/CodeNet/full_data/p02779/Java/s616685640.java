import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
  		int[] a=new int[n];
		for(int c=0;c<n;c++){
    		a[c]=sc.nextInt();
    	}
  		String ans="YES";
  		Arrays.sort(a);
  		for(int d=0;d<n-1;d++){
        	if(a[d]==a[d+1]){
              	ans="NO";
            	break;
            }
        }
    
 	

    	System.out.println(ans);
    }
}