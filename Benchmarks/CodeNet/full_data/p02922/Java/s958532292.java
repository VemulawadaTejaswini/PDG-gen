import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a,b,sum,count;

    a = sc.nextInt();
    b = sc.nextInt();
    sum = a;
    count = 1;
    while(sum < b){
      sum += (a - 1);
      count++;
    }

    System.out.println(count);
  }
}
