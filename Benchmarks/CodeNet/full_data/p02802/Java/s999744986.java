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
    final List<String> list2 = new ArrayList<>();
    int n = sc.nextInt();
    int m = sc.nextInt();
    int num = 0; 
    int ans = 0;
    int pena = 0;
    int check1 = -1;
    int check2 = 0;

    for(int i = 0 ; i < m ; i++){
        list.add(sc.nextInt());
        list2.add(sc.next());
    }

    for(int i = 0 ; i < m ; i++){
        if(list2.get(i).equals("AC")){
            if(check1 == list.get(i)){
            }else{
                ans++;
                check1 = list.get(i);
            }
        }else{
            if(check1 != list.get(i)){
                pena++;
                check2 = list.get(i);
            }
        }
    }

    System.out.println(ans + " " + pena);



















    
    






    

    



    
  

    


    


    

    
    
    



    





}
}