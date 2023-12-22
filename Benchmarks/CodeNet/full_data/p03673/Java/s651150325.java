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
        List<Integer> b = setList(a,n);
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
    public static List<Integer> setList(List<Integer> a,int n){
        List<Integer> b = new ArrayList<>();
        int parity = n % 2;
        for(int i = 1;i <= n;i++){
            if(i % 2 == parity){
                b.add(0,a.get(i-1));
            }
            else if(i % 2 != parity){
                b.add(a.get(i-1));
            }
        }
        return b;
    }
}
