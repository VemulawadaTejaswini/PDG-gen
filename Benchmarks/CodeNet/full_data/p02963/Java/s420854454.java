import java.util.*;

public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        long s = sc.nextLong();

        long x1 = 0;
        long y1 = 0;

        List<Integer> num = new ArrayList<>();

        for (int i=(int)Math.sqrt(s); i>=0; i--){
            if (s%i==0){
                num.add(i);
                break;
            }
        }

        long x2 = num.get(num.size()-1);
        long y2 = 0;

        long x3 = x2;
        long y3 = s/x2;
//        long x2 = 1;
//        long y2 = 0;
//        long x3 = 1;
//        long y3 = s;

        System.out.print(x1+" "+y1+" "+x2+" "+y2+" "+x3+" "+y3);
//        System.out.println((int)Math.sqrt(89));

    }
}