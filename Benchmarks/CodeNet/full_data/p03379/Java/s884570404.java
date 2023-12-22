import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x[] = new int [n];
    for(int i = 0;i < n;i++){
      x[i] = sc.nextInt();
    }

    int a[] = new int [n];
    a = x.clone();
    Arrays.sort(a);
    for(int i = 0;i < n;i++){
      if(x[i] < a[n/2]){
        System.out.println(a[n/2]);
      }else{
        System.out.println(a[n/2 - 1]);
      }
    }
  }
}