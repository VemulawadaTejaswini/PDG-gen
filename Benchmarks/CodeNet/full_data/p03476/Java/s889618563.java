import java.lang.reflect.Array;
import java.util.*;


public class Main {
    static ArrayList<Integer> primes = new ArrayList<Integer>();

    static void createPrimeNumberList(int primeNumMax){
        HashSet<Integer> checkedNumbers = new HashSet<Integer>();
        for(int i = 2; i <= primeNumMax; i++){
            if(!checkedNumbers.contains(i)){
                primes.add(i);
                int currentNum = i;
                while(currentNum <= primeNumMax){
                    checkedNumbers.add(currentNum);
                    currentNum += i;
                }
            }
        }
    }

    static void solve(){
        Scanner sc = new Scanner(System.in);
        createPrimeNumberList(100000);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int count = 0;
            for (int p1 = l; p1 <= r; p1+=2){
                int p2 = (p1+1)/2;
                if(primes.contains(p1) && primes.contains(p2)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static void main(String[] args){
        solve();
    }
}