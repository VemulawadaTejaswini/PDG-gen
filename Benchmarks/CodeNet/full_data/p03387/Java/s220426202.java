import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      String[] lines = in.readLine().split(" ");
      int[] arr = new int[lines.length];
      int k=0;
      for (String s : lines) {
        arr[k++] = Integer.parseInt(s); 
      }
      Arrays.sort(arr);
      int step=0;
      if(arr[2] - arr[1] > 4) {
        for(; arr[1]+4 < arr[2]; step++) {
          arr[1] += 2;
        }
      }
      if(arr[1] - arr[0] > 4) {
        for(; arr[0]+4 < arr[1]; step++) {
          arr[0] += 2;
        }
      }

      Tuple3 t = new Tuple3(arr[0], arr[1], arr[2]);
      t.step = step;

      bfs(t);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  private void bfs(Tuple3 t) {
    Deque<Tuple3> que = new ArrayDeque<>();

    que.offer(t);

    Tuple3 cur;
    while(!que.isEmpty()) {
      cur = que.poll();

      if(cur.isEq()) {
        System.out.println(cur.step);
        return;
      }

      que.offer(new Tuple3(cur.e[0]+2, cur.e[1], cur.e[2]));
      que.peekLast().step = cur.step + 1;
      que.offer(new Tuple3(cur.e[0], cur.e[1]+2, cur.e[2]));
      que.peekLast().step = cur.step + 1;
      que.offer(new Tuple3(cur.e[0], cur.e[1], cur.e[2]+2));
      que.peekLast().step = cur.step + 1;

      que.offer(new Tuple3(cur.e[0]+1, cur.e[1]+1, cur.e[2]));
      que.peekLast().step = cur.step + 1;
      que.offer(new Tuple3(cur.e[0], cur.e[1]+1, cur.e[2]+1));
      que.peekLast().step = cur.step + 1;
      que.offer(new Tuple3(cur.e[0]+1, cur.e[1], cur.e[2]+1));
      que.peekLast().step = cur.step + 1;
      
    }
  }

  class Tuple3 {
    int[] e;
    int state;
    int step;

    public Tuple3(int a, int b, int c) {
      e = new int[3];
      e[0] = a;
      e[1] = b;
      e[2] = c;
      state = (a*10000) + (b*100) + c;
      step = 0;
    }

    @Override
    public boolean equals(Object obj) {
      if(obj == this) return true;
      if(obj == null) return false;
      if(!(obj instanceof Tuple3)) return false;

      Tuple3 ref = (Tuple3) obj;

      return this.state == ref.state ? true : false;
    }

    public boolean isEq() {
      return (e[0] == e[1]) && (e[1] == e[2]);
    }
  }
}