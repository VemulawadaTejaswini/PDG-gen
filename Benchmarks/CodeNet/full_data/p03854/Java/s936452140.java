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
        for(int i=0; i<s.length();) {
            for(StringBuilder str: sb) {
                String tmpStr = str.toString();
                if(s.length() >= tmpStr.length()+i) {
                    if(s.substring(i, tmpStr.length()+i).equals(tmpStr)) {
                        isFound = true;
                        i += tmpStr.length();
                    }
                }
            }
            if(!isFound) {
                break;
            }
        }
        System.out.println(isFound? "YES":"NO");
    }
}
