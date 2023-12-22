import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        for(int tmp = 0; tmp<m; tmp++){
            int w = sc.nextInt();

            list.add(w);
        }
        list.add(n);
        List<Long> rootlist = new ArrayList<Long>();
        rootlist.add(0l);
        rootlist.add(1l);
        rootlist.add(2l);
        for(int tmp = 3; tmp <= n; tmp++){
            rootlist.add(rootlist.get(tmp - 1) + rootlist.get(tmp -2));
        }

        long result = 1;

        if(list.size() == 0){
            result = rootlist.get(n);
        }else{

            if(list.get(0) != 1){
                result *= rootlist.get(list.get(0) - 1);
            }

            for(int tmp = 1; tmp < list.size(); tmp++){
                result %= 1000000000;
                long kakeru = 1;
                if(n != list.get(tmp) + 1) {
                    kakeru = rootlist.get((list.get(tmp) - list.get(tmp - 1)) - 1);
                }
                kakeru %= 1000000000;
                result *= kakeru;

            }
        }


        long newresult = 0;
        if(result != 0) {
            newresult = result % 1000000007;
        }
        System.out.println(newresult);
    }
}
