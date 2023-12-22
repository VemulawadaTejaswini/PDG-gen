import java.util.*;
import java.io.*;

public class Main {
    public static boolean solve(int N){
        for(int seven = 0; seven<=15; seven++){
        	for(int four=0;four<=25;four++){
        	    if(seven*7+four*4==N)return true;
        	}
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(solve(N) ? "Yes" : "No");
    }
}