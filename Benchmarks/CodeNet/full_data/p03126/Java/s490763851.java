import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x[] = new int[b];
        for (int i=0;i<a;i++){
            int c = sc.nextInt();
            for (int j=0;j<c;j++){
                int d = sc.nextInt();
                x[d-1]=x[d-1]+1;
                //System.out.println("i="+i + ",j="+j + ","+d);
                
            }
            //System.out.println("--");
        }
        int ret = 0;
        for (int k=0;k<b;k++){
            if (a==x[k]) ret=ret+1;
            //System.out.println(k+1 + ":" + a +"=" + x[k]);
        }
        System.out.println(ret);

    }
}