import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        int C = Integer.parseInt(scanner.next());

        while(C > 0){
            count++;
            C--;

            if(C == 0 && B > 0){
                while(B > 0){
                    count++;
                    B--;
                }
                break;
            }else if( B > 0 ){
                count++;
                B--;
            }else if( A > 0 ){
                A--;
            }else{
                break;
            }
        }

        System.out.println(count);
    }
}