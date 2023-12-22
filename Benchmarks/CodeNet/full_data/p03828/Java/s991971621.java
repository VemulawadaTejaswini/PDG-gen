public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        long n=scanner.nextInt(),a[]=new long[(int)n+1];
        for(int i=2,k=i;i<=n;i++,k=i)for(int j=2;j<=i&&k>1;j++)for(;k%j==0;k/=j)a[j]++;
        System.out.println(java.util.Arrays.stream(a).reduce(1,(l,m)->l*(m+1)%1000000007));
    }
}