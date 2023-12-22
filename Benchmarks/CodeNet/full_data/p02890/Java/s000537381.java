import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i =0;i<n;i++){
            l[i] = sc.nextInt();
        }
        judge(l,n);
        //System.out.println(ret);
        sc.close();
    }
    static void judge (int[] l,int n){
        int dep = 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int a = 0; a < l.length;a++){
            if(set.contains(l[a])){
                dep ++;
            }else{
                set.add(l[a]);
            }
        }
        for(int b =1; b<=n;b++){
            if((l.length / b >= dep){
                System.out.println(l.length / b);
            }else{
                System.out.println((l.length - dep) / b);
            }
        }
    }
}
