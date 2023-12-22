import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int[][] shop = new int[N][2];
      for(int i=0;i<N;i++){
    	  shop[i][0] = sc.nextInt();
    	  shop[i][1] = sc.nextInt();
      }
      int[] check = new int[N];
      int min=shop[0][0];
      int totalnum=0;
      int totalmon=0;
      int place=0;
      while(M!=totalnum){
      for(int j=0;j<N;j++){
    	  place=0;
    	  if(shop[j][0]==0){
    		  continue;
    	  }
    	  if(shop[j][0]<min){
    		  min=shop[j][0];
    		  place=j;
    	  }
      }
    	  for(int x=0;x<shop[place][1];x++){
    		  if(M==totalnum){
    			  break;
    		  }
    		  totalmon+=shop[place][0];
    		  totalnum++;
    	  }
    	  shop[place][0]=0;
      }
      System.out.println(totalmon);
    }
}