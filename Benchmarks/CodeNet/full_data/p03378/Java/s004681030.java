import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();
    int[] ary = new int[n+1];
    int left = 0;
    int right = 0;

    for(int i = 0; i < m; i++){
      ary[i] = sc.nextInt();
      if(ary[i] < x){left++;}
      else{right++;}
    }

    System.out.println(Math.min(left, right));

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
