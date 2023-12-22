import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int num = b/a;
    int result = 0;
    int check = (b - (a*num-num+1));
    if(check > a){
      result = num + (check/a)+1;
    } else if(check != 0 && check < a){
      result = num +1;
    } else if(check == 0){
      result = num;
    }
    System.out.println(result);
  }
}