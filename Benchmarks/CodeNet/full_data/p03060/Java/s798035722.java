import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] v;
        int[] c;

        v = new int[50];
        c = new int[50];
        v[0] = 0;
        c[0] = 0;
        for(int i=1;i<=N;i++){
            v[i] = sc.nextInt();
        }
        for(int j=1;j<=N;j++){
            c[j] = sc.nextInt();
        }

        int X = v[1]+v[N];
        int Y = c[1]+c[N];

        int xy = X -Y;
        
        if(xy>0){
            System.out.println(xy);
        }else{
            System.out.println(0);
        }


    }
}