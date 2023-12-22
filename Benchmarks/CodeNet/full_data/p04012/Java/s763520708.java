import java.util.*;


public  class Main {
		
	    Node head_node=new Node();
		Node tail_point=head_node;//尾指针
		Node current;//当前位置指针
		
		//插入节点
		public void same(String data) {
			//处理字符串
			String w;
			int sum=1;
			//添加进单链表
			for(int i=0;i<data.length();i++) {
				w=data.substring(i,i+1);
				Node temp=new Node(w);
				tail_point.next=temp;
				temp.next=null;
				tail_point=temp;
				
			}
			
			boolean flag=true;
			current=head_node.next;
			Node current1=current;
			Node current2=current.next;
			do {
				while(current2!=null) {	
					if(current.data.equals(current2.data)) {
						//如果同字符，sum就加一，并且将这个节点删除
						sum++;
						current1.next=current2.next;
						current2=current2.next;
						
					}else {
						//如果字符不相同，就节点向后移动
						current1=current1.next;
						current2=current2.next;
					}
				}
				if(sum%2==0) {
					
					if(current2==null&&current.next==null) {
						System.out.println("Yes");
						flag=false;
					}else {
						current=current.next;
						current1=current;
						current2=current.next;
						sum=1;
					}
				}else {
					flag=false;
					System.out.println("No");
				}
			}while(flag);
				
		}
		
		//处理相同的字符串
		
	public class Node {
		String  data;//数据域
		Node next;//指针域
		//节点构造
		public Node(String data) {
			this.data=data;
		}
		public Node() {
		
		}
			
	}
	
   
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
	    String W=sc.nextLine();
	    Main B=new Main();
	    B.same(W);
	   
	}
}

	