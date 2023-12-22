import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int sum = 0;
    String str[] = String.valueOf(n).split("");
    for (int i=0 ; i < str.length ; i++){
        sum += Integer.parseInt(str[i]);
    }
        System.out.println(n%sum==0?"Yes":"No");
  }
}