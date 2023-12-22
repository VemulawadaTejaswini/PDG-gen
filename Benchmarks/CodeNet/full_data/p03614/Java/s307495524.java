import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N = scanner.nextInt();
    int cnt = 0;
    for(int i = 1;i <= N;i++){
      if(scanner.nextInt() == i){
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
        
