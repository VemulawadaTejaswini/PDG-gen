import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int il = 0;
        System.out.println(il);
        String sl = sc.next();
        if(sl.equals("Vacant")) return;
        int ir = n-1;
        System.out.println(n-1);
        String sr = sc.next();
        if(sr.equals("Vacant")) return;
        while(true){
            int tmp = (il + ir)/2;
            System.out.println(tmp);
            String tmps = sc.next();
            if(tmps.equals("Vacant")) return;
            if(tmps.equals(sl) && tmp-il % 2 == 1 || !tmps.equals(sl) && tmp-il % 2 == 0){
                ir = tmp;
                sr = tmps;
            }else{
                il = tmp;
                sl = tmps;
            }
        }
    }
}

