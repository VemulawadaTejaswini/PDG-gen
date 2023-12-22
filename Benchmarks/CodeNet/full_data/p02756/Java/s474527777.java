import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        StringBuilder s = new StringBuilder(in.nextLine());
        int q = Integer.parseInt( in.nextLine() );
        String[] params;
        boolean isReverse = false;
        for( int i = 0 ; i < q ; i++ ){
            params = in.nextLine().split(" ");
            String t = params[0];
            if( t.equals("1") ){
                isReverse = !isReverse;
            }
            else {
                String f = params[1];
                if( isReverse ){
                    if( f.equals("1") ){
                        s.append(params[2]);
                    }
                    else {
                        s.insert(0, params[2]);
                    }
                }
                else {
                    if( f.equals("1") ){
                        s.insert(0, params[2]);
                    }
                    else {
                        s.append(params[2]);
                    }
                }
            }
        }

        if( isReverse ){
            s.reverse();
        }

        System.out.println( s.toString() );

        out.close();

    }

}
