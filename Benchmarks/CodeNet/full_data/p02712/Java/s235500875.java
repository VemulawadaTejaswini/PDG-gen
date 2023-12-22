import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int count = 1;
    long sum = 0;
    int i = 1;

    do{
      if(i%3!=0&&i%5!=0){
        sum += i;
      }
      count +=1;
      i++;
    }while(count<=n);

    System.out.println(sum);

  }
}