import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();

        int A = Math.min(a, b);
        int B = Math.max(a, b);

        char[][]  x = new char[(2 * B + A) / A][A * 4]; 

        char l = ( a > b ) ? '.' : '#';
        char s = ( a > b ) ? '#' : '.';

 /*       for(int j=0; j < A*4; j++){
            x[0][j]   = s;
            x[0][++j] = l;
            x[0][++j] = l;
            x[0][++j] = l;
 }
 */
        for(int i=0; i < (2 * B + A) / A; i++){
            for(int j=0; j < A*4; j++){
                x[i][j]   = (j%4 == 0) ? s : l;
            }
        }

        int count = 0;

        for(int i=1; i < (2 * B + A) / A; i += 2){
            for(int j=2; count < (B - A) && j < A * 4; j += 4){
                x[i][j] = s;
                count++;
            }
        }

        System.out.println((2 * B + A)/A + " " +A * 4);
        for(int i=0; i < (2 * B + A) / A; i++){
            for(int j=0; j < A * 4; j++){
                System.out.print(x[i][j]);
            }
            System.out.print("\n");
        }
    }
}


// a -> '.' 
// b -> '#'