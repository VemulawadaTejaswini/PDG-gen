import java.util.*;

class Main{
  private static long answer = Long.MAX_VALUE;
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int all = sc.nextInt();
    int choice = sc.nextInt();
    List<Integer> minus = new ArrayList<>();
    List<Integer> plus = new ArrayList<>();
    
    for(int i = 0;i<all;i++){
      int x = sc.nextInt();
      if(x < 0){
        minus.add(Integer.valueOf(Math.abs(x)));
      }else{
        plus.add(Integer.valueOf(x));
      }
    }
    Collections.sort(minus);
    
    check(plus,minus,choice);
    check(minus,plus,choice);
               
    System.out.println(answer);
  }
  
  public static void check(List<Integer> a,List<Integer> b,int c){
    for(int i = 0;i<a.size() && i<c;i++){
      if(c - i - 1 > 0){
        if(b.size() > c - i - 2){
          answer = Math.min(answer,2 * a.get(i) + b.get(c - i -2));
        }
      }
      else{
        answer = Math.min(answer,a.get(c - 1));
      }
    }
  }
}