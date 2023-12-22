import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int i = 0;i < n;i++){
            a.add(sc.nextInt());
        }
        List<Integer> b = new ArrayList<>();
        for(Integer it : a){
            b.add(it);
            Collections.reverse(b);
        }
        //System.out.println(b);
        for(int i = 0;i < n;i++){
            System.out.print(b.get(i));
            if(i == n-1){
                break;
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}
