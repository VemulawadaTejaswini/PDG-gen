import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int max = 0;
    int sum = 0;
    int temp;
    int n = stdIn.nextInt();
    
    for(int i = 0; i < n; i++){
      temp = stdIn.nextInt();
      max = Math.max(temp, max);
      sum += temp;
    }
    
    System.out.println(sum - max / 2);
    stdIn.close();
  }
}