public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = 100;
        long sum = 0;
        while(ans<N)
        {
            ans = ans + (long)(ans /100);
            sum++;
        }
        System.out.println(sum);
    }
}
