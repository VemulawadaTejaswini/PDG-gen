import java.util.PriorityQueue;
import java.util.Scanner;

public class Main
{
	static class AVLTree
	{ //AVL TREE!!!
		Node root = null;
		int nodes = 0;
		
		//I think this was O(log n)
		int getNumberOfEqualOrGreater(int val)
		{
			return getNumberOfEqualOrGreater(val, root);
		}
		
		private int getNumberOfEqualOrGreater(int val, Node pos)
		{
			if(pos==null)return 0;
			if(val == pos.value)
			{
				if(pos.r != null)return pos.r.subsize+1;
				else return 1;
			}
			else if(val < pos.value)
			{
				int fromR = 0;
				if(pos.r != null)fromR = pos.r.subsize;
				return getNumberOfEqualOrGreater(val, pos.l) + fromR + 1;
			}
			else if(val > pos.value)
			{
				return getNumberOfEqualOrGreater(val, pos.r);
			}
			
			return 0;
		}
		
		//I think this was O(log n)
		int getNumberOfEqualOrLesser(int val)
		{
			return getNumberOfEqualOrLesser(val, root);
		}
		
		private int getNumberOfEqualOrLesser(int val, Node pos)
		{
			if(pos==null)return 0;
			if(val == pos.value)
			{
				if(pos.l != null)return pos.l.subsize+1;
				else return 1;
			}
			else if(val > pos.value)
			{
				int fromL = 0;
				if(pos.l != null)fromL = pos.l.subsize;
				return getNumberOfEqualOrLesser(val, pos.r) + fromL + 1;
			}
			else if(val < pos.value)
			{
				return getNumberOfEqualOrLesser(val, pos.l);
			}
			
			return 0;
		}
		
		void add(int i)
		{
			root = insert(root, i);
		}
		
		private Node insert(Node pos, int i)
		{
			if(pos == null)
			{ //place here
				nodes++;
				return new Node(i);
			}
			if(pos.value == i)return pos; //already here!
			
			if(i < pos.value)
			{ //go left
				pos.l = insert(pos.l, i);
			}
			else
			{
				pos.r = insert(pos.r, i);
			}
			
			pos.update();
			return balance(pos);
		}
		
		int getSmallestThatIsBiggerThan(int val)
		{
			return getSmallestThatIsBiggerThan(root, val);
		}
		
		private int getSmallestThatIsBiggerThan(Node pos, int val)
		{
//			if(pos == null)System.out.println("Pos null");
//			System.out.println("Searching at " + pos.value);
			if(pos.value <= val)
			{ //need bigger
				if(pos.r != null)
					return getSmallestThatIsBiggerThan(pos.r, val);
				else 
				{
					return 999999999;
				}
			}
			else
			{ //this or smaller
				if(pos.l != null)
				{
					return Math.min(pos.value, getSmallestThatIsBiggerThan(pos.l, val));
				}
				else return pos.value;
			}
		}
		
		Node getSmallest(Node pos)
		{
			if(pos.l == null)
				return pos;
			else return getSmallest(pos.l);
		}
		
		Node getLargest(Node pos)
		{
			if(pos.r == null)
				return pos;
			else return getLargest(pos.r);
		}
		
		void remove(int i)
		{
			root = delete(root, i);
		}
		
		private Node delete(Node pos, int i)
		{
			if(pos == null)
			{ //already non-existent
				return null;
			}
			if(pos.value == i)
			{
				//delete this
				if(pos.l != null && pos.r != null)
				{
					//you can do either but let's remove from the subtree with bigger height.
					if(pos.l.height >= pos.r.height)
					{
						Node dum = getLargest(pos.l); //return largest of left subtree
						pos.value = dum.value; //copy its value
						pos.l = delete(pos.l, dum.value); //then remove that, while updating all nodes necessary
					}
					else
					{
						Node dum = getSmallest(pos.r); //return smallest of right subtree
						pos.value = dum.value; //copy its value
						pos.r = delete(pos.r, dum.value); //then remove that, while updating all nodes necessary
					}
				}
				else if(pos.l != null)
				{
					pos = pos.l;
				}
				else if(pos.r != null)pos = pos.r;
				else //both are null
				{
					return null;
				}
			}
			
			else if(i < pos.value)
			{ //go left
				pos.l = delete(pos.l, i);
			}
			else
			{
				pos.r = delete(pos.r, i);
			}
			
			pos.update();
			return balance(pos);
		}
		
		Node leftRotate(Node node)
		{
			Node b = node.r;
			node.subsize -= b.subsize;
			node.r = b.l;
			if(b.l!=null)node.subsize += b.l.subsize;
			
			if(b.l!=null)b.subsize -= b.l.subsize;
			b.l = node;
			b.subsize += node.subsize;
			
			node.update();
			b.update();
			return b;
		}
		
		Node rightRotate(Node node)
		{
			Node b = node.l;
			node.subsize -= b.subsize;
			node.l = b.r;
			if(b.r!=null)node.subsize += b.r.subsize;
			
			if(b.r!=null)b.subsize -= b.r.subsize;
			b.r = node;
			b.subsize += node.subsize;
			
			node.update();
			b.update();
			return b;
		}
		
		Node llCase(Node node)
		{
			return rightRotate(node);
		}
		
		Node lrCase(Node node)
		{
			node.l = leftRotate(node.l);
			return rightRotate(node);
		}
		
		Node rrCase(Node node)
		{
			return leftRotate(node);
		}
		
		Node rlCase(Node node)
		{
			node.r = rightRotate(node.r);
			return leftRotate(node);
		}
		
		Node balance(Node node)
		{
			if(node.balance <= -2)
			{
				if(node.l.balance <= 0)
					return llCase(node);
				else
					return lrCase(node);
			}
			else if(node.balance >= 2)
			{
				if(node.r.balance >= 0)
					return rrCase(node);
				else
					return rlCase(node);
			}
			
			return node; //already balanced!
		}
		
		void printout(Node pos)
		{
			if(pos == null)return;
			pos.printout();
			if(pos.l != null)System.out.println(pos.value + "'s L");
			printout(pos.l);
			if(pos.r != null)System.out.println(pos.value + "'s R");
			printout(pos.r);
		}
		
		static class Node
		{
			int balance = 0;
			int height = 0;
			int value;
			
			int subsize = 1; //size of subtree rooted here, i.e. descendants + 1 (self)
			
			Node l = null;
			Node r = null;
			
			void printout()
			{
				System.out.println("Value " + value + " height " + height + " subsize " + subsize + " balance " + balance);
			}
			
			void update()
			{ //leaf has height of 0.
				subsize = 1;
				if(l != null)subsize += l.subsize;
				if(r != null)subsize += r.subsize;
				
				int lh = -1;
				int rh = -1;
				if(l!=null)lh = l.height;
				if(r!=null)rh = r.height;
				height = 1 + Math.max(lh, rh);
				
				balance = rh - lh;
			}
			
			public Node(int i)
			{
				value = i;
			}
		}
	}	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		AVLTree avl = new AVLTree();
		
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		int cols = 0;
		PriorityQueue<Long> pq = new PriorityQueue<>();
		long strongest = -999;
		for(int i = n-1; i >= 0; i--)
		{
			long cur = a[i];
//			System.out.println("i: " + i);
			if(a[i] < strongest)
			{ //weaken
				//get smallest that is larger than or equal to 
				int sacri = avl.getSmallestThatIsBiggerThan(a[i]);
				if(sacri == 999999999)
				{
					System.out.println("ERROR");
				}
//				System.out.println("sacri " + sacri);
				avl.remove(sacri);
				avl.add(a[i]);
				
				strongest = avl.getLargest(avl.root).value;
//				System.out.println(sacri + " becomes " + a[i]);
			}
			else
			{ //new color
				cols++;
				avl.add(a[i]);
//				System.out.println("adding " + a[i]);
				strongest = Math.max(strongest, a[i]);
			}
		}
		System.out.println(cols);

	}

}
