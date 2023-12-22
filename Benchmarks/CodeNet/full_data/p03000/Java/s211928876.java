import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int boundCnt=0;//バウンド回数
        int boundX=0; //バウンド座標
        
        for (int i = 0; i < n; i++) {
            if (boundX <=x){
                boundCnt++;
            }
            boundX += sc.nextInt();
        }

        System.out.println(boundCnt);
    }
}

