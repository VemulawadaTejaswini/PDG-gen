import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int goal,x,y,t;
    goal = 0;
    Map<Integer,Integer[]> plan = new HashMap<>();
    for (int i = 0; i < n; i++){
      t = Integer.parseInt(sc.next());
      x = Integer.parseInt(sc.next());
      y = Integer.parseInt(sc.next());
      goal = t;
      plan.put(t,new Integer[]{x,y});
    }
    Stack<Integer> tstack = new Stack<>();
    Stack<Integer> xstack = new Stack<>();
    Stack<Integer> ystack = new Stack<>();
    tstack.push(0);
    xstack.push(0);
    ystack.push(0);
    while (tstack.size() != 0){
      t = tstack.pop();
      x = xstack.pop();
      y = ystack.pop();
      if (plan.containsKey(t) && ((x != plan.get(t)[0]) || (y != plan.get(t)[1]))){continue;}
      if (t == goal){
        System.out.println("Yes");
        return;
      }
      for (int newx: new int[]{x+1,x-1}){
        tstack.push(t+1);
        xstack.push(newx);
        ystack.push(y);
      }
      for (int newy: new int[]{y+1,y-1}){
        tstack.push(t+1);
        xstack.push(x);
        ystack.push(newy);
      }
    }
    System.out.println("No");
  }
}
