import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        ArrayList<Long> list = new ArrayList<>();
        long ans1 = 0;
        long ans2 = 0;
        for(long i = 1; i * i <= a; i++){
            if(a % i == 0){
                list.add(i);
                list.add(a/i);
            }
        }
        ans1 = list.get(list.size() - 2) - 1;
        ans2 = list.get(list.size() - 1) - 1;
        System.out.println(ans1 + ans2);
    }
}