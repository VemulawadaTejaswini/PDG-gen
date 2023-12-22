import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i =0;i<n;i++){
            l[i] = sc.nextInt();
        }
        int ret = judge(l);
        System.out.println(ret);
        sc.close();
    }
    static int judge (int[] l){
        int ret = 0;
        for(int a = 0; a < l.length;a++){
            for(int b = 1; b < l.length;b++){
                for(int c = 2; c < l.length;c++){
                    if(a < b && b < c && l[a] < l[b] + l[c] && l[b] < l[c] + l[a] && l[c] < l[a] + l[b]) ret ++;
                }
            }
        }
        return ret;
    }
}
