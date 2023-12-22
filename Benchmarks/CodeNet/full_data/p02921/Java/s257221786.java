    import java.util.Scanner;
    public class Main {
      public static void main(String[] args) {
        Scanner scan = new.Scanner(System.in);
        String S = scan.nextString();
        String T = scan.nextString();
        char s[] = S.toCharArray;
        char t[] = T.toCharArray;
        for(i=0; i<3; i++){
          if(s[i] == t[i])
            ans++
        }
        System.out.println(ans);
      }
    }