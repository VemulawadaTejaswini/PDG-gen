import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    
    int N6 = N / 100000 % 10;
    int N5 = N / 10000 % 10;
    int N4 = N / 1000 % 10;
    int N3 = N / 100 % 10;
    int N2 = N / 10 % 10;
    
    int result = 0;
    if(N6 == 1){
      result = 90909;
    } else if(N5 != 0){
      result = (N - 9999) + 909;
    } else if(N4 != 0){
      result = 909;
    } else if(N3 != 0){
      result = (N - 99) + 9;
    } else if(N2 != 0){
      result = 9;
    } else {
      result = N;
    }
    
    System.out.println(result);
  }
}
