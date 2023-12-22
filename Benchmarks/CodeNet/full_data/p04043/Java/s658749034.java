import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num[] = new int[3];
    for (int i = 0; i < 3; i++){
      num[i] = sc.nextInt();
    }
    Arrays.sort(num);
    System.out.println(num[0]==5 && (num[1]==5 && num[2]==7) ? "YES" : "NO");
  }
}