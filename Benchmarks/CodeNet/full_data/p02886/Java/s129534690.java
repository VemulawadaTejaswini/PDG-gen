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
    List<Integer> list = new ArrayList<>();

    for(int i = 0; i < n; i++){
        list.add(sc.nextInt());
    }
    int sum = 0;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            if(i < j){
                sum += list.get(i)*list.get(j);
            }
        }
    }
    System.out.println(sum);
    

    

    }
}