import java.util.*;
import java.lang.*;
class Counter<T> extends TreeMap<T,Long>{
    public Counter(){
        super();
    }
    public Counter(List<T> list){
        super();
        for(T e: list) this.addOne(e);
    }
    public Long count(Object elm){
        return getOrDefault(elm,0L);
    }
    public void add(T elm, long amount){
        if(!this.containsKey(elm)) put(elm, amount);
        else replace(elm, get(elm)+amount);
        if(this.count(elm)==0) this.remove(elm);
    }
    public void addOne(T elm){
        this.add(elm, 1);
    }
    public void removeOne(T elm){
        this.add(elm, -1);
    }
    public void removeAll(T elm){
        this.add(elm, this.count(elm));
    }
    public static<T> Counter<T> merge(Counter<T> a, Counter<T> b){
        Counter<T> c = new Counter<>();
        for(T x: a.keySet()) c.add(x, a.count(x));
        for(T y: b.keySet()) c.add(y, b.count(y));
        return c;
    }
}
class MathLib{
    public static long divCeil(long a, long b){
        return (a+b-1)/b;
    }
    public static long power(long a, long x){
        if(x<0) return 0;
        if(x==0) return 1;
        if(x==1) return a;
        if(x%2==0){
            long half = power(a,x/2);
            return half*half;
        }
        return a*power(a,x-1);
    }

    public static long gcd(long a, long b){
        if(a<b) return gcd(b,a);
        if(b==0) return a;
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
    public static long lcm(long a, long b){
        return (a/gcd(a,b))*b;
    }

    public static LinkedList<Long> divisors(long N){
        LinkedList<Long> ans = new LinkedList<>();
        for(long n = (long)(Math.sqrt(N)+2); n>0; n--){
            if(n*n>N) continue;
            else if(n*n==N) ans.add(n);
            else if(N%n==0){
                ans.addFirst(n);
                ans.addLast(N/n);
            }
        }
        return ans;
    }
    public static boolean isPrime(long N){
        return divisors(N).size()==2;
    }
    public static ArrayList<Integer> primeList(int max){
        boolean[] isp = new boolean[max+1];
        Arrays.fill(isp, true); isp[0]=false; isp[1]=false;
        for(int p=2; p*p<=max; p++) if(isp[p]){
            for(int i=2; i*p<=max; i++) isp[i*p]=false;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int p=2; p<=max; p++) if(isp[p]) list.add(p);
        return list;
    }


    public static Counter<Long> factorize(long N){
        Counter<Long> c = new Counter<>();
        for(long n=2; n*n<=N; n++){
            while(N%n==0){
                c.addOne(n);
                N /= n;
            }
        }
        if(N>1) c.addOne(N);
        return c;
    }
}
class ArrayLib{
    static<E> E getOrDefault(E[] array, int index, E defaultValue){
        if(index<0 || index>=array.length) return defaultValue;
        return array[index];
    }

    static<E extends Comparable<E>> int maxIndexOfArray(E[] a){
        int ans = 0;
        for(int i=1;i<a.length;i++){
            if(a[i].compareTo(a[ans])>0) ans=i;
        }
        return ans;
    }
    static<E extends Comparable<E>> E maxValueOfArray(E[] a){
        return a[maxIndexOfArray(a)];
    }
    static<E extends Comparable<E>> int minIndexOfArray(E[] a){
        int ans = 0;
        for(int i=1;i<a.length;i++){
            if(a[i].compareTo(a[ans])<0) ans=i;
        }
        return ans;
    }
    static<E extends Comparable<E>> E minValueOfArray(E[] a){
        return a[minIndexOfArray(a)];
    }

    // minimum x st. array[x] >= elm
    // assert: the array must be sorted before the function call
    static<E extends Comparable<E>> int lowerBound(E[] array, E elm){
        if(array[0].compareTo(elm)>=0) return 0;
        int min = 0, max = array.length;
        // array[min] < elm
        // array[max] >= elm
        while(min+1<max){
            int mid = (min+max)/2;
            if(array[mid].compareTo(elm) < 0) min = mid;
            else max = mid;
        }
        return max;
    }
    // minimum x st. array[x] > elm
    // assert: the array must be sorted before the function call
    static<E extends Comparable<E>> int upperBound(E[] array, E elm){
        if(array[0].compareTo(elm)>0) return 0;
        int min = 0, max = array.length;
        // array[min] <= elm
        // array[max] > elm
        while(min+1<max){
            int mid = (min+max)/2;
            if(array[mid].compareTo(elm) <= 0) min = mid;
            else max = mid;
        }
        return max;
    }

    static int LIS(Long[] array){
        Long[] dp = new Long[array.length];
        Arrays.fill(dp, Long.MAX_VALUE);
        for(int i=0; i<dp.length; i++){
            dp[ArrayLib.lowerBound(dp, array[i])] = array[i];
        }
        return ArrayLib.lowerBound(dp, Long.MAX_VALUE);
    }


    static boolean nextPermutation(List<Integer> list){
        int pivotPos = -1;
        int pivot = 0;
        for (int i=list.size()-2; i>=0; i--) {
            if (list.get(i) < list.get(i+1)) {
                pivotPos = i;
                pivot = list.get(i);
                break;
            }
        }

        if (pivotPos==-1 && pivot==0) return false;

        int L = pivotPos+1, R = list.size()-1;
        int minPos = -1;
        int min = Integer.MAX_VALUE;
        for (int i=R; i>=L; i--) {
            if (pivot < list.get(i)) {
                if (list.get(i) < min) {
                    min = list.get(i);
                    minPos = i;
                }
            }
        }

        Collections.swap(list, pivotPos, minPos);
        Collections.sort(list.subList(L, R+1));

        return true;
    }

    static void print(int[] array, String begin, String space, String end){
        StringBuilder sb = new StringBuilder();
        sb.append(begin);
        for(int i=0; i<array.length-1; i++){
            sb.append(array[i]);
            sb.append(space);
        }
        sb.append(array[array.length-1]);
        sb.append(end);
        System.out.print(sb);
    }
    static void print(int[] array){
        print(array, "", " ", "\n");
    }
    static void print(long[] array, String begin, String space, String end){
        StringBuilder sb = new StringBuilder();
        sb.append(begin);
        for(int i=0; i<array.length-1; i++){
            sb.append(array[i]);
            sb.append(space);
        }
        sb.append(array[array.length-1]);
        sb.append(end);
        System.out.print(sb);
    }
    static void print(long[] array){
        print(array, "", " ", "\n");
    }
    static void print(double[] array, String begin, String space, String end){
        StringBuilder sb = new StringBuilder();
        sb.append(begin);
        for(int i=0; i<array.length-1; i++){
            sb.append(array[i]);
            sb.append(space);
        }
        sb.append(array[array.length-1]);
        sb.append(end);
        System.out.print(sb);
    }
    static void print(double[] array){
        print(array, "", " ", "\n");
    }
    static void print(Object[] array, String begin, String space, String end){
        StringBuilder sb = new StringBuilder();
        sb.append(begin);
        for(int i=0; i<array.length-1; i++){
            sb.append(array[i]);
            sb.append(space);
        }
        sb.append(array[array.length-1]);
        sb.append(end);
        System.out.print(sb);
    }
    static void print(Object[] array){
        print(array, "", " ", "\n");
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next().contains("7") ? "Yes" : "No");
    }
}
