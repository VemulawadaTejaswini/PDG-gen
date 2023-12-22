import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            list.add(sc.nextInt());
        }
        int x = 0;
        //System.out.println(list);
        for(int i = 0;i < n-1;i++){
            if(list.get(i) + t > list.get(i+1)){
                x = list.get(i+1);
            }
            else{
                x += t;
            }
        }
        x += t;
        System.out.println(x);
    }
}
