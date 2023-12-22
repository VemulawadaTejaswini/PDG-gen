import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        int a = 10000;
        int b = 5000;
        int c = 1000;
        int count = 0;
        for(int i = 0; i <= n; i++){
            for(int j = 0; (n-i-j) >= 0; j++){
                int sum = a * i + b * j + c * (n - i - j);
                //System.out.println(sum);
                if(sum == y){
                    System.out.println(i + " " + j + " " + (n-i-j));
                    return;
                }
            }
        }
        System.out.println("-1 " + "-1 " + "-1");
    }
}
