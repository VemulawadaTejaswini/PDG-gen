import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n], b = new int[n];
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt();
            m.put(a[i], b[i]);
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++)
            b[i] = m.get(a[i]);
        int j = 0;
        long tmp = 0;
        while(tmp < k){
            tmp += b[j];
            j++;
        }
        System.out.println(a[j-1] + 1);
    }
}