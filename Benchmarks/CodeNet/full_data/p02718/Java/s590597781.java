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
    int m = sc.nextInt();
    int sum = 0;

    List<Integer> list = new ArrayList<>();

    for(int i = 0 ; i < n ; i++){
        list.add(sc.nextInt());
        sum += list.get(i);
    }
    double vote = (double)sum * (1.0 / (4.0 * (double)m));
    //System.out.println(vote);

    Collections.sort(list);
    Collections.reverse(list);

    if(list.get(m-1) < (int)vote){
        System.out.println("No");
    }else{
        System.out.println("Yes");
    }



    
    
	}
}