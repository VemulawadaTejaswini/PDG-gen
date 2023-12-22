import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        char[] S = sc.next().toCharArray();
        int path = 0;
        int pathB = 0;
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < n; i++) {
            if(path < a + b) {
                if(S[i] == 'a') {
                    path++;
                    res.append("Yes\n");
                }
                else if(S[i] == 'b' && pathB <= b) {
                    path++;
                    pathB++;
                    res.append("Yes\n");
                }
                else {
                    res.append("No\n");
                }
            }
            else {
                res.append("No\n");
            }
        }

        System.out.println(res);
    }
}
