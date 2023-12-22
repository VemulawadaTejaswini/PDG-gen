import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        Tuple[] tuple = new Tuple[N];
        for(int i = 0; i < N; i++) {
            tuple[i] = new Tuple(A[i], B[i]);
        }
        
        Arrays.sort(tuple, new Comparator<Tuple>() {
            public int compare(Tuple t1, Tuple t2) {
                return t1.getA() - t2.getA();
            }
        });
        
        long money = 0;
        outer: for(int i = 0; i < N; i++) {
            for(int j = 0; j < tuple[i].getB(); j++) {
                money += tuple[i].getA();
                M--;
                if(M == 0) {
                    break outer;
                }
            }
        }
        
        
        System.out.println(money);
    }   
}

class Tuple {
    private int a;
    private int b;
    
    public Tuple(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int getA() {
        return a;
    }
    
    public int getB() {
        return b;
    }
}