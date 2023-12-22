
import java.util.*;

public class Main {
	public static void main(String[] args){
		new Main();
	}
	
	private int count;
	private Node node[];
	private Scanner scanner;
	
	Main(){
		count = 0;
		scanner = new Scanner(System.in);
		int numOfNodes = scanner.nextInt();
		int numOfBranch = scanner.nextInt();
		node = new Node[numOfNodes];
		for(int i = 0; i < node.length; i++){
			node[i] = new Node();
		}
		
		for(int i = 0; i < numOfBranch; i++){
			int from = scanner.nextInt() - 1;
			int to = scanner.nextInt() - 1;
			node[from].addNextNode(to);
		}
		
		// とりあえずここまででノードたちが完成
		// 探索の開始
		node[0].use();
		int currentNode = 0;
		int preNode = 0;
		int useNode = 1;
		while(node[0].isUse()){
			// node[0]が使われなくなったら終了
			//System.out.println("currentNode = " + currentNode);
			int next = 0;
			try{
			next = node[currentNode].nextNode();
			//System.out.println("next = " + next);
			} catch (Exception e){
				System.out.println(currentNode);
				e.printStackTrace();
				return;
			}
			if(next != -1){
				if(node[next].isUse() == false){
					currentNode = next;
					node[currentNode].use();
					useNode++;
					if(useNode == numOfNodes){
						count++;
					}
				}
			} else {
				// すでにisUseはfalse
				currentNode = preNode;
				useNode--;
			}
		}
		
		System.out.println(count);
	}
	
	
	
	
	
}

class Node{
	private ArrayList<Integer> nextNode = new ArrayList<Integer>();
	
	public void addNextNode(int nodeIndex){
		nextNode.add(nodeIndex);
	}
	private boolean isUseFlag = false;
	private int index = 0;
	public int nextNode(){
		int ret;
		if(index < nextNode.size()){
			//System.out.println("index = " + index + " nextNode.size() = " + nextNode.size());
			ret = nextNode.get(index);
			index++;
		} else {
			index = 0;
			ret = -1;
			isUseFlag = false;
		}
		
		return ret;
	}
	
	public boolean use(){
		if(isUseFlag == false){
			isUseFlag = true;
			return true;
		} else {
			return false;
		}

	}
	public boolean isUse(){
		return isUseFlag;
	}
	
	
}
