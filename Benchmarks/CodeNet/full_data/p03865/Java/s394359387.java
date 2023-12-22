import java.util.Scanner;

/**
 * ARC064_D
 * @author Cummin
 */
public class Main {
    static String S ;
    static char[] s ;
    static int[] del ;  // 1= deleted
    static int len ;    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = sc.next() ;
        s = S.toCharArray() ;
        len = s.length ;
        int ans ;
        del = new int[len] ;

        if (solve2(del,1)==0) {
            System.out.printf("First\n") ;
        } else {
            System.out.printf("Second\n") ;
        }
       // }
    }
    static int solve() {
        int cnt = 0 ;
        for (int i = 1 ; i <len-1 ; i++) {
            if (s[i-1]==s[i+1]) {
                continue ;
            } else {
                cnt ++ ;
            }
        }
        return cnt ;
    }
    static int solve2(int del[], int player) {
        for (int i=0 ; i<len-2 ; i++) {
            if (del[i]==1) continue ;
            char c1 = s[i] ;
            char c2 = s[i] ; // dummy  
            char c3 = s[i] ; // dummy  
            OUTER:
            for (int j = i+1 ; j < len - 1; j++) {
                if (del[j] == 1) {
                    continue;
                } else {
                    c2 = s[j];
                    for (int k = j + 1; k < len ; k++) {
                        if (del[k] == 1) {
                            continue;
                        } else {
                            c3 = s[k];
                            if (c1 == c3) {
                                break OUTER ;
                            } else {
                                del[j] = 1;
                                if (player == 1) {
                                    player = 2;
                                } else {
                                    player = 1;
                                }
                                // 相手が負ける=自分が勝つ戦略が見つかったらReturn
                                if (solve2(del, player) == -1) {
                                    return 0;
                                }
                                break OUTER;
                            }
                        }
                    }
                }
            }
        } 
        return -1 ;  //lost
    }
}
