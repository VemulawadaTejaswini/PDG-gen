import java.util.*;
import java.io.*;

public class Main {
    static class Pair {
        long c;
        long bonus;
        Pair (long c, long bonus) {
            this.c = c;
            this.bonus= bonus;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] arr = new char[m][n];
        int[] row = new int[m];
        int[] col= new int[n];
        sc.nextLine();
        for (int i=0; i<m; i++) {
            String s = sc.nextLine();
            for (int j=0; j<n; j++) {
                arr[i][j] = s.charAt(j);
                if (arr[i][j]=='#') {
                    row[i]=1;
                    col[j]=1;   
                }
            }
        }
        int x=0,y=0;
        for (int i=0; i<m; i++) {
               // System.out.print(row[i]);
                if (row[i]==1)x++;
        }
        //System.out.println();
        for (int i=0; i<n; i++) {
            //System.out.print(col[i]);
            if (col[i]==1)y++;
        }
        char[][] mat = new char[x][y];
        int p=0,q=0;
        List<Character> list = new ArrayList<>();
        for (int i=0; i<m; i++) {
            if (row[i]==1) {
                for (int j=0;j<n;j++) {
                    if (col[j]==1) {
                        list.add( arr[i][j]);
                    }
                }       
            }
        }
        //System.out.println(list.size());
        for (int i=0; i<x;i++) {
            for (int j=0; j<y;j++) {
                mat[i][j]= list.get(p);
                p+=1;
            }
        }
        for (int i=0; i<x; i++) {
            for (int j=0; j<y;j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}