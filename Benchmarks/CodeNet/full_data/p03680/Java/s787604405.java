import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n+1];
    int cnt = 1;
    boolean flag = false;

    for(int i = 0; i < n; i++){a[i] = sc.nextInt();}
    int next = a[0];
    for(int i = 0; i < n; i++){
      next = a[next-1];
      cnt++;
      //System.out.println("next:" + next + ",,," + "cnt:" + cnt);
      if(next == 2){flag = true; break;}
    }

    if(flag){System.out.println(cnt);}
    else{System.out.println(-1);}
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
