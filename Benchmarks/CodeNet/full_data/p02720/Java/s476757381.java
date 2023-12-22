import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Queue<Long> lnlns = new ArrayDeque<>();
    int k = scan.nextInt();
    
    for(long i = 1;i < 10;i++){
      lnlns.add(i);
    }
    
    for(int i = 1;i < k;i++){
      addLnln(lnlns);
    }
    System.out.println(lnlns.poll());
  }
  
  static void addLnln(Queue<Long> lnlns){
    
    long lnlns_initial = lnlns.poll();
    int ones_place = (int)lnlns_initial % 10;
    
    if(ones_place == 0){
      lnlns.add(lnlns_initial * 10 + ones_place);
      lnlns.add(lnlns_initial * 10 + 1 + ones_place);
      }
    else if(ones_place == 9){
      lnlns.add(lnlns_initial * 10 - 1 + ones_place);
      lnlns.add(lnlns_initial * 10 + ones_place);
    }
    else{
      lnlns.add(lnlns_initial * 10 - 1 + ones_place);
      lnlns.add(lnlns_initial * 10 + ones_place);
      lnlns.add(lnlns_initial * 10 + 1 + ones_place);
    }
  }
}