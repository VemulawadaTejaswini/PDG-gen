import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();

        int answer = 0;

        for (int gohyaku=0; gohyaku <= a; gohyaku++){
            if(gohyaku * 500 == x){
                answer++;
                break;
            }else if (gohyaku * 500 > x){
                break;
            }

            for(int hyaku=0; hyaku <= b; hyaku++){
                if (gohyaku * 500 + hyaku * 100 == x){
                    answer++;
                    break;
                }
                else if (gohyaku * 500 + hyaku * 100 > x){
                    break;
                }

                for (int gozyu = 0; gozyu <= c; gozyu++){
                    // 合計値比較
                    if (gohyaku * 500 + hyaku * 100 + gozyu * 50 == x){
                        answer++;
                        break;
                    }
                }
            }
        }

        System.out.println(answer);


    }
}
