import java.util.*;

class Main {
    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);

       int X = sc.nextInt();
       int Y = sc.nextInt();
       char[][] borad = new char [55][55]; 

       for (int i=0; i < X; i++) {
           String s = sc.next();
           for (int j=0; j < Y; j++) {
               borad[i][j] = s.charAt(j); 
           }
       }

       int count = 0; 

       for (int i=1; i <= X; i++) {
           for (int j=1; j <= Y; j++) {
               if (borad[i][j] == '#' && borad[i][j - 1] != '#' && borad[i][j + 1] != '#' 
                                        && borad[i - 1][j] != '#' && borad[i + 1][j] != '#') {
                   count++;
               }
            }
        }

        System.out.println(count == 0 ? "Yes" : "No");
    }
}