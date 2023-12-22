import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    char[] c = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    for(int i = 1;i <= h;i++){
      for(int j = 0;j<=w-1;j++){
        String s = sc.next();
        if(s.equals("snuke"))System.out.println(String.valueOf(c[j])+String.valueOf(i));
      }
    }
  }
}