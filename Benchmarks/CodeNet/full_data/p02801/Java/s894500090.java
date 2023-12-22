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
    final List<Integer> list = new ArrayList<>();
    String result = "abcdefghijklmnopqrstuvwxyz";
    int num = 0;
    char c = sc.next().charAt(0);

    for(int i = 0 ; i < result.length() ; i++){
        if(c == result.charAt(i)){
            num = i + 1;
        }
    }

    System.out.println(result.charAt(num));












    
    






    

    



    
  

    


    


    

    
    
    



    





}
}