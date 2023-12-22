import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int x = sc.nextInt();

    int data[] = new int[n];
    int[] data2 = new int[n];
    int count = 0;

    for (int i  = 0;i<n ;i++ ) {
      data[i] = sc.nextInt();
    }

    data2[0] = data[0];

    for (int i = 1;i<n ;i++ ) {
      data2[i] = data2[i-1]+data[i];
    }

    for (int i = 1;i<n ;i++ ) {
    if (data2[0]<x) {
      count++;
    }
    }
    System.out.println(count+1);


  }
}
