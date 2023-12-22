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
    String s = sc.next();
    List<Character> list = new ArrayList<>();

    for(int i = 0; i < s.length(); i++){
        list.add(s.charAt(i));

        //切り出した文字列を一文字ずつ出力
    }

    if(list.get(2).equals(list.get(3)) && list.get(4).equals(list.get(5))){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }

   
    
    
    
	}
}