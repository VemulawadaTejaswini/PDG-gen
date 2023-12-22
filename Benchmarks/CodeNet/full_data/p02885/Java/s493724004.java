import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int rem = A - 2 * B;

        if(rem <= 0){
          System.out.print(0);
        }else{
          System.out.print(rem);
        }
    }
}