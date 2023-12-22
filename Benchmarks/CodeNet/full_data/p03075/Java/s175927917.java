import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int num = 0;
        int min = 124;
        int max = -1;
        for (int i = 0 ; i < 6 ; i++) {
            num = scan.nextInt();
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
        }
        
        if ((max - min) > num){
            System.out.println(":(");
        } else {
            System.out.println("Yay!");
        }
    }
}
