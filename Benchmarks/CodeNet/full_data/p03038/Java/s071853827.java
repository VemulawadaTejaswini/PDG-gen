import java.util.*;
public class Main {
	public static void myout(Object text){//standard output
		System.out.println(text);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
      int N = sc.nextInt();
      int M = sc.nextInt();
      Long output = new Long(0);
      for(int i = 0; i < N; i++){
        pq.add(sc.nextInt());
      }
      
      //myout(pq);
      for(int i = 0; i < M; i++){
        int pqMin = pq.peek();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(pqMin < c){
          for(int j = 0; j < b; j++){
            int pqMin2 = pq.poll();
            if(pqMin2 < c){
              pq.add(c);
            }else{
              pq.add(pqMin2);
              break;
            }
          }
        }
        
      }
      
      Iterator it = pq.iterator();
      //myout(it);
      while(it.hasNext()){
        int tmp = (Integer)it.next();
        //myout(tmp);
        output = output + tmp;
      }
      myout(output);
	}
}
