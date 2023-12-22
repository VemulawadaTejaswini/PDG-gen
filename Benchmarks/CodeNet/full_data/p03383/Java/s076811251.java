import java.util.*;

public class Main
{

    public void run( )
    {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt( );
        int m = sc.nextInt( );
        char[][] texts = new char[ n ][ m ];
        for ( int i = 0; i < n; i++ )
        {
            String text = sc.next( );
            for ( int l = 0; l < m; l++ )
            {
                texts[ i ][ l ] = text.charAt( l );
            }
        }

        Boolean[] okRow = new Boolean[ n ];
        Arrays.fill( okRow, Boolean.FALSE );


        for ( int i = 0; i < n; i++ )
        {
            if ( okRow[ i ] ) continue;

            for ( int j = i + 1; j < n; j++ )
            {
                Boolean[] okRowColumn = new Boolean[ m ];
                Arrays.fill( okRowColumn, Boolean.FALSE );
                for ( int k = 0; k < m; k++ )
                {
                    if ( okRowColumn[ k ] ) continue;

                    for ( int l = 0; l < m; l++ )
                    {
                        if ( texts[ i ][ k ] == texts[ j ][ l ] && texts[ i ][ l ] == texts[ j ][ k ] )
                        {
                            okRowColumn[ k ] = true;
                            okRowColumn[ l ] = true;
                        }
                    }
                }


                if ( !Arrays.asList( okRowColumn ).contains( false ) )
                {
                    okRow[ i ] = true;
                    okRow[ j ] = true;
                }
            }
        }

        Boolean[] okColumn = new Boolean[ m ];
        Arrays.fill( okColumn, Boolean.FALSE );

        for ( int i = 0; i < m; i++ )
        {
            if ( okColumn[ i ] ) continue;

            for ( int j = i + 1; j < m; j++ )
            {
                Boolean[] okColumnRow = new Boolean[ n ];
                Arrays.fill( okColumnRow, Boolean.FALSE );
                for ( int k = 0; k < n; k++ )
                {
                    if ( okColumnRow[ k ] ) continue;

                    for ( int l = 0; l < n; l++ )
                    {
                        if ( texts[ k ][ i ] == texts[ l ][ j ] && texts[ l ][ i ] == texts[ k ][ j ] )
                        {
                            okColumnRow[ k ] = true;
                            okColumnRow[ l ] = true;
                        }
                    }
                }


                if ( !Arrays.asList( okColumnRow ).contains( false ) )
                {
                    okColumn[ i ] = true;
                    okColumn[ j ] = true;
                }
            }
        }

        int countRowNotOk = 0;
        int countColumnNotOk = 0;

        for ( int i = 0; i < n; i++ )
        {
            if ( !okRow[ i ] ) countRowNotOk++;
        }
        for ( int i = 0; i < m; i++ )
        {
            if ( !okColumn[ i ] ) countColumnNotOk++;
        }

        boolean result = true;
        if ( n % 2 == 0 )
        {
            result &= countRowNotOk == 0;
        } else
        {
            result &= countRowNotOk <= 1;
        }
        if( m % 2 == 0)
        {
            result &= countColumnNotOk == 0;
        } else
        {
            result &= countColumnNotOk <= 1;
        }
        if(result)
        {
            System.out.println( "YES" );
        } else
        {
            System.out.println( "NO" );
        }
    }

    public static void main( String[] args )
    {
        new Main( ).run( );
    }
}