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
	  
	  //木構造を生成
	  for(int i=0; i<N-1; i++) {
		  int a = sc.nextInt();
		  int b = sc.nextInt();
		  if (nodeList[a] == null) {
			  nodeList[a] = new Node(a);
		  }
		  if (nodeList[b] == null) {
			  nodeList[b] = new Node(b);
		  }
		  
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
    	 Set<Integer> set = nodeList[number].connect;
    	 if(set.size()>1) {
    	 	for(int i: set) {
    	 		if(i != parent)
    	 		dfs(i, number);
    	 	}
    	 }
     }
     }
  
//木クラス
	class Node {
		final int number;
		Set<Integer> connect; //枝で繋がっている木
		
		public Node(int number) {
			this.number = number;
			this.connect = new HashSet<>();
		}
	}