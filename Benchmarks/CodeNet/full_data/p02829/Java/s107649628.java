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
    int a = sc.nextInt();
    int b = sc.nextInt();

    if(a == 1 && b == 2){
        System.out.println(3);
    }else if(a == 1 && b == 3){
        System.out.println(2);
    }else if(a == 2 && b == 1){
        System.out.println(3);
    }else if(a == 2 && b == 3){
        System.out.println(1);
    }else if(a == 3 && b == 1){
        System.out.println(2);
    }else{
        System.out.println(1);
    }

        
    
	}
}