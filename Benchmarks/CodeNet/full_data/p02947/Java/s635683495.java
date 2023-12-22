import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;
class Main {
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   String[] moji = new String[n];
   for(int i = 0; i < n; i++){
     moji[i] = sc.next();
   }
   int[][] koike = new int[n][26];
   for(int i = 0; i < n; i++){
     for(char c1 : moji[i].toCharArray()){
      koike[i][c1-97]++;
     }
   } 
   int a = 0;
  HashMap<int[],Set<Integer>> map = new HashMap<>(); 
  for(int i = 0; i < n; i++){
    if(map.containsKey(koike[i])){
      a += map.get(koike[i]).size();
      map.get(koike[i]).add(i);      
    }else{
      map.put(koike[i], new Stream.of(i).collect(Collectors.toSet()));
    }
    }
  
   System.out.println(a);
  }
}