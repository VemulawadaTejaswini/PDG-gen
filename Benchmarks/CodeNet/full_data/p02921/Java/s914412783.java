import java.util.Scanner;

public class coTe {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String S, T;
        S = sc.nextLine();
        T = sc.nextLine();

        int cnt = 0;

        char[] cS = S.toCharArray();
        char[] cT = S.toCharArray();

        for(int i = 1; i<=3;i++){
            if(cS[i] == cT[i]){
                    cnt ++;
            }
        }
        System.out.println(cnt);
    }
}