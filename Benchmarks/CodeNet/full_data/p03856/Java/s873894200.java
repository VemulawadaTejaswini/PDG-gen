import java.util.Scanner;

/**
 *
 * @author Cummin
 */
public class Main {
    static String C[] = {"dream", "dreamer", "erase", "eraser" } ;
    static int len[] = {5,7,5,6} ;
    static char[] s ;
    static int ptr ;
    static char [][] c ;
    public static void main(String[] args) {
        String S ;
        Scanner sc = new Scanner(System.in);
        S = sc.next();
        s = S.toCharArray() ;
        c = new char[4][] ;
        for (int i=0 ; i<4 ;i++) {
            c[i] = C[i].toCharArray() ;
        }
        ptr = S.length()-1 ;
        while (0<=ptr) {
            switch (s[ptr]) {
                case 'm' :
                    if (match(0)) ptr = ptr -5 ; // dream
                    break;
                case 'e' :
                    if (match(2)) ptr = ptr -5 ; // erase
                    break ;
                case 'r' :
                    if (match(1)) { // deramer
                        ptr = ptr - 7 ; 
                        break ;
                    }
                    if (match(3)) { // eraser
                        ptr = ptr - 6 ;
                        break; 
                    }
                default :
                    ptr = -999 ;
            }
        }
        if (ptr == -1 ) {
            System.out.println("YES") ;
        } else {
            System.out.println("NO") ;
        }        
    }
    static boolean match(int i) {
        int flag = 0 ;
        int ptr2 = ptr ;
        for (int k=len[i]-1 ; 0<=k; k--  ) {
            if (s[ptr2] == c[i][k]) {
                ptr2 -- ;
                continue ;
            } else {
                flag = -1 ;
                break ;        
            }
        }
        if (flag == -1) return false ;
        else return true ;
    }
    
}
