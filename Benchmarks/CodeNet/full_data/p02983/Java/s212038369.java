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
    
    final Scanner sc = new Scanner(System.in);
    final long l = sc.nextLong();
    final long r = sc.nextLong();
    //final List<Integer> list = new ArrayList<>();
    long min = 10000;
    long min2 = 10000;

    long check = r - l + 1;
    if(check >= 2019){
        System.out.println(0);
    }else{
        for(long i = l ; i <= r ; i++){
            if(min >=i % 2019){
                min = i % 2019;
            }else if(min < i % 2019 && min2 >= i % 2019){
                min2 = i % 2019;
            }
        }

        System.out.println(min*min2);
    }
    
    




    

    



    
  

    


    


    

    
    
    



    





}
}