import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    boolean plus = false;
    boolean minus = false;
    int min = 1000000000;
    int sum = 0;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(S[i]);
      if(Math.abs(n) < min){
        min = Math.abs(n);
      }
      sum += Math.abs(n);
      if(n > 0){
        plus = true;
        list1.add(n);
      }else{
        minus = true;
        list2.add(n);
      }
    }
    if(!(plus && minus)){
      sum -= min*2;
    }
    System.out.println(sum);
    
    Collections.sort(list1);
    Collections.sort(list2);
    for(int i = 0; i < N-1; i++){
      if(list1.size() == 0){
        int a = list2.get(0);
        list2.remove(0);
        int b = list2.get(list2.size()-1);
        list2.remove(list2.size()-1);
        System.out.println(a+" "+b);
        list1.add(a-b);
      }else if(list2.size() == 0){
        int a = list1.get(0);
        list1.remove(0);
        int b = list1.get(list1.size()-1);
        list1.remove(list1.size()-1);
        System.out.println(a+" "+b);
        list2.add(a-b);
      }else if(list1.size()==1 && list2.size()==1){
        int a = list1.get(0);
        int b = list2.get(0);
        System.out.println(a+" "+b);
      }else if(list1.size()==1){
        int a = list1.get(0);
        list1.remove(0);
        int b = list2.get(0);
        list2.remove(0);
        System.out.println(a+" "+b);
        list1.add(a-b);
      }else{
        int a = list2.get(0);
        list2.remove(0);
        int b = list1.get(0);
        list1.remove(0);
        System.out.println(a+" "+b);
        list2.add(a-b);
      }
    }
  }
}