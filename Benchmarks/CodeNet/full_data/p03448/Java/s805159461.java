package AtCoderBegineerContest087;

import java.util.Scanner;

public class Main087A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = Integer.valueOf(sc.nextLine());
        // int b = Integer.valueOf(sc.nextLine());
        // int c = Integer.valueOf(sc.nextLine());
        // int x = Integer.valueOf(sc.nextLine());
        int x = 6000;
        int maxA = 30;
        int maxB = 40;
        int maxC = 50;
        int count = 0;
        for(int numA = 0; numA <= maxA; numA++){
            for(int numB = 0; numB <= maxB; numB++){
                int numC = (x - 500*numA - 100*numB) / 50;
                if(maxC >= numC && numC >= 0){
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}