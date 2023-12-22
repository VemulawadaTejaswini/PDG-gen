import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for(int i = 0;i < m;i++){
            a.add(sc.nextInt());
            b.add(sc.nextInt());
        }
        int x = a.get(0);
        int y = b.get(0);
        long count = 1;
        for(int i = 1;i < m;i++){
            if(a.get(i) >= x && a.get(i) < y){
                x = a.get(i);
                if(b.get(i) <= y){
                    y = b.get(i);
                }
                continue;
            }
            x = a.get(i);
            y = b.get(i);
            count++;
        }
        System.out.println(count);
    }
}
