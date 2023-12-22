import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
      String S = sc.next();
      int lose = S.replaceAll("o","").length();
      
      if(lose < 8) {
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }        
    }
}