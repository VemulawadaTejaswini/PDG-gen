import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String[][] a = new String[s.length()+1][t.length()+1];
        Arrays.fill(a[0], "");
        for(int i = 0; i < s.length(); i++){
            Arrays.fill(a[i+1], "");
            for(int j = 0; j < t.length(); j++){
                if(s.charAt(i) == t.charAt(j)) a[i+1][j+1] = a[i][j] + s.charAt(i);
                else if (a[i][j+1].length() > a[i+1][j].length()) a[i+1][j+1] = a[i][j+1];
                else a[i+1][j+1] = a[i+1][j];
            }
        }
        System.out.println(a[s.length()][t.length()]);
        sc.close();
    }

}
