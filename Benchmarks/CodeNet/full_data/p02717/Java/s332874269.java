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
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    int hako1 = x;
    x = y;
    y = hako1;
    int hako2 = x;
    x = z;
    z = hako2;

    System.out.println(x + " " + y + " " + z);



    
    
	}
}