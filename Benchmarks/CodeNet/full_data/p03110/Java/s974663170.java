import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
      	double in = 0;
      
      for(int i=0;i<N;i++){
        in+=sc.nextDouble()*(sc.next().equals("JPY")?1:380000.0);
      }
 		System.out.print(in);
    }
}