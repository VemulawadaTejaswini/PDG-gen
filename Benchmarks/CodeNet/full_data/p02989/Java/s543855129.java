import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < a; i++){
            list.add(sc.nextInt());
        }
        ArrayList<Integer> list1 = new ArrayList<>(list);
        Collections.sort(list1);
        int max = list1.get(list.size() - 1);
        int count = 0;
        int ans = 0;
        for(int i = 0; i <= max; i++){
            for(int j = 0; j < a; j++){
                if(i <= list.get(j)){
                    count++;
                }
            }
            if(count == (list.size() / 2)){
                ans++;
            }
            count = 0;
        }
        System.out.println(ans);
    }
}
