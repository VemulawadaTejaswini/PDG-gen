import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long[] nums=new long[4];
  	for(int i=0;i<4;i++){
  		nums[i]=sc.nextLong();
  	}
  	long e,g=0;
  	long n1=nums[2],n2=nums[3];
  	
  	while(g==0){
  		if(n2%n1==0){
  			g=n1;
  		}else{
  			e=n1%n2;
  			n1=n2;
  			n2=e;
  		}
  	}
  			
  	long f=(nums[1]-(nums[1]/nums[2]+nums[1]/nums[3]-nums[1]/(nums[2]*nums[3]/g)))-(nums[0]-1-((nums[0]-1)/nums[2]+(nums[0]-1)/nums[3]-(nums[0]-1)/(nums[2]*nums[3]/g)));
  	System.out.print(f);
  }
}