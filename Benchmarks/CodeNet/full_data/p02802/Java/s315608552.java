import java.util.Vector;
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] probs = new int[m];
    String[] res = new String[m];
    for(int i = 0; i < m; i++){
      probs[i] = sc.nextInt();
      res[i] = sc.next();
    }
    Vector<Integer> plist = new Vector<>();
    Vector<Integer> rlist = new Vector<>();
    int correct = 0;
    int penalty = 0;
    for(int i = 0; i < m; i++){
      if(!(plist.contains(probs[i]))){
        plist.add(probs[i]);
        if(res[i].equals("AC")){
          rlist.add(-1);
          correct++;
        }else{
          rlist.add(1);
        }
      }else{
        int index = plist.indexOf(probs[i]);
        if(rlist.get(index) == -1){
          continue;
        }
        if(res[i].equals("AC")){
          correct++;
          penalty += rlist.get(index);
          rlist.set(index, -1);
        }else{
          rlist.set(index, rlist.get(index) + 1);
        }
      }
    }
    System.out.println(correct + " " + penalty);
  }
}