import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i = 0;i<n;i++){
      a[i] = sc.nextInt();
    }
    int count = 0;
    int check = 0;
    while(count == check){
      check++;
      for(int i = 0;i<n;i++){
        if(a[i] % 2 == 0){
          a[i] = a[i] / 2;
        }else{
          check -=3;
          break;
        }
      }
      count++;
    }
    count--;
    System.out.println(count);
  }
}
