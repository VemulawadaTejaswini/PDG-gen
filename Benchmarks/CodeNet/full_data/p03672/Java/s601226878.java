import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int i = 2;
    boolean flag = false;
    int cnt = 0;
    int ans = 0;

    while(false || cnt < s.length()/2){
      String s1 = s.substring(0, (s.length()-i)/2);
      String s2 = s.substring((s.length()-i)/2, s.length()-i);
      //System.out.println(s1);
      //System.out.println(s2);
      if(s1.equals(s2)){
        flag = true;
        ans = s1.length() * 2;
        break;
      }
      i+=2;
      cnt += 2;
    }

      System.out.println(ans);
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
