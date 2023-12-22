import java.util.*;
public class Main{
	static long[][] aa;
  	static long maxx(int[] h,int[] b,int ind,int flag){
    	if(ind>=b.length){return 0;}
      	if(aa[ind][flag]!=-1){return aa[ind][flag];}	
      
      	if(flag==0){
        	long maxs=0;
          for(int j=0;j<b.length;j++){
            if(maxs>h.length-j+1){break;}
            maxs=Math.max(maxx(h,b,j+1,1)+(long)b[j],maxs);
          }
          
          return aa[ind][flag]=maxs; 
        }
      	else{
        	long maxs=0;
          for(int j=ind;j<h.length;j++){
            if(maxs>h.length-j+1){break;}
          	if(h[j]>h[ind-1]){
                  maxs=Math.max(maxs,maxx(h,b,j+1,1)+b[j]);
            }
          }
          return aa[ind][flag]=maxs;
        }
    }

  public static void main(String[] args){
  		Scanner s=new Scanner(System.in);
    	int n=s.nextInt();
    	int[] h=new int[n];
    	int[] b=new int[n];
    	for(int j=0;j<n;j++){
        	h[j]=s.nextInt();
        }
    	for(int j=0;j<n;j++){
        	b[j]=s.nextInt();
        }
    	aa=new long[n][2];
    	for(int j=0;j<n;j++){
        for(int i=0;i<2;i++){
        	aa[j][i]=-1;
        }
        }
    	
  		System.out.println( maxx(h,b,0,0));
  }
  

}