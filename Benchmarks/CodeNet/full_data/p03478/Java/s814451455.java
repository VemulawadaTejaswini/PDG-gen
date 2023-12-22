import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        int total = 0;

        for ( int i = 1; i <= N; i++ ){
            int n = digits_sum(i);
            if ( n >= A && n <= B ){
                total += i;
            }
        }
        System.out.println(total);
    }
    private static int digits_sum(int n){
        int sum = 0;
        for(char c: Integer.toString(n).toCharArray()){
            
            sum  += Character.getNumericValue(c);
        }
        return sum;
    }
}