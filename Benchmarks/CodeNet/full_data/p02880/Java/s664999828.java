import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isDevisible = false;
        for (int i = 1; i < 10 ; i ++){
            for (int j = 1 ; j < 10; j++){
                if (i * j == n){
                    isDevisible = true;
                    break;
                }
            }
        }
        System.out.println(isDevisible ? "Yes" : "No");
        sc.close();
    }
}
