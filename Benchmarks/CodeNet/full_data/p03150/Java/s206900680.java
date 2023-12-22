import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        boolean ans = false;
        boolean sps = false;
        boolean spe = false;
        int idx = 0;
        String k = "keyence";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == k.charAt(idx)){
                idx++;
                if(sps) spe = true;
                if(idx == 7) ans = true;
                continue;
            }else if(!sps){
                sps = true;
            }else if(sps && spe){
                ans = false;
                break;
            }
        }
        if(ans) System.out.println("YES");
        else System.out.println("NO");

    }

}
