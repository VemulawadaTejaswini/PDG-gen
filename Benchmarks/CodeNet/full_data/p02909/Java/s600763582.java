import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    if(S.equals("Sunny")){
      System.out.println("Cloudy");
    }
    else if(S.equals("Cloudy")){
      System.out.println("Rainy");
    }
    else{
      System.out.println("Sunny");
    }
  }
}