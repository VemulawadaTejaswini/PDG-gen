import java.util.*;

class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N-1];
        int[] b = new int[N-1];
        int[] c = new int[N];

        for(int i=0;i<N-1;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            c[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(c);
        // int[] count_c = new int[N];
        // for(int i=0;i<N-1;i++){
        //     count_c[a[i]]++;
        //     count_c[b[i]]++;
        // }

        int index = 0;
        int[] result_c = c;
        while(index < N){
            for(int i=index;i<N;i++){
                int[] p = swap(c, index, i);
                if(sum_score(a, b, p)>sum_score(a, b, result_c)){
                    result_c=p;
                    index--;
                    break;
                }
            }
            index++;
        }
        System.out.println(sum_score(a,b,result_c));
        dump(result_c);

    }
    public static int[] swap(int[] a, int x, int y) {
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
        return a;
    }
    public static int sum_score(int[] a, int[] b, int[] c) {
        int result = 0;
        for(int i=0; i<a.length;i++){
            result += Math.min(c[a[i]-1], c[b[i]-1]);
        }
        return result;
    }

    public static void dump(int[] a) {
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
        return;
    }
}