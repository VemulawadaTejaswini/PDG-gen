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
    List<Character> list = new ArrayList<>();
    String a = sc.next();
    String b = sc.next();
    int count = 0;

    for(int i = 0; i < a.length(); i++){
        list.add(a.charAt(i));

        //切り出した文字列を一文字ずつ出力
        }

    for(int i = 0; i < b.length(); i++){
        list.add(b.charAt(i));
    }

    Collections.sort(list);

    for(int i = 0; i < a.length() + b.length(); i += 2){
        if(list.get(i).equals(list.get(i + 1))){
        }else{
            count++;
        }
    }

    if(count == 0){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }


    
    
    
	}
}