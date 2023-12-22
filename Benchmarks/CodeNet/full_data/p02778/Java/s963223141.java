import java.util.*;

import java.io.*;
 
public class Main{

    public static int stringToInt(char i, int[] a){
        if(i == 'A') return a[0];
        if(i == 'B') return a[1];
        if(i == 'C') return a[2];
        return 0;
    }
 
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        String S = s.next();
        for(int i = 0; i < S.length(); i++){
            System.out.print("x");
        }
        System.out.println();
        
	}
} 