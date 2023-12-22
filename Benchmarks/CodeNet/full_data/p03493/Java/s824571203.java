import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String[] input = sc.next().split("");
    int cnt=0;
    int a = Integer.parseInt(input[0]);
    int b= Integer.parseInt(input[1]);
    int c= Integer.parseInt(input[2]);
    if(a==1){
      cnt++;
    }
    if(b==1){
      cnt++;
    }
    if(c==1){
    cnt++;
    }
    System.out.println(cnt);
  }
}