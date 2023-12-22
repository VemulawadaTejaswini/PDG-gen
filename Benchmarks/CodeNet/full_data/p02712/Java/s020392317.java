
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        long l = 0;
        for(int j=0;j<i;j++){
            if((j+1)%3 != 0 && (j+1)%5 != 0){
                l += j+1;
            }
        }
        System.out.println(l);
    }
}
