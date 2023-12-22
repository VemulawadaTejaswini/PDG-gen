import java.util.*;

class Main{
    static long mod = 1000000007;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        int[] a = new int[M];
        for(int i=0;i<M;i++){
            a[i] = sc.nextInt();
        }

        int prev_ana = -1;
        int a_index = 0;
        ArrayList<Integer> count = new ArrayList<>();
        count.add(0);
        for(int i=1;i<=N;i++){
            if(M==0){
                count.set(0, N);
                break;
            }

            if(a[a_index] == i){
                if(i-prev_ana == 1){
                    System.out.println(0);
                    return;
                }
                prev_ana = i;
                a_index++;
                if(a_index>=M)a_index--;
            }
            else if (i-1 == prev_ana){
                if(i != 2)count.add(0);
            }
            else{
                count.set(count.size()-1, count.get(count.size()-1)+1);
            }
        }
        System.out.println(root(count));
    }

    public static long root(ArrayList<Integer> p) {
        int max_p = Collections.max(p);
        long[] tmp = new long[max_p+1];
        tmp[0] = 1;
        tmp[1] = 1;
        for(int i=2;i<=max_p;i++){
            tmp[i] = (tmp[i-1]+tmp[i-2]);
        }

        long result = 1;
        for(Integer i : p){
            result *= tmp[i];
            result %= mod;
        }
        return result;
    }

}