import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new StringBuilder(sc.nextLine()).reverse().toString();
        sc.close();

        String[] t = {"dream", "dreamer", "erase", "eraser"};
        StringBuilder[] sb = new StringBuilder[t.length];
        for(int i=0; i<t.length; i++) {
            sb[i] = new StringBuilder(t[i]).reverse();
        }

        boolean isFound = false;
        while(true) {
            for(StringBuilder str: sb) {
                if(s.indexOf(str.toString()) == 0) {
                    s = s.replace(str.toString(),"");
                    isFound = true;
                }
                if(s.length() == 0) {
                    System.out.println("YES");
                    System.exit(0);
                }
            }
            if(!isFound) {
                break;
            }
        }
        System.out.println("NO");
    }
}
