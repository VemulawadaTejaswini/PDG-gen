import java.util.Scanner;

public class Main {

    public static  void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = 1;
        for(int i = 0; i*i < x ; i++){
            ans = i*i;
        }
        System.out.println(ans);
    }
}