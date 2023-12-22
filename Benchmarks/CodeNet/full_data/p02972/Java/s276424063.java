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
    int n = Integer.parseInt(sc.nextLine());
    int[] a = new int [n];
    for(int i = 0; i < n; i++){
        a[i] = sc.nextInt();
    }
    //int[] a = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    sc.close();
    int cnt = 0;
    List<Integer>ans = new ArrayList<Integer>();
    for(int i = n-1; i >= 0; i--){
        int tmp = a[i];
        int alr = 0;
        for(int j = 2; j <= n; j++){
            if((i+1)*j > n){
                break;
            }else{
                alr += a[(i+1)*j-1];
            }
        }
        if((tmp%2) != (alr%2)){
            ans.add(i+1);
            cnt += 1;
        }
    }
    System.out.println(cnt);
    Collections.reverse(ans);
    int i = 0;
    for(int v: ans){
        if(i == n-1){
            System.out.print(v);
        }else{
            System.out.print(v+" ");
        }
    }
    //ans.stream().forEach(b -> {System.out.print(b + " ");});
  }
}