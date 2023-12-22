import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N+1];
        for (int i=0;i<N+1;++i){array[i]=sc.nextInt();}
        //.
        int matsu = array[array.length-1];
        Set<Integer> set = new HashSet<>();
        if (isPrime(matsu)) set.add(matsu);
        for (int i=2;i<Math.sqrt(matsu);++i){
            if (matsu%i==0) {set.add(i);set.add(matsu/i);}
        }
        for (int i:set) if (!isPrime(i)) set.remove(i);
        //.
        for (int i=1;i<100000;++i){
            long tmp=0;
            for (int j = 0;j<N+1;++j){
                tmp += array[j]*Math.pow(i,(N-j));
            }
            for (int q:set) {if (tmp%q!=0) set.remove(q);}
            if (set.size()==0) break;
        }
        for (int i:set) System.out.println(i);
    }

    static boolean isPrime(int n){
        if (n<2) return false;
        for (int i =2;i<Math.sqrt(n);++i){if (n%i==0) return false;}
        return true;
    }
}
