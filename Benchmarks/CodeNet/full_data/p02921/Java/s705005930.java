import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
      //入力
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      String[] s1 = s.split("");
      String t = sc.next();
      String[] t1 = t.split(""); 
      
      int count = 0;
      for (int i=0; i<3; i++) {
        if (s1[i].equals(t1[i])) count ++;
      }
      
      System.out.println(count);
      
    }
      
}

