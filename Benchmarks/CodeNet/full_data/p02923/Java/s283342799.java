import java.util.*;

class Main{
	public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      int N=in.nextInt();
      int H[]=new int[N];
      
      for(int i=0;i<N;i++){
      	H[i]=in.nextInt();
      }
      
      int res=0;
      int curr=0;
      for(int i=1;i<N;i++){
      	if(H[i]<=H[i-1]){
          curr++;
        }
        else{
        	res=Math.max(res, curr);
            curr=0;
        }
      }  
      res=Math.max(res, curr);
      System.out.println(res);
      in.close();
    }
}