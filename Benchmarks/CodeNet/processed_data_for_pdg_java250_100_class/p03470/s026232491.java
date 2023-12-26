public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] d = new int[N];
        for(int i = 0; i < N; i++) d[i] = sc.nextInt();
        Arrays.sort(d);
        for(int i = 0; i < N - 1; i++){
            if(d[i] == d[i+1]) d[i] = 0;
        }
        int count = 0;
        for(int i = 0; i < N; i++){
            if(d[i] != 0) count++;
        }
        System.out.println(count);
    }
}
