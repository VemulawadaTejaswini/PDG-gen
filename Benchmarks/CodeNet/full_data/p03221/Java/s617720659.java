import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int N;
    static int M;
    static int [][] city;
    public static void main(String args[]) throws Exception {

        
        Scanner sc = new Scanner(System.in);
        N= sc.nextInt();
        M= sc.nextInt();
        city = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                city[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= N; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <M; j++) {
                if (city[j][0] == i){

                    list.add(city[j][1]);
                }
            }
            sort(i,list);
            if (list.isEmpty()){
                list.clear();
            }
        }
    }

    public static void sort(int n,List<Integer> list){
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {

            String str = String.format("%06d", n) + String.format("%06d",(i+1));
            System.out.println(str);
        }

    }
}