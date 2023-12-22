import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] l = new int[n];
    int sum = 0;
    for(int i = 0; i < n; i++){l[i] = sc.nextInt();}
    Arrays.sort(l);
    for(int i = n-1; i > n-1-k; i--){
      sum += l[i];
    }
    System.out.println(sum);
  }
}

/*
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String blank = sc.nextLine();
String s = sc.nextLine();
System.out.println();
System.exit(0)
*/
