import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        int n = Integer.parseInt(params[0]);
        int m = Integer.parseInt(params[1]);

        params = in.nextLine().split(" ");
        Long[] as = new Long[n];
        for( int i = 0 ; i < n ; i++ ){
            as[i] = Long.parseLong( params[i] );
        }

        List<Long> remove = new ArrayList<>();
        long zero = 0;
        remove.add(zero);

        List<Long> list = new ArrayList<>(Arrays.asList(as));
        list.removeAll(remove);

        if( list.size() == 0 ){
            System.out.println( 0 );
            return;
        }

        if( list.size() == 1 ){
            while( m > 0 ){
                as[0] /= 2;
                m--;
                if( as[0] == 0 ){
                    break;
                }
            }
            System.out.println(as[0]);
            return ;
        }

        list.sort( Comparator.reverseOrder());

        while( 0 < m && list.size() != 0 ){
            if( list.size() == 1 ){
                while( m > 0 ){
                    as[0] /= 2;
                    m--;
                    if( as[0] == 0 ){
                        break;
                    }
                }
                System.out.println(as[0]);
                return ;
            }
            while( 0 < m && list.get(0) >= list.get(1) ){
                list.set( 0 , list.get(0) / 2 );
                m--;
                if( list.get(0) == 0 ){
                    list.remove(0);
                    break;
                }
            }

            for( int i = 0 ; i < list.size() - 1 ; i++ ){
                if( list.get(i) < list.get(i+1)){
                    Collections.swap( list , i , i+1);
                }
                else {
                    break;
                }
            }
        }

        long ans = 0;
        for( int i = 0 ; i < list.size() ; i++ ){
            ans += list.get(i);
        }

        System.out.println( ans );

    }

}
