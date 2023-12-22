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

    int l = sc.nextInt();

    if((double)l % 3.0 == 0.0){
        System.out.println((double)l*l*l/27);
    }else{
        System.out.println((double)l/3*(double)l/3*(double)l/3);
    }
    
    
    
    
	}
}