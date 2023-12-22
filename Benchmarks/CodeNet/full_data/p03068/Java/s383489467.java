import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // B - *e**** ********e* *e****e* ****e**

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = sc.next();

        int k = sc.nextInt();

        char[] sb = s.toCharArray();

        StringBuilder sbr = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sbr = sbr.append((sb[i] == sb[k -1]) ? sb[i] : '*');
        }
        
        System.out.println(String.valueOf(sbr));
    }

}