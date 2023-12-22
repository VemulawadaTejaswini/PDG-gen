import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] squares = s.split("");
        int[] result = new int[s.length()];

        for( int i = 0 ; i < s.length() ; i++ ) {
            int count = 0;
            int posIndex = i;
            String pos = "R".equals(squares[posIndex]) ? "R" : "L";
            while (true) {
                count++;
                if( "R".equals( pos ) ){
                    if( "R".equals(squares[posIndex+1]) ){
                        pos = "R".equals(squares[posIndex+1]) ? "R" : "L";
                        posIndex++;
                    }
                    else {
                        if( count % 2 == 0 ){
                            result[++posIndex]++;
                            break;
                        }
                        else {
                            result[posIndex]++;
                            break;
                        }
                    }
                }
                else {
                    if( "L".equals(squares[posIndex-1]) ){
                        pos = "R".equals(squares[posIndex-1]) ? "R" : "L";
                        posIndex--;
                    }
                    else {
                        if( count % 2 == 0 ){
                            result[--posIndex]++;
                            break;
                        }
                        else {
                            result[posIndex]++;
                            break;
                        }
                    }
                }
            }
        }
        for( int i = 0 ; i < s.length() ; i++ ){
            if( i != 0 ){
                System.out.print(" ");
            }
            System.out.print(result[i]);
        }
        System.out.println();


    }

}

