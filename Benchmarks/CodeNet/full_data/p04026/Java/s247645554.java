import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] str = br.readLine().split(" ");
        String s = br.readLine();

        if (s.length() == 2) {
            System.out.println("-1 -1");
            System.exit(0);
        }

        HashSet set;
        for (int i = 0; i < s.length() - 2; i++) {
            set = new HashSet();
            set.add(s.charAt(i));
            set.add(s.charAt(i+1));
            set.add(s.charAt(i+2));

            if(set.size() != 3){
                System.out.println((i+1) + " " +(i+3));
                System.exit(0);
            }
        }

        System.out.println("-1 -1");
    }
}
