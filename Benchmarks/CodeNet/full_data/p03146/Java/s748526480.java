import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(s);
        int n = f(s);
        for(int i = 1; !a.contains(n); i++){
            a.add(n);
            n = f(n);
        }
        System.out.println(a.size() + 1);
        scan.close();
    }
    
    public static int f(int n){
        if(n % 2 == 0) return n / 2;
        return n * 3 + 1;
    }
}