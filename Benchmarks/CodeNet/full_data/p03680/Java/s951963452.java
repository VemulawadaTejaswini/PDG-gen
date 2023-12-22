import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int cnt = 0;
    int next = 0;
    boolean flag = false;

    for(int i = 0; i < n; i++){a[i] = sc.nextInt();}

    if(a[0] == 2){cnt = 1; flag = true;}

    while(cnt < n && flag == false){
      next = a[next] - 1;
      cnt++;
      if(a[next] == 2){
        cnt++;
        flag = true;
        break;
      }
    }

    if(flag){System.out.println(cnt);}
    else{System.out.println(-1);}
  }
}