import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = "";
        String b = "";
        boolean flag = false;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int q = sc.nextInt();
            if(q == 1){
                flag = !flag;
            }else if(q == 2){
                int t = sc.nextInt();
                String c = sc.nextLine().trim();
                if(t == 1 && flag || t== 2 && !flag){
                    b = b + c;
                }else {
                    a = a + c;
                }
            }
        }
        if(flag){
            for (int i = b.length() - 1; i >= 0; i--) {
                System.out.print(b.charAt(i));
            }
            for (int i = s.length() - 1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
            System.out.print(a);
        }else{
            for (int i = a.length() - 1; i >= 0; i--) {
                System.out.print(a.charAt(i));
            }
            System.out.print(s);
            System.out.print(b);
        }
    }
}