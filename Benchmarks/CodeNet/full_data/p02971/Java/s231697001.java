import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] a = new int[n];
    List<Integer> list = new ArrayList<>();
    for(int i=0; i<n; i++) {
      a[i] = Integer.parseInt(in.readLine());
      list.add(a[i]);
    }
    
    Collections.sort(list);
    
    for(int i=0; i<n; i++) {
      System.out.println(list.get(n-1)!=a[i]?list.get(n-1):list.get(n-2));
    }
  }
}