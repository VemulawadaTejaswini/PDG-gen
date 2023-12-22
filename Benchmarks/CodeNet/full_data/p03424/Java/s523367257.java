import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ans = "Three";
        String Y = "Y";
        int N = sc.nextInt();
        for(int i =0;i<N;i++){
          String S = sc.next();
          if(S.equals(Y)){
            ans = "Four";
          }
        }
              System.out.println(ans);
    }
}