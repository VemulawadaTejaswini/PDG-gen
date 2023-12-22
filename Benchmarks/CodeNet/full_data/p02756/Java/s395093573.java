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
                if(flag){
                    flag = false;
                }else{
                    flag = true;
                }
            }else if(q == 2){
                int t = sc.nextInt();
                String c = sc.nextLine().trim();
                if(t == 1){
                    if(flag){
                        b = b + c;
                    }else{
                        a = c + a;
                    }
                }else if(t == 2){
                    if(flag){
                        a = c + a;
                    }else{
                        b = b + c;
                    }
                }
            }
        }
        if(flag){
            s = new StringBuffer(s).reverse().toString();
            b = new StringBuffer(b).reverse().toString();
            a = new StringBuffer(a).reverse().toString();
            System.out.println(b + s + a);
        }else{
            System.out.println(a + s + b);
        }
    }
}