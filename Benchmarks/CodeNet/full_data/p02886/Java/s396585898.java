import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i =0;i<n;i++){
            b[i] = sc.nextInt();
        }
        System.out.println(permutation(b));
        sc.close();
    }
    public static int permutation(int[] q){
        int ret = 0;
        for (int var = 0 ; var < q.length-1 ; var++) {
            for (int var2 = 0; var2 < q.length ;var2++) {
                if(var < var2) ret += q[var] * q[var2];
              
              //System.out.println(var + " " + var2 +  " " + ret);
            }
        }
        return ret;
    }
}

