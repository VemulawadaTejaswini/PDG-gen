import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner s=new Scanner (System.in);
      int l=s.nextInt();
      int r=s.nextInt();
      if(r-l+1>=2019){
      	int max=0;
        for(int i=0;i<2019;i++){
        	for(int j=0;j<2019;j++){
            	if(i!=j)max=Integer.max(max,(i*j)%2019);
            }
        }
        System.out.println(max);
      }else{
        int max=0;
      	for(int i=l;i<=r;i++){
        	for(int j=l;j<=r;j++){
            	if(i!=j){
                	int left=i%2019;
                  int right=j%2019;
                  max=Integer.max(max,(left*right)%2019);
                }
            }
          System.out.println(max);
        }
      }
        
    }
      
}