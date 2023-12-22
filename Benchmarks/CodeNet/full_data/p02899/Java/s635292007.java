import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
      int n=sc.nextInt();
      TreeMap<Integer,Integer>map=new TreeMap<>();
      for(int i=0;i<n;i++){
        map.put(sc.nextInt(),i+1);
      }
      for(int i=0;i<n;i++){
        System.out.print(map.get(i+1)+" ");
      }
      System.out.println("");
    }
    sc.close();
  }
}