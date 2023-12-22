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


        while(true) {
            boolean isFound = false;
            for(StringBuilder str: sb) {
                if(s.indexOf(str.toString()) == 0) {
                    s = s.replace(str.toString(),"");
                    isFound = true;
                }
            }
            if(!isFound) {
                break;
            }
        }
        if(s.length() == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
