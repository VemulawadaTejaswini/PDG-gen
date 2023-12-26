public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long a = N/(A+B);
        long b = N%(A+B);
        if(b > A){
            System.out.print(A*a+A);
        }else{
            System.out.print(A*a+b);
        }
    }
}
