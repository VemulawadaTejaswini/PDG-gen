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
    final List<Long> list = new ArrayList<>();
    //final List<Long> list2 = new ArrayList<>();

    int a = sc.nextInt();
    int b = sc.nextInt();

    int sum = 0;
    if(a >= b){
        sum += a;
        a--;
    }else{
        sum += b;
        b--;
    }

    if(a >= b){
        sum += a;
    }else{
        sum += b;
    }

    System.out.println(sum);





}
}