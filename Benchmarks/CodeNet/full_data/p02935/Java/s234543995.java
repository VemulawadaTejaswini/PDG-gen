import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        double min1 = 0;
        double min2 = 0;
        int minIndex = 0;
        double ans = 0;
        int flag = 0;
        for(int i = 0; i < a; i++){
            list.add(sc.nextInt());
        }
        while(list.size() > 0){
            min1 = list.get(0);
            for(int i = 0; i < list.size() - 1; i++){
                if(list.get(i) > list.get(i + 1)){
                    min1 = list.get(i + 1);
                    minIndex = i + 1;
                }
            }
            list.remove(minIndex);
            minIndex = 0;
            if(flag == 1){
                ans = (ans + min1) / 2;
            }
            if(flag == 0){
                min2 = list.get(0);
                for(int i = 0; i < list.size() - 1; i++){
                    if(list.get(i) > list.get(i + 1)){
                        min2 = list.get(i + 1);
                        minIndex = i + 1;
                    }
                }
                list.remove(minIndex);
                flag = 1;
                minIndex = 0;
                ans = (min1 + min2) / 2;
            }
        }
        System.out.println(ans);
    }
}