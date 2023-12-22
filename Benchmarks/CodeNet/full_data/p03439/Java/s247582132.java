import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ss, se;
        System.out.println(0);
        String ret = sc.next();
        if(ret.equals("Vacant")){
            return;
        }else if(ret.equals("Male")){
            ss = 0;
        }else{
            ss = 1;
        }
        System.out.println(n-1);
        ret = sc.next();
        if(ret.equals("Vacant")){
            return;
        }else if(ret.equals("Male")){
            se = 0;
        }else{
            se = 1;
        }
        
        solve(0, n/2, n-1, ss, se, sc);
    }

    public static boolean solve(int s, int m, int e, int ss, int se, Scanner sc){
        System.out.println(m);
        String ret = sc.next();
        if(ret.equals("Vacant")){
            return true;
        }else if(ret.equals("Male")){
            if(ss == 0){
                if((m-s) % 2 == 0){
                    return solve(m, m+(e-m)/2, e, 0, se, sc);
                }else{
                    return solve(s, s+(m-s)/2, m, ss, 0, sc);
                }
            }else{
                if((m-s) % 2 == 0){
                    return solve(s, s+(m-s)/2, m, ss, 0, sc);
                }else{
                    return solve(m, m+(e-m)/2, e, 0, se, sc);
                }
            }
        }else{
            if(ss == 0){
                if((m-s) % 2 == 0){
                    return solve(s, s+(m-s)/2, m, ss, 1, sc);
                }else{
                    return solve(m, m+(e-m)/2, e, 1, se, sc);
                }
            }else{
                if((m-s) % 2 == 0){
                    return solve(m, m+(e-m)/2, e, 1, se, sc);
                }else{
                    return solve(s, s+(m-s)/2, m, ss, 1, sc);
                }
            }
        }
    }
}