import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        boolean flag = false;
        int[] reverseIndex = new int[2];

        for (int i = 0;i<N;i++){
            list.add(sc.nextInt());
            if(i>0 && flag == false){
                flag = list.get(i) - list.get(i-1) >= K/2 ? true : false;
                if(flag){
                    reverseIndex[0] = i;
                    reverseIndex[1] = i-1;
                }
            }
        }

        if (flag){
//            System.out.println("true");
            System.out.println(list.get(reverseIndex[0]) - list.get(reverseIndex[1]));
        } else {
//            System.out.println("false");
            System.out.println(list.get(list.size()-1) - list.get(0));
        }

    }
}