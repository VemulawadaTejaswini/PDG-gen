import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] s = new int[m];
        int[] c = new int[m];
        int[] out = new int[3];
        for(int i = 0; i < m; i++){
            s[i] = scan.nextInt();
            c[i] = scan.nextInt();
        }
        if(s.length == 0){
            out[3 - n] = 1;
        }
        boolean isExist = true;
        for(int i = 0; i < m; i++){
            if(isExist || out[s[i] - 1] == c[i] || out[s[i] - 1] == 0) {
                out[s[i] - 1] = c[i];
                isExist = false;
            }else{
                System.out.println(-1);
                return;
            }
        }
        if(out[0] == 0 && n != 1){
            System.out.println(-1);
            return;
        }
        for(int i = 0; i < n; i++) System.out.print(out[i]);
        scan.close();
    }
}
