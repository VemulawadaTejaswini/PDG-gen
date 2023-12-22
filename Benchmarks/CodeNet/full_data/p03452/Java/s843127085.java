import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Queue;
import java.util.Scanner;

/**
 * https://arc090.contest.atcoder.jp/tasks/arc090_b
 */
public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Node[] nodes = new Node[N];
		for(int i=0; i<N; i++) nodes[i] = new Node(i);
		int M = sc.nextInt();
		for(int i=0; i<M; i++){
			int l = Integer.parseInt(sc.next())-1;
			int r = Integer.parseInt(sc.next())-1;
			int d = Integer.parseInt(sc.next());
			nodes[l].neighbor.put(nodes[r], d);
			nodes[l].neighbor2.put(nodes[r], d);
			nodes[r].neighbor2.put(nodes[l], d);
			
		}
		sc.close();
		
		int color = assignColor(nodes);
		List<Node>[] map = new ArrayList[color];
		for(int i=0; i<color; i++) map[i] = new ArrayList<>();
		for(Node n: nodes){ map[n.color].add(n); }
		
		String ans = "Yes";
		for(int i=0; i<color; i++){
			List<Node> origin = map[i];
			List<Node> list = topologicalSort(origin);
			if(list.size()!=origin.size()){
				ans = "No"; break;
			}
			list.get(0).x = 0;
			for(Node n:list){
				if(n.x==-1) continue;
				for(Entry<Node, Integer> entry: n.neighbor.entrySet()){
					Node nn = entry.getKey();
					long d = entry.getValue();
					if(nn.x==-1){
						nn.x = n.x + d;
					}else{
						if( nn.x != n.x + d){
							ans = "No"; break;
						}
							
					}
				}
				if(ans.equals("No")) break;
			}
			if(ans.equals("No")) break;
		}
			
		System.out.println(ans);
		
	}
	
	static class Node{
		int id;
		long x = -1;
		Map<Node,Integer> neighbor = new HashMap<>();
		Map<Node,Integer> neighbor2 = new HashMap<>();
		int color = -1;
		int status = -1;
		int inDegree = 0;
		long cost;
		Node(int id){
			this.id = id;
		}
	}
	
	static int assignColor(Node[] nodeList){
		int color = 0;
		for(Node node:nodeList){
			if(node.color==-1){
				List<Node> que = new ArrayList<>();
				node.color = color;
				que.add(node);
				while(que.size()>0){
					for(Node n: que.remove(0).neighbor2.keySet()){
						if(n.color==-1){
							n.color = color;
							que.add(n);
						}
					}
				}
				color++;
			}
		}
		return color;
	}
	
	static List<Node> topologicalSort(List<Node> nodeList){
		List<Node> sortedList = new ArrayList<>();
		for(Node node:nodeList){
			node.status = -1;
			node.inDegree = 0;
		}
		for(Node node:nodeList)
			for(Node n:node.neighbor.keySet())
				n.inDegree++;
		for(Node node:nodeList){
			if(node.status!=-1 || node.inDegree>0) continue;
			Queue<Node> que = new ArrayDeque<>();
			node.status=1;
			que.add(node);
			while(!que.isEmpty()){
				Node current = que.remove();
				sortedList.add(current);
				for(Node n:current.neighbor.keySet()){
					if(--n.inDegree==0 && n.status==-1){
						n.status=1;
						que.add(n);
					}
				}
			}
		}
		
		return sortedList;
	}

}