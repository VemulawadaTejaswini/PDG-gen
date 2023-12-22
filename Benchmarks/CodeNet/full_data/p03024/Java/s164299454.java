    import java.util.*;
    public class Main {// Main
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
          String s = sc.next();
          int n = s.length();
          int win = 15-n;
          for(int i=0;i<n;i++){
          if(s.substring(i,i+1).equals("o")){ win++; }
          }
          if(win>=8) System.out.println("YES");
          else System.out.println("NO");
        }
    }							