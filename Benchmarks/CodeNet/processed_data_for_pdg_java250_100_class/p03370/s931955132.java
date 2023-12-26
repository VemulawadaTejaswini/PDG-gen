public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] m = new int[N];
        int min = 1000;
        int sum = 0;
        for(int i=0; i<N; i++){
            m[i] = sc.nextInt();
            sum += m[i];
            if(min > m[i]){
                min = m[i];
            }
        }
        X = X - sum;
        X /= min;
        System.out.println(N+X);
    }
}
