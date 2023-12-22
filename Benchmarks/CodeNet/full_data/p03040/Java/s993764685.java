import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        basefun bf = new basefun();
        
        fun f = bf;

        int Q = sc.nextInt();
        for(int i = 0; i < Q; i++){
            int n = sc.nextInt();
            if(n == 1){
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                f = new fun(f, a, b);
                
            }else{
                int minX = 1000000000;
                int minf = 1000000000;
                int tmp;
                for(int k = f.minA; k <= f.maxA; k++){
                    tmp = f.calcF(k);
                    if(tmp < minf){
                        minX = k;
                        minf = tmp;
                    }
                }
                System.out.printf("%d %d\n", minX, minf);
            }
        }
    }
}

class basefun extends fun{
    public int calcF(int x){
        return 0;
    }
}

class fun {
    int a;
    int b;
    fun f;
    int minA = 0;
    int maxA = 0;
    
    public fun(){
        minA = 0;
        maxA = 0;
    }
    
    public fun(fun f, int a, int b){
        this.a = a;
        this.b = b;
        this.f = f;
        if(a < f.minA)
            minA = a;
        else
            minA = f.minA;
        if(a > f.maxA)
            this.maxA = a;
        else
            this.maxA = f.maxA;
    }

    public int calcF(int x){
        return f.calcF(x) + Math.abs(x - a) + b;
    }

}