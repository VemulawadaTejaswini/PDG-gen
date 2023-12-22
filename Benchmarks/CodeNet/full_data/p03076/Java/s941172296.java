import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static class Node {
		int key;
		int value;
		Node(int key, int value){
			this.key = key;
			this.value = value;
		}
		public int getKey() {
			return key;
		}
		public void setKey(int key) {
			this.key = key;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int[] nums = {a,b,c,d,e};
		int sum = 0;
		int[] arr = new int[5];
		List<Node> list = new ArrayList<Node>();
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<=9; j++) {
				if((nums[i]+j)%10==0) {
					arr[i] = j;
				}
			}
			Node node = new Node(nums[i], arr[i]);
			list.add(node);
		}
		Collections.sort(list, new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				return o1.getValue()-o2.getValue();
			}
		});

		for(int i=0; i<list.size()-1; i++) {
			sum += list.get(i).getKey()+list.get(i).getValue();
		}
		sum += list.get(4).getKey();
		System.out.println(sum);
    }
}
