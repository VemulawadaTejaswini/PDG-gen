import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<String> array = new ArrayList<String>();
    HashSet<String> set = new HashSet<String>();
    String str = sc.next();
    int n = str.length();
    for(int a=0;a<n;a++){
      array.add(str.substring(a,a+1));
      set.add(str.substring(a,a+1));
    }
    if(array.size()==set.size()){
      System.out.println("yes");
    }else{
      System.out.println("no");
    }
  }
}