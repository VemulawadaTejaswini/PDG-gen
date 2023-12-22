import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();
        List<Long> a = new ArrayList<>();

        for (int i = 0; i < n; i++){
            a.add(sc.nextLong());
        }

        int j = 0;
        long diff = 0;
        while(i < a.size()){
            j = i+1;
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
        }
        System.out.println("IMPOSSIBLE");
    }
}