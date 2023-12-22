import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] v;
        int[] c;

        v = new int[49];
        c = new int[49];
        N -=1;
        for(int i=0;i<=N;i++){
            v[i] = sc.nextInt();
        }
        for(int j=0;j<=N;j++){
            c[j] = sc.nextInt();
        }

        int X = v[0]+v[N];
        int Y = c[0]+c[N];

        int xy = X -Y;
        
        if(xy>0){
            System.out.println(xy);
        }else{
            System.out.println(0);
        }


    }
}