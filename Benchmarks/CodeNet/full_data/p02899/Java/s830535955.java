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
    List<Integer> list2 = new ArrayList<>();
    int check = 1;

    for(int i = 0; i < n ; i++){
        list.add(sc.nextInt());
    }

    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < n ; j++){
            if(list.get(j).equals(check)){
                list2.add(j+1);
                check++;
            }
        }
    }

    for(int i = 0 ; i < n ; i++){
        System.out.print(list2.get(i) + " ");
    }
    
    


    
    


    


    
    


    
	}
}