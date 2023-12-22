import java.util.*;

public class Main {
  public static void main(String[] args ) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int T = sc.nextInt();
    int A = sc.nextInt();
    
    double min = Double.MAX_VALUE;
    int ret = -1;
      
    for(int i = 0; i< N ; i++){
      double temp = Math.abs(A-(T-sc.nextInt()*0.006));
      if(min>temp){
        min = temp;
        ret = i+1;
      }
    }
    System.out.println(ret);
  }
}