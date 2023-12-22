import java.util.*;
public class Main{
	static long[] aa;
  static long maxx(int[] arr,int ind){
  	if(ind>=arr.length){
      return Integer.MAX_VALUE;
    }
    if(ind==arr.length-1){ return 0; } 
    if(aa[ind]!=-1){return aa[ind];}
    if(ind+2<arr.length){
      return aa[ind]=Math.min(maxx(arr,ind+1)+Math.abs(arr[ind]-arr[ind+1]),
                              maxx(arr,ind+2)+Math.abs(arr[ind]-arr[ind+2]) );
    } else{
    	return aa[ind]=maxx(arr,ind+1)+Math.abs(arr[ind]-arr[ind+1]);
    }
    
    
  }
  
  public static void main(String[] args){
  	Scanner s=new Scanner(System.in);
    //int t=s.nextInt();
   // for(int j=0;j<t;j++){
    	int n=s.nextInt();
        int arr[]=new int[n];
      for(int i=0;i<n;i++){
      		arr[i]=s.nextInt();
      }
      aa=new long[n];
      Arrays.fill(aa,-1);
      System.out.println( maxx(arr,0)); 
   // }
    
    
  }

}