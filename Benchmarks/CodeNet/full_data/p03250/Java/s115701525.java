import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n[] = new int[3];
    for(int i = 0;i<3;i++){
      n[i] = sc.nextInt();
    }
    Array.sort(n);
    int a = n[2] * 10 + n[1] + n[0];
    System.out.println(a);


  }
}
