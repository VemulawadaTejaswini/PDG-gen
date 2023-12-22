import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        int[] num = {1,2,3,4,5,6,7,8,9,19,29,39,49,59,69,79,89,99};

        for (int i = 0; i < K; i++) {
            if(i < 18){
                System.out.println(num[i]);
            }else{
                int L = i - 17;
                System.out.println(L + "99");
            }
        }
    }
}
