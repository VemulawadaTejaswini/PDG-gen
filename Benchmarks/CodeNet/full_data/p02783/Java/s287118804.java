import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 0; i <1000000; i++){
            if(a <= b*i){
                System.out.print(i);
                break;
            }
        }
    }
}
