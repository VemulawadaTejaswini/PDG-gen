import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(final String[] args){
    
        String s = sc.next();
        char[] work = new char[s.length()];
        char[] work2 = new char[t.length()];
        int count = 0;

        for(int i = 0; i < s.length(); i++){
                work[i] = s.charAt(i);
            }

        for(int i = 0; i < t.length(); i++){
                work2[i] = t.charAt(i);
        }

        for(int i = 0; i < 2; i++){
            if(work[i] == work2[i]){
                count++;
            }
        }
        Sytem.out.println(count);

        

            
                


    }
}