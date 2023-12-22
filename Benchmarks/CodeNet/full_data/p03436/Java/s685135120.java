import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int y = scan.nextInt();
        int x = scan.nextInt();
        
        char[][] arr = new char[y][];
        for(int i = 0; i < y; i++) arr[i] = new char[x];
        
        for(int i = 0; i < y; i++){
            String temp = scan.next();
            for(int j = 0; j < x; j++) arr[i][j] = temp.charAt(j);
        }
        
        int count = 0;
        for(int i = 0; i < y; i++){
            for(char c : arr[i])
            if(c == '#') count++;
        }
        
        int cost = shortPath(arr,1,x,y,0,0);
        
        if(cost != 2500)
        System.out.println(x*y - count - cost);
        else
        System.out.println(-1);
        
    }
    
    private static int shortPath(char[][] arr, int val, int x, int y, int i, int j){
        if(i >= y || j >= x) return 2500;
        if(i == y-1 && j == x-1) return val;
        if(arr[i][j] == '#') return 2500;
        
        return Math.min(shortPath(arr, val+1, x, y, i+1, j), shortPath(arr, val+1, x, y, i, j+1));
        
    }
}
