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
    int count = 0;

    for(int i = 0 ; i < n ; i++){
        list.add(sc.nextInt());
    }

    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < n ; j++){
            if(i == j){
            }else{
                if(list.get(i).equals(list.get(j))){
                    count++;
                }
            }
        }
    }

    if(count == 0){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
    
    


    
	}
}