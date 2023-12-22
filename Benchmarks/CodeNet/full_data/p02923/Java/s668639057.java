import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
     Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int Nums[]=new int[A];
    int count=0;
      for(int i=0;i<A;i++){
     	Nums[i]=sc.nextInt();
       if(i>0&&Nums[i-1]>=Nums[i]){
       		count++;
       } else if(i>0&&Nums[i-1]<Nums[i]){
       		count=0;
       }
     }
    System.out.println(count);
  }
}