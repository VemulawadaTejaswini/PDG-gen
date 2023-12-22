import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        int[][] array = new int[n][2];

        for (int i :
                list) {
//            array
        }

        for (int i = 0; i < n; i++){
            array[i][0] = list.get(i);
            array[i][1] = 0;
        }

        for (int j : list) {
            for (int i = 0; i < n; i++) {
                if (array[i][0] == j) {
                    array[i][1] ++;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++){
            if (max < array[i][1]){
                max = array[i][1];
            }
        }

        if (max <= 2){
            System.out.println("2");
        }else {
            System.out.println(max);
        }

    }
}
