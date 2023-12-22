import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double x = sc.nextInt();

        List<Double> aList = new ArrayList<>();

        for(int i=0; i<N; i++){
            aList.add((double)sc.nextInt());

        }
        Collections.sort(aList);

        int count = 0;

        for(double a : aList){
            x = x - a;
            if(x == 0){
                count += 1;
                break;
            }else if(x < 0){
                break;
            }else{
                count += 1;
            }
        }

        System.out.print(count);

    }
}