import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wnqmw
 */
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(kb.readLine());
        
        int[][] days = new int[n][3];
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(kb.readLine());
            for(int x = 0; x < 3; x++){
                days[i][x] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(maxhap(days, n));
        
    }
    static int maxhap(int[][] days, int n){
        int total = 0;
        int exc = -1, finexc = -1;
        for(int i = 0; i < n; i++){
            int currhigh = Integer.MIN_VALUE;
            for(int x = 0; x < 3; x++){
                if(x != finexc && days[i][x] > currhigh){
                    currhigh = days[i][x];
                    exc = x;
                }
            }
            total += currhigh;
            finexc = exc;
        }
        return total;
    }
}
