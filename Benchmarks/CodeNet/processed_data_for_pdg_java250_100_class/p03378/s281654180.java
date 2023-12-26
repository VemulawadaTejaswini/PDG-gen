public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int  N = sc.nextInt();
        int  M = sc.nextInt();
        int  X = sc.nextInt();
        int[]A = new int[M];
        for (int i =0; i < M ; i++){
            A[i]= sc.nextInt();
        }
        int chargeZero =0;
        int chargeN=0;
        for (int n = 0; n < A.length ; n++){
            if(A[n]<X){
                chargeZero++;
            }else{
                chargeN++;
            }
        }
        System.out.println(Math.min(chargeZero,chargeN));
    }
}
