
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean flag = true;
		if(s.charAt(0) != '1' || s.charAt(s.length() - 2) != '1' || s.charAt(s.length() - 1) != '0')
			flag = false;
		if(flag) {
			for(int i = 1; i < s.length() / 2; i++) {
				if(s.charAt(i) != s.charAt(s.length() - 2 - i)) {
					flag = false;
					break;
				}
			}
		}
		if(flag) {
			List<Node> node = new ArrayList<>();
			int from = 1;
			for(int i = 1; i < s.length(); i++) {
				if(s.charAt(i) == '1') {
					from = i + 2;
					node.add(new Node(1, i + 1));
					node.add(new Node(1, i + 2));
					break;
				} else {
					node.add(new Node(1, i + 1));
				}
			}
			for(int i = from - 1; i < s.length() - 1; i++) {
				node.add(new Node(from, i + 2));
				if(s.charAt(i) != '0') {
					from = i + 2;
				}
			}
			for(Node e : node) {
				System.out.println(e.getFrom() + " " + e.getTo());
			}
		} else {
			System.out.println(-1);
		}

	}
}

class Node {
	private int from;
	private int to;

	protected Node(int from, int to) {
		super();
		this.from = from;
		this.to = to;
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

}
