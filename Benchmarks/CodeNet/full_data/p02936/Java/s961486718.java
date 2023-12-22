import java.util.*;

public class Main{
	public static List<Node> nodes = new ArrayList<Node>();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		for(int i=0;i<N;i++) {
			nodes.add(new Node());
		}
		for(int i=0;i<N-1;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			nodes.get(a-1).getUnders().add(nodes.get(b-1));
			nodes.get(b-1).getOvers().add(nodes.get(a-1));
		}
		for(int i=0;i<Q;i++) {
			nodes.get(sc.nextInt()-1).addCnt(sc.nextInt());
		}
		for(Node tmp:nodes) {
			if(tmp.getOvers().size()==0) {
				Node parent = tmp;
				sumCnt(parent,0);
				break;
			}
		}
	
		StringBuilder sb = new StringBuilder();
		for(Node tmp:nodes) {
			sb.append(tmp.getCnt());
			sb.append(" ");
		}
		System.out.println(sb.toString());	
	}
	
	static void sumCnt(Node node, int p) {
		node.addCnt(p);
		for(Node tmp:node.getUnders()){
			sumCnt(tmp,node.getCnt());
		}
	}
	
}

class Node{
	private List<Node> unders = new ArrayList<Node>();
	private List<Node> overs = new ArrayList<Node>();
	private int cnt=0;
	
	public void addCnt(int p) {
		this.cnt+=p;
	}
	
	//g&&s
	public List<Node> getUnders() {
		return unders;
	}
	public void setUnders(List<Node> unders) {
		this.unders = unders;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public List<Node> getOvers() {
		return overs;
	}

	public void setOvers(List<Node> overs) {
		this.overs = overs;
	}
	
	
}