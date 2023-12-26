public class Main{
    public static void main(String[] args){
        long total = 0;
        long blue = 0;
        long result = 0;
        long n;
        long a;
        long b;
        Scanner sc = new Scanner(System.in);
        n = Long.parseLong(sc.next());
        a = Long.parseLong(sc.next());
        b = Long.parseLong(sc.next());
        sc.close();
        long i = n / ( a + b );
        long j = n % ( a + b ); 
        result = a*i;
        if( j < a ){
            result = result + j;
        }else{
            result = result + a;
        }
        System.out.println( result );
    }
}
