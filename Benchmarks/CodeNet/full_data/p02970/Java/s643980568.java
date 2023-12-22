import java.util.*; 
 
class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
  		int c=0;
		int ans=0;
  
		while(c<n){
          c+=d*2+1;
          ans++;
    		
    	}
    
    	System.out.println(ans);
    }
}