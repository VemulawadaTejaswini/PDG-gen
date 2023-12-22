import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();

        sc.close();

        int count=0;
        long CDmax = Math.max(C,D);

        if(CDmax > A){
            for(long i=CDmax; i <= B; i++){
                if(i%C != 0 && i%D != 0){
                    count++;
                }
            }
        }else{
            for(long i=A; i <= B; i++){
                if(i%C != 0 && i%D != 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
