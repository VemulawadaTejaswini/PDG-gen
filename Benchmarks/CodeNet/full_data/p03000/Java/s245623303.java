import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int l[] = new int[n];

        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }

        int boundCnt=0;//バウンド回数
        int boundX=0; //バウンド座標
        
        while(boundX<=x && boundCnt<n){
            boundCnt++;
            boundX+=l[boundCnt-1];
        }

        System.out.println(boundCnt);
    }
}
