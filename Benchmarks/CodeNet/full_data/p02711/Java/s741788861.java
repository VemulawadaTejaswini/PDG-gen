import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean isS = false;
        while (n!=0){
            if(n%10 == 7){
                isS = true;
                break;
            }
            n/=10;
        }

        System.out.println(isS?"Yes":"No");
    }
}
