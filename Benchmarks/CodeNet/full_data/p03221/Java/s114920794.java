import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static class PY{
        public PY(int p,int y){
            this.p = p ; this.y = y;
        }
        int p = 0;
        int y = 0;
    }

    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<PY>   py = new ArrayList<PY>();
        ArrayList<ArrayList<Integer>> od = new ArrayList<ArrayList<Integer>>();        
        for(int i = 0; i < n; i++){od.add(new ArrayList<Integer>());}

        //System.out.println((System.currentTimeMillis() - s) + "[ms]");
        s = System.currentTimeMillis();
        for(int i = 0; i < m; i++){
            int p = sc.nextInt();
            int y = sc.nextInt();

            py.add(new PY(p,y));
            int odlen = od.get(p-1).size();
            
            if(odlen >= 1){
                int low = 0;
                int high = odlen - 1;
                int mid  = odlen >> 1;

                while (low <= high){
                    mid = (low + high) >>1;
                    int guess = od.get(p-1).get(mid);
                    if(guess == y){

                    }else if(guess > y){
                        high = mid - 1;
                    }else{
                        low = mid + 1;
                    }
                }
                od.get(p-1).add(low,y);
            }else{
                od.get(p-1).add(y);
            }           
        }
        sc.close();

        //System.out.println("sort:" + (System.currentTimeMillis() - s) + "[ms]");
        s= System.currentTimeMillis();

        for(int i = 0 ;  i < m ; i++){
            PY t = py.get(i);
            int r = od.get(t.p-1).indexOf(t.y);

            int tmp = t.p;
            int digit = 0;
            while (tmp > 0 ){
                digit += 1;
                tmp = tmp / 10;
            }
            for (int j = 0 ; j < 6-digit-1; j++){
                System.out.print('0');
            }
            System.out.print(t.p);
            
            tmp = r + 1;
            digit = 0;
            while (tmp > 0){
                digit += 1;
                tmp = r / 10;
            }
            for (int j = 0 ; j < 6-digit-1; j++){
                System.out.print('0');
            }
            System.out.println(r+1);                            
        }
        //System.out.println("index:" + (System.currentTimeMillis() - s) + "[ms]");
    }
}