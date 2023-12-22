public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long diff = a - b;
        if(diff < 0) diff *= -1L;
        long ans = 0L;
        if(diff % 2L == 0){
            ans = diff / 2L;
        }else{
            long h = (n+1L)/2L;
            if(b <= h || h < a ){
                long ad = Math.min(a-1L, n-a);
                long bd = Math.min(b-1L, n-b);
                ans = Math.max(ad, bd);
            }else{
                long ad = Math.max(a-1L, n-a);
                long bd = Math.max(b-1L, n-b);
                ans = Math.min(ad, bd);
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
