import java.util.*;

class Main
{
    public static int[] prime = new int[10000];
    public static int[] like = new int[10000];
    public static int index1 = 0;
    public static int index2 = 0;

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int Q = sc.nextInt();

        int[] L = new int[Q];
        int[] R = new int[Q];

        for(int i = 0; i < Q; i++){
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }

        Prime();
        LikeMake();

        for(int i = 0; i < Q; i++){
            int L_index = Arrays.binarySearch(like, L[i]);

            if(L_index < 0){
                L_index = (-1) * L_index - 1; 
            }

            int R_index = Arrays.binarySearch(like, R[i]);

            if(R_index < 0){
                R_index = (-1) * R_index  - 2;
            }
            System.out.println(L_index + " " + R_index);
            System.out.println( R_index - L_index + 1);
        }
    }
    static void Prime() // 素数生成
    {
        boolean bl = true;
    
        prime[0] = 2;

        for(int i = 1; i < 10000; i++){
            prime[i] = 1000007;
        }

        for(int num = 3; num < prime.length; num += 2){
            bl = true;;
            for(int j = 0; Math.pow(prime[j], 2) <= num; j++){
                if( num % prime[j] == 0){
                    bl = false;
                    break;
                }
            }
            if(bl == true){
                prime[++index1] = num;
            }
        }
    }
    static boolean LikeJudge(int p)
    {
        boolean ans = false;            
        if( Arrays.binarySearch(prime, (p + 1) / 2) >= 0){
            ans = true;
        }
        return ans;
    }
    
    static void LikeMake()
    {
        for(int i = 0; i < like.length; i++){
            like[i] = 10000;
        }
        for(int i = 1; i < prime.length; i++){
            if(LikeJudge(prime[i]) == true){
                like[index2] = prime[i];
                index2++;
            }
        }
    }
}