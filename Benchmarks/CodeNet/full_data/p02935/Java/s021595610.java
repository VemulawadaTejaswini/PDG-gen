import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        double ans = 0;
        for(int i = 0; i < a; i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        ans = list.get(0);
        list.remove(0);
        while(list.size() > 0){
            ans = (ans + list.get(0)) / 2;
            list.remove(0);
        }
        System.out.println(ans);
    }
}