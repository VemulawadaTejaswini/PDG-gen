import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> bl = new ArrayList<>();
        ArrayList<Integer> cl = new ArrayList<>();
        for(int i = 0; i < a; i++){
            al.add(sc.nextInt());
        }
        Collections.sort(al, Comparator.reverseOrder());
        for(int i = 0; i < b; i++){
            bl.add(sc.nextInt());
        }
        Collections.sort(bl, Comparator.reverseOrder());
        for(int i = 0; i < c; i++){
            cl.add(sc.nextInt());
        }
        List<Integer> sub = al.subList(0,x);
        List<Integer> sub2 = bl.subList(0,y);
        sub.addAll(sub2);
        sub.addAll(cl);
        Collections.sort(sub, Comparator.reverseOrder());
        long ans = 0;
        int maxi = x+y;
        for(int i = 0; i < maxi; i++){
            ans += sub.get(i);
        }
        System.out.println(ans);
    }
}