import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];
        HashMap<Long,Long> map = new HashMap<>();
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextLong();

            map.putIfAbsent(a[i],0L);
            map.put(a[i], map.get(a[i])+1L);
        }

        Arrays.sort(a);
        //for(long i:a) System.out.println(i+" "+map.get(i));

        for(int k = n-1; k>=0; k--) {
            //System.out.println(a[k]+" "+map.get(a[k]));
            if (map.get(a[k]) >= 4) {
                System.out.println(a[k] * a[k]);
                return;
            } else if (map.get(a[k]) >= 2) {
                for (int i = k; i >= 0; i--) {
                    if ((a[i] != a[k]) && (map.get(a[i]) >= 2)) {

                        //System.out.println(a[i]+" "+a[k] +" "+((long)a[i]==(long)a[k]));
                        System.out.println(a[k]*a[i]);
                        return;
                    }
                }

            }
        }
        System.out.println(0);

    }
}
