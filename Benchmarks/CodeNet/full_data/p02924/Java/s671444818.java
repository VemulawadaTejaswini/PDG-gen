import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 整数の入力
	int num = Integer.parseInt(sc.nextLine());
    int count = 0;
    for(int i = 1; i <= num - 1; i++){
      count += i;
    }
    
    System.out.println(count);
    
  }
}