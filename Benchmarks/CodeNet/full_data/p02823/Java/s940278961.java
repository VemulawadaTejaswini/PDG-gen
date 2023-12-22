
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String N1 = sc.nextLine();
        String A1 = sc.nextLine();
        String B1 = sc.nextLine();

        N1 =N1 + "L";
        A1 =A1 + "L";
        B1 =B1 + "L";

        long N = Long.parseLong(N1);
        long A = Long.parseLong(A1);
        long B = Long.parseLong(B1);

                if(A==B){
                    System.out.println(0);
                 }else if((B-A)%2 ==0){

                    System.out.println((B-A)/2);

                }else{

                    if((A-1)<(N-B)){
                        System.out.println((A+B-1)/2);
                    }else{
                        System.out.println((N*2-A-B+1)/2);
                    }
                }



            }

        }
