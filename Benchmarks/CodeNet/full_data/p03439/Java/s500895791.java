import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int il = 0;
        System.out.println(il);
        String sl = sc.next();
        if(check(sl)) return;
        int ir = n-1;
        System.out.println(n-1);
        String sr = sc.next();
        if(check(sr)) return;
        while(true){
            int tmp = (il + ir)/2;
            System.out.println(tmp);
            String tmps = sc.next();
            if(check(tmps)) return;
            if(tmp-il % 2 == 0 && tmps.equals(sl) || tmp-il % 2 == 1 && !tmps.equals(sl)){
                il = tmp;
                sl = tmps;
            }else{
                ir = tmp;
                sr = tmps;
            }
        }
    }
    
    public static boolean check(String s){
        return s.equals("Vacant");
    }
}

