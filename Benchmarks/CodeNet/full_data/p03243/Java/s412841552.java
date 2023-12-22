import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(final String[] args){
    
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        if(0 < n && n <= 111){
            System.out.println(111);
        }else if(112 <= n && n <= 222){
            System.out.println(222);
        }else if(223 <= n && n <= 333){
            System.out.println(333);
        }else if(334 <= n && n <= 444){
            System.out.println(444);
        }else if(445 <= n && n <= 555){
            System.out.println(555);
        }else if(556 <= n && n <= 666){
            System.out.println(666);
        }else if(667 <= n && n <= 777){
            System.out.println(777);
        }else if(778 <= n && n <= 888){
            System.out.println(888);
        }else{
            System.out.println(999);
        }
        






    }
}