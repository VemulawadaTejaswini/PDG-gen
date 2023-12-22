import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long k = scan.nextInt();
        int p = 1;//積を求めるときの小さい数の方
        ArrayList<Long> l = new ArrayList<Long>();

        for(int i = 0; i < n; i++) l.add(scan.nextLong());
        scan.close();
        Collections.sort(l);

        while(k > n - p){
            k -= (n - p);
            p++;
        }

        System.out.println(l.get(p) * l.get(p + (int)k));
    }
}