import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int num   = sc.nextInt();
    int day   = sc.nextInt();
    int choco = sc.nextInt();
    int eat   = 0;
    
    for(int i = 0 ; i < num ; i++){
      int element = sc.nextInt();
      for(int j = 0 ; j < day ; j++){
        int ans = j * element + 1;

        if(ans <= day){
          eat++;
        }else{
          continue;
        }
      }
    }
    System.out.println(eat + choco);
  }
}