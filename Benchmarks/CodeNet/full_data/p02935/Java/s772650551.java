import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double[] v = new Double[n];
        for(int i =0;i<n;i++){
            v[i] = sc.nextDouble();
        }
        Arrays.sort(v);
        for(int i = 0;i<n-1;i++){
            v[i+1] = (v[i]+v[i+1])/2;
        }
        System.out.println(v[n-1]);
    }
}