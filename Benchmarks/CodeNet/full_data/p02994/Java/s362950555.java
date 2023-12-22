import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Main {
	public static void main(final String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int l = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    int sum = 0;
    int min = 1000000;
    int num = 0;

    for(int i = 0; i < n ; i++){
        list.add(l+i);
    }

    //Collections.sort(list);

    for(int i = 0; i < n ; i++){
        sum += list.get(i);
    }

    for(int i = 0 ; i < n ; i++){
        if(min > Math.abs(list.get(i))){
            min = Math.abs(list.get(i));
            num = i;
        }
    }
    if(list.get(num)<=0){
        System.out.println(sum + min);
    }else{
        System.out.println(sum - min);
    }


    
    }
    public static int getNearestValue( List<Integer> list, int v )
	{
		
		int i;		
		int num;	
		int minv;	

		
		if ( 1 >list.size() ) return -1;

		
		num = 0;
		minv = Math.abs( list.get(0) - v );
		for ( i = 1; i < list.size(); ++ i ) {
			if ( Math.abs( list.get(i) - v ) < minv ) {
				num = i;
				minv = list.get(i) - v ;
			}
		}

        return minv;
        
	}
}