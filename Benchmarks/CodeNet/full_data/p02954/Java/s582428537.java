import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
        char[] cs = sc.next().toCharArray();
        int[] l = new int[cs.length];
        int[] r = new int[cs.length];
        
        int c = 0;
        for (int i = 0; i < cs.length; i++) {
            if(cs[i] == 'L') {
                r[i-1] = c;
                c = 0;
            }
            if(cs[i] == 'R') {
                c++;                
            }
        }
        c = 0;
        for (int i = cs.length-1; i > 0; i--) {
            if(cs[i] == 'R') {
                l[i+1] = c;
                c = 0;
            }
            if(cs[i] == 'L') {
                c++;                
            }
        }

        for (int i = 0; i < cs.length; i++) {
            if(r[i] > 1 && cs[i] == 'R') {
                int tmp = r[i]; 
                r[i] = r[i]/2  + r[i]%2;
                r[i+1] = tmp - r[i];
            }
        }
        for (int i = cs.length-1; i > 0; i--) {
            if(l[i] > 1 && cs[i] == 'L') {
                int tmp = l[i]; 
                l[i] = l[i]/2  + l[i]%2;
                l[i-1] = tmp - l[i];
            }
        }
//        for (int i = 0; i < r.length; i++) {
//            System.out.print(r[i]);
//        }
//        System.out.println("");
//        for (int i = 0; i < l.length; i++) {
//            System.out.print(l[i]);
//        }
      for (int i = 0; i < r.length; i++) {
          System.out.print(r[i]+l[i]);
          if(i != r.length -1) System.out.print(" ");
      }
        System.out.println("");
        

    }
}