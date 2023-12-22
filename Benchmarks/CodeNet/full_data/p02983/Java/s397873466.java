import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int L = sc.nextInt();
    int R = sc.nextInt();

    int min = 2019;
    
    for(int i = L; i < R ; i++){
      for(int m = i + 1;m <= R ; m ++){
        int a = i * m;
        int mod = a % 2019;
        if(mod < min ){
          min = mod;
        }
      }
    }
    System.out.println(min);
  }
}