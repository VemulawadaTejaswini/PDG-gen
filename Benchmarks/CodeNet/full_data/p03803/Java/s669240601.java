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
    
    if( a == b || ( a == 1 && b == 1)){
        System.out.println("Draw");
    }else if( a == 1){
        System.out.println("Alice");
    }else if( b == 1){
        System.out.println("Bob");
    }else if( a > b ){
        System.out.println("Alice");
    }else{
        System.out.println("Bob");
    }


    


    
    


    
	}
}