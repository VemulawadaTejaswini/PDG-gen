import java.util.*;
import static java.lang.System.*;

public class Main{
	  static  long[] score;
	  static Node[] nodeList;
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);  
	  int N = sc.nextInt();
	  int Q = sc.nextInt();
	  score = new long[N+10];
	  nodeList = new Node[N+10];
	  for(int i=1; i<=N; i++) {
		  nodeList[i] = new Node(i);
	  }
	  
	  //木構造を生成
	  for(int i=0; i<N-1; i++) {
		  int a = sc.nextInt();
		  int b = sc.nextInt();
		  nodeList[a].connect.add(b);
		  nodeList[b].connect.add(a);		  
	  }
	  for(int i=0; i<Q; i++) {
		  int p = sc.nextInt();
		  int x = sc.nextInt();
		  score[p] += x;
	  }
	  
	  dfs(1,0);
	  
	  for(int i=1 ; i<= N; i++) {
		  out.print(score[i] + " ");
	  } 
	  
	}
     static void dfs(int number , int parent){
    	 score[number] += score[parent];
    	 Node node = nodeList[number];
    	 List<Integer> list = node.connect;
    	 for(int i=0; i<list.size(); i++) {
    		 int n = list.get(i);
    		 if(n != parent) {
    			 dfs(n, number);
    		 }
    	 }
     }
  }	
//木クラス
	class Node {
		final int number;
		List<Integer> connect; //枝で繋がっている木
		int parent = -1; //親の番号を記録。
		
		public Node(int number) {
			this.number = number;
			this.connect = new ArrayList<>();
		}
	}