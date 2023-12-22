import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];
    for(int i= 0; i < n; i++){
      array[i] = sc.nextInt();
    }
    String s = "DENIEED";
    for(int i=0;i < n;i++){
      if(array[i] % 3 == 0) s = "APPROVE";
      if(arrau[i] % 5 == 0) s = "APPROVE";
    }
    System.out.println(s);
  }
}