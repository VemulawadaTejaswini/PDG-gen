import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    long answer =0;
    //それぞれの幸福度をゆうせんど付きキューに入れて管理
    Queue<Long> p = new PriorityQueue<Long>();
    Queue<Long> q = new PriorityQueue<Long>();
    Queue<Long> r = new PriorityQueue<Long>();
    int N = A+B+C-X-Y;//最後に残る個数
    //最後に残ったリンゴたちの幸福度の総和がminになるように残せばよい
    //残した赤リンゴをrR,緑をrGと置く
    
    for(int i=0;i<A;i++){
      p.add(sc.nextLong());
    }
    for(int i=0;i<B;i++){
      q.add(sc.nextLong());
    }    
    for(int i=0;i<C;i++){
      r.add(sc.nextLong());
    }
    //リンゴを残す
    //残したリンゴカウンタ
    int rR=0;
    int rG=0;
    long rem=0;
    for(int i=1;i<N;i++){
      if(rR<A&&r.size()>0&&p.peek()<r.peek()){//赤を残すべきで残す赤がまだ残っているとき
        rem=rem+p.poll();
        rR++;
      }else if(rG<B&&r.size()>0&&q.peek()<r.peek()){//緑を残すべきで緑がまだ残っているとき
        rem=rem+q.poll();
        rG++;
      }else if(r.size()==0&&p.peek()<q.peek()){//それ以外
        rem=rem+p.poll();
      }else if(r.size()==0&&q.peek()<=p.peek()){//それ以外
        rem=rem+q.poll();
      }else{
        rem=rem+r.poll();
      }
    }
    //キューに残った奴の総計が答え
    int zp =p.size();
    int zq = q.size();
    int zr = r.size();
    for(int i=0;i<zp;i++){
      answer = answer + p.poll();
    }
    for(int i=0;i<zq;i++){
      answer = answer + q.poll();
    }    
    for(int i=0;i<zr;i++){
      answer = answer + r.poll();
    }    
    System.out.println(answer);
  }
  

  
}