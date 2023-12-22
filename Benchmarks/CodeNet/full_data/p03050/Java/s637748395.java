import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();

        long sum = 0;
        for( long i=2 ; i<N ; i++ ){
            if(i>2 && i%2==0)return ;
            if(i>3 && i%3==0)return ;
            if( N/i == N%i )sum+=i;
        }
      
        System.out.println( sum );
          
    }
}

