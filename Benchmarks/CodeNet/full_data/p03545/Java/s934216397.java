import java.util.Scanner;
     
class Main{
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.nextLine();
        sc.close();
        String[] ope = {"+","-"};
        int ans = 0;
        String[] s = S.split("");

        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int C = Integer.parseInt(s[2]);
        int D = Integer.parseInt(s[3]);
        
        for(int i = 0; i < 2; i++) {
            String ope1 = ope[i];
            if(ope1.equals("+")) {
                ans = A + B;
            }else {
                ans = A - B;
            }
            for(int j = 0; j < 2; j++) {
                String ope2 = ope[j];
                if(ope2.equals("+")) {
                    ans += C;
                }else {
                    ans -= C;
                }
                for(int k = 0; k < 2; k++) {
                    String ope3 = ope[k];
                    if(ope3.equals("+")) {
                        ans += D;
                    }else {
                        ans -= D;
                    }
                    if(ans == 7) {
                        System.out.println(A +ope1+ B +ope2+ C +ope2+ D + "=7");
                        System.exit(0);
                    }
                }
            }
        }
    }
}