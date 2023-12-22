import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        int date = input.nextInt();
//
//        switch (date) {
//            case 22: System.out.print("Christmas Eve Eve Eve"); break;
//            case 23: System.out.print("Christmas Eve Eve"); break;
//            case 24: System.out.print("Christmas Eve"); break;
//            case 25: System.out.print("Christmas"); break;
//        }


        int n = input.nextInt();
        int[] p = new int[n];
        int h = 0, sum = 0;
        for (int i = 0; i < n; i++){
            p[i] = input.nextInt();
            if (p[i] > h){
                sum += h;
                h = p[i];

            } else {
                sum += p[i];
            }
        }

        System.out.print(sum + h/2);


    }
}
