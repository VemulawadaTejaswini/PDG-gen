
import java.util.Scanner;

public class Main {

	static class node{
		int val=-1;
		node prev;
		node next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		int []arr=new int[str.length()];
		for(int i=0;i<str.length();i++) {
			arr[i]=str.charAt(i)-'0';
		}
		node start=new node();
		node ptr=new node();
		ptr=start;
		for(int i=str.length()-1;i>=0;i--) {
			if(start.val==-1) {
				node n1=new node();
				n1.val=arr[i];
				n1.prev=null;
				n1.next=null;
				start=n1;
				ptr=start;
			}else if(arr[i]==1) {
				//System.out.println(i);
				if(ptr.val==1) {
					//System.out.println("jj");
					node n1=new node();
					n1.val=arr[i];
					n1.prev=ptr;
					n1.next=null;
					ptr.next=n1;
					ptr=n1;
					
				}else {
					if(start!=null&&ptr!=start) {
						//System.out.println("mmmm");
						ptr=ptr.prev;
						ptr.next=null;
					}else if(ptr==start) {
						start=new node();
						ptr=start;
					}
				}
			}else {
				
				if(ptr.val==0){
					node n1=new node();
					n1.val=arr[i];
					n1.prev=ptr;
					n1.next=null;
					ptr.next=n1;
					ptr=n1;
				}else {
					if(start!=null&&ptr!=start) {
						//System.out.println("mmmm");
						ptr=ptr.prev;
						ptr.next=null;
					}else if(ptr==start) {
						start=new node();
						ptr=start;
					}
				}
					
				
			}
//			node n=start;
//			while(n!=null) {
//				System.out.print(n.val+" ");
//				n=n.next;
//			}
//			System.out.println("klklklklll"+i);
		}
		int cnt=0;
		while(start!=null) {
			if(start.val!=-1)
				cnt++;
			start=start.next;
			
		}
		System.out.println(str.length()-cnt);
	}

}
