mport java.util.Scanner;

public class No3 {

        public static void main(String[] args) {
                System.out.println("賞味期限の超過許容日数、賞味期限の何日前
に買ってきたか、買ってから何日後に食べたかを入力してください");
                System.out.println("例: 5 3 2");
                System.out.println("→賞味期限を5日過ぎて食べてもお腹を壊さ
ない");
                System.out.println("　賞味期限の3日前に買ってきた");
                System.out.println("　買ってから2日後に食べた");
                System.out.print("input:");
                Scanner sc = new Scanner(System.in);
                int d = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                sc.close();

                if(a >= b){
                        System.out.println("delicious");
                }else if(a >= b - d){
                        System.out.println("safe");
                }else{
                        System.out.println("dangerous");
                }
        }

}