import java.util.*;

class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      Set<Integer> foods = new HashSet<Integer>();
      for(int i=0;i<m;i++){
        foods.add(i);
      }
      Set<Integer> tmp = new HashSet<Integer>();
      for(int i=0;i<n;i++){
        int x=sc.nextInt();
        for(int j=0;j<x;j++){
          tmp.add(sc.nextInt()-1);
        }
        foods.retainAll(tmp);
        tmp.clear();
      }
      System.out.println(foods.size());
    }
}