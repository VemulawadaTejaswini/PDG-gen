import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxA = Integer.valueOf(sc.nextLine());
        int maxB = Integer.valueOf(sc.nextLine());
        int maxC = Integer.valueOf(sc.nextLine());
        int x = Integer.valueOf(sc.nextLine());
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