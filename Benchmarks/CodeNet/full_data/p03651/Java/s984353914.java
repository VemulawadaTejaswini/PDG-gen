import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();
        List<Long> a = new ArrayList<>();

        for (int i = 0; i < n; i++){
            a.add(sc.nextLong());
            if(a.get(i)==k){
                System.out.println("POSSIBLE");
                System.exit(0);
            }
        }

        int i = 0;
        int j = 0;
        long diff = 0;
        while(i < a.size()){
            while(j<a.size()){
                diff = Math.abs(a.get(i)-a.get(j));
                if((diff)==k){
                    System.out.println("POSSIBLE");
                    System.exit(0);
                }
                if(!a.contains(diff)){
                    a.add(diff);
                }
                j++;
            }
            j = 1;
            i++;
        }
        System.out.println("IMPOSSIBLE");
    }
}