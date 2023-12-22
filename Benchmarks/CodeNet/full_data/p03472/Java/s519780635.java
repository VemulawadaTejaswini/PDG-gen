import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hp = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        for(int i = 0; i < n ; i++) {
            arrA[i] = sc.nextInt();
            arrB[i] = sc.nextInt();
        }
        int count = 0;

        int maxA = arrA[0] ;
        for(int i = 0; i < n; i++) {
            maxA = Math.max(maxA, arrA[i]);
        }
        for(int i = 0; i < n ; i++) {
            if(arrB[i] > maxA) {
                hp = hp - arrB[i];
                count++;
                if(hp <= 0) {
                    break;
                }
            }
        }
        while(hp > 0) {
            hp = hp - maxA;
            count++;
        }

        System.out.println(count);
    }


}