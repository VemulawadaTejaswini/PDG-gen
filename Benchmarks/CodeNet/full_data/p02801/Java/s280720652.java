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
    String C = scan.next();
    String alphabet[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    for (int i = 0;i < 25;i++) {
      if (C.equals(alphabet[i])) {
        System.out.println(alphabet[i + 1]);
        return;
      }
    }
  }
}