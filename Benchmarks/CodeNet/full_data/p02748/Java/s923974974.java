import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int M = sc.nextInt();
    int[] a = new int[A];
    int[] b = new int[B];
    int[] m = new int[3*M];
    int amin = 100001;
    int bmin = 100001;
    int cmin = 200002;
    int ci = 0;
    //String str = sc.next();
    for(int i=0; i<A; i++){
        a[i] = sc.nextInt();
        if(amin > a[i]){
            amin = a[i];
        }
    }
    for(int i=0; i<B; i++){
        b[i] = sc.nextInt();
        if(bmin > b[i]){
            bmin = b[i];
        }
    }
    for(int i=0; i<M; i++){
        m[3*i] = sc.nextInt();
        m[3*i+1] = sc.nextInt();
        m[3*i+2] = sc.nextInt();
        ci = a[m[3*i]-1] + b[m[3*i+1]-1] - m[3*i+2];
        if(cmin > ci){
            cmin = ci;
        }
    }
    //if(str[0].equals("H"));
    if(amin+bmin >= cmin){
        System.out.println(cmin);
    }else{
        System.out.println(amin+bmin);
    }
  }
}
