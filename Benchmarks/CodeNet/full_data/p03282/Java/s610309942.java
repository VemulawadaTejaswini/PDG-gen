import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
      String s[]=line.split("",0);
      int i=0;
      while(s[i].equals("1")){
      	i++;
      }
      int n=Integer.parseInt(s[i]);
        System.out.println(n);
    }
}