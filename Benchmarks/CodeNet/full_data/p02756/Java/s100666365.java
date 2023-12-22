import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int q = sc.nextInt();
            if(q == 1){
                String r = new String();
                for (int j = s.length() - 1; j >= 0; j--) {
                    r = r + s.charAt(j);
                }
                s = r;
                //System.out.println(s);
            }else if(q == 2){
                int t = sc.nextInt();
                String c = sc.nextLine().trim();
                if(t == 1){
                    s = c + s;
                }else if(t == 2){
                    s = s + c;
                }
                //System.out.println(s);
            }
        }
        System.out.println(s);
    }
}