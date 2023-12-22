import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int array[][] = new int[n][2];

        for (int i=0; i<n; i++){
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }

        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });

//        System.out.println(array[0][0]);
//        System.out.println(array[0][1]);
//        System.out.println(array[1][0]);
//        System.out.println(array[2][0]);
//        System.out.println(array[3][0]);
//        System.out.println(array[4][0]);

        int sum=0;
        for (int i=0; i<n; i++){
            sum += array[i][0];
            if (array[i][1]<sum){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
