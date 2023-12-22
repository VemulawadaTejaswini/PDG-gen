import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();
    ArrayList<String> anslist = new ArrayList<>();    
    int n = sc.nextInt();
    String[] a = new String[n];
    int max = 1;
    int count = 1;
    for(int i = 0;i < n;i++){
      a[i] = sc.next();
      list.add(a[i]);
    }
    Collections.sort(list);
    for(int j = 1;j < n;j++){
      if(list.get(j - 1).equals(list.get(j))){
        count++;
        if(j == n - 1) max = Math.max(max,count);
      }else{
        max = Math.max(max,count);
        count = 1;  
      }
    }
    for(int x = 0;x < n - max + 1;x++){
      if(list.get(x + max - 1).equals(list.get(x))){
        anslist.add(list.get(x));
      }
    }
    Iterator<String> it = anslist.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}
