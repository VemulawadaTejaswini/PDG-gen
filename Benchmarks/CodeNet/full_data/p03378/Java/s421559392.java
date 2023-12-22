import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        Integer m = scan.nextInt();
        Integer x = scan.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();

        for(int i=0;i<m;i++) a.add(scan.nextInt());

        Collections.sort(a);

        int cost1 = 0;
        int cost2 = 0;
        int p = 0;
        while(true){
            if(a.get(p) >= x) break;
            p++;
        }
        cost1 = p;
        cost2 = a.size()-p;
        if(cost1 < cost2)
            System.out.println(cost1);
        else
            System.out.println(cost2);
    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
    }


}