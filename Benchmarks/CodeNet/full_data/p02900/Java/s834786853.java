import java.util.*;
public class Main { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a > b) {
            long temp = a;
            a = b;
            b = temp;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= a; i++) {
            if((a % i == 0) && (b % i == 0)) {
                boolean flag = true;
                for(int k = 0; k < list.size(); k++) {
                    if(list.get(k) != 1 && i % list.get(k) == 0) {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                    list.add(i);
            }
                
        }
        System.out.println(list.size());
    }

}