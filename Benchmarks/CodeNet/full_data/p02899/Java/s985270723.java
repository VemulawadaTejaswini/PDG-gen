import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b[] = new int[a+1];
    int c[] = new int[a+1];
    for(int i = 1;i < b.length;i++){
      b[i] = sc.nextInt();
    }
    for(int j = 1;j < b.length;j++){
      c[b[j]] = j;
    }
    for(int x = 1;x < b.length;x++){
      System.out.print(c[x]+ " ");
    }
  }
}