import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        char s = scanner.nextLine().charAt(0);
        int query = scanner.nextInt();
        scanner.nextLine();
        char[] before = new char[100000];
        char[] after = new char[100000];
        String[] querys = new String[query]; 
        boolean reverse = false;
        for(int i = 0; i < query; i++) {
            querys[i] = scanner.nextLine();
        }
        int i = 0;
        int j = 0;
        for(String str : querys) {
            if(str.equals("1")) {
                reverse = !reverse;
            } else {
                String[] q = str.split(" ");
                if(!reverse) {
                    if(q[1].equals("1")) {
                        before[i] = q[2].charAt(0);
                        i++;
                    }
                    if(q[1].equals("2")) {
                        after[j] = q[2].charAt(0);
                        j++;
                    }
                } else {
                    if(q[1].equals("2")) {
                        before[i] = q[2].charAt(0);
                        i++;
                    }
                    if(q[1].equals("1")) {
                        after[j] = q[2].charAt(0);
                        j++;
                    }
                }
                
            }
        }
        char[] ansc = new char[i + j + 1];
        for(int k = 1 ; k <= i; k++) {
            ansc[k - 1] = before[i - k];
        }
        ansc[i] = s ;
        for(int k = 1; k <= j; k++) {
            ansc[i+k] = after[k-1];
        }
        StringBuilder sb= new StringBuilder();
        sb.append(ansc);
        if(reverse) sb.reverse();
        System.out.println(sb.toString());
    }
}
