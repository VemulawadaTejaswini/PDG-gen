import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int r = sc.nextInt();
    long lmod = l%2019;
    long range = lmod + (r-l);
    if(range >= 2019){
        System.out.println(0);
    }else{
        System.out.println(lmod*(lmod+1));
    }
  }
}