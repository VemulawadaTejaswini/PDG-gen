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
    int k = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    int count = 0;

    for(int i = 0; i < n ; i++){
        list.add(sc.nextInt());
    }

    for(int i = 0; i < n ; i++){
        if(list.get(i) >= k){
            count++;
        }
    }

    System.out.println(count);
    


    
    


    


    
    


    
	}
}