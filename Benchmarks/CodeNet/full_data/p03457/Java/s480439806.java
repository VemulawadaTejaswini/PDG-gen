import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
  		int keit=0;
		int keix=0;
  		int keiy=0;
  
		for(int c=0;c<n;c++){
    		 int t=sc.nextInt();
          	 int x=sc.nextInt();
          	 int y=sc.nextInt();
          if(t%2==1&&(x+y)%2==0){
          ans++;
          break;
          }else if(t%2==0&&(x+y)%2==1){
          ans++;
          break;
          }else if((Math.abs(x-keix)+Math.abs(y-keiy))>t-keit){
          ans++;
           break;
          }
          keix=x;
          keiy=y;
          keit=t;
    	}
    
 	if(ans==0){
    		System.out.println("Yes");
    	}else{
     		System.out.println("No");
   	 }

    }
}
