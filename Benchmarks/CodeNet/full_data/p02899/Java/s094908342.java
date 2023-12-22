import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int Nums[]=new int[A];
    int School[]=new int[A];
    int B=1;
    int C=0;
    int count=1;
    int i;
    for( i=0;i<A;i++){
    	Nums[i]=sc.nextInt();
    }
     while(C<A){
     	for( i=0;i<A;i++){
    		if(Nums[i]==B){
        	School[C]=count;
          	break;
        	}else{
            	count++;
            }
   		 }
       B++;
       C++;
       count=1;
     }
    for(int num: School){
    	System.out.print(num+" ");
    }
  }
}