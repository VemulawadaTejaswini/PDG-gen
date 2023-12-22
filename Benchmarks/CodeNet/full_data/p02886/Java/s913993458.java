import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int Nums[]=new int[A];
    int sum=0;
    for(int i=0;i<A;i++){
    	Nums[i]=sc.nextInt();
    }
    for(int i=0;i<A;i++){
      for(int j=0;j<A;j++){
        if(j>i){
        	sum+=Nums[j]*Nums[i];
        }
      }
    }
    System.out.print(sum);
  }
}
