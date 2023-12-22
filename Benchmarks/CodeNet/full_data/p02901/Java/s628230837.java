import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static  class Counter{
        int index;
        int count;
        public Counter( int index , int count ){
            this.index = index;
            this.count = count;
        }
    }

    public static class Key{
        public int money;
        public int[] boxes;
        public Key( int money , int[] boxes ){
            this.money = money;
            this.boxes = boxes;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        int n = Integer.parseInt( params[0] );
        int m = Integer.parseInt( params[1] );

        Counter[] checker = new Counter[n];

        Key[] keys = new Key[m];
        for( int i = 0 ; i < m ; i++ ){
            params = in.nextLine().split(" ");
            int money = Integer.parseInt( params[0] );
            int b = Integer.parseInt( params[1]);
            int[] boxes = new int[b];
            params = in.nextLine().split(" ");
            for( int j = 0 ; j < b ; j++ ){
                boxes[j] = Integer.parseInt( params[j] );
                if( checker[ boxes[j] - 1 ] == null ){
                    checker[ boxes[j] - 1 ] = new Counter( boxes[j] - 1 , 1 );
                }
                checker[ boxes[j] - 1 ].count++;
            }
            keys[i] = new Key( money , boxes );
        }

        for( int i = 0 ; i < n ; i++ ){
            if( checker[ i ] == null ){
                System.out.println( -1 );
                return;
            }
        }

        Arrays.sort(checker, new Comparator<Counter>() {
            @Override
            public int compare(Counter o1, Counter o2) {
                return o1.count < o2.count ? -1 : 0 ;
            }
        });

        int total = 0;
        boolean[] isOpen = new boolean[n];
        for( int i = 0 ; i < n ; i++ ){
            int box = checker[i].index;
            isOpen[box] = true;
            
        }

    }

}
