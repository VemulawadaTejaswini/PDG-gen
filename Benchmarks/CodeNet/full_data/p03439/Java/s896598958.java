import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int left = 0, right = n-1;
        
        System.out.println(0);
        String sL = sc.next();
        if(sL.equals("Vacant")) return;
        System.out.println(n-1);
        String sR = sc.next();
        if(sR.equals("Vacant")) return;
        while(true){
            int tmp = left + (right - left) /2;
            System.out.println(tmp);
            String sT = sc.next();
            if(sT.equals("Vacant")) return;
            if(sT.equals(sL) && (tmp-left) % 2 == 1 || !sT.equals(sL) && (tmp-left) % 2 == 0){
                right = tmp;
                sR = sT;
            }else{
                left = tmp;
                sL = sT;
            }
        }
    }
}
