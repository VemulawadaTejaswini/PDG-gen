import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();


        for (int i = 0; i < m; i++){

            num1.add(sc.nextInt());
            num2.add(sc.nextInt());
        }
        int max_num = Collections.max(num1);
        int min_num = Collections.min(num2);

        if (max_num <= min_num){
            System.out.println(min_num - max_num + 1);
        }else{
            System.out.println(0);
        }

    }
}
