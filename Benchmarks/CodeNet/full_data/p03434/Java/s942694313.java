import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a1 = new int[n];
    for(int i = 0; i < n; i++){
      a1[i] = sc.nextInt();
    }
    Arrays.sort(a1);//綺麗にする
    int a = 0;
    int b = 0;
    int flag = 0;
    for(int i = a1.length-1; i >= 0; i--){
      if(flag == 0){
        a = a + a1[i];
        flag = 1;
      }else{
        b = b + a1[i];
        flag = 0;
      }
    }
    System.out.println(a-b);

  }
}
