import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

	static BufferedReader reader;
	final static boolean MODE_DEBUG = false;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		int N = readLineInt()[0];
		ArrayList<TreeNode<Integer,Integer>> tn = new ArrayList<TreeNode<Integer,Integer>>();
		for(int n=0;n<N;n++) {
			TreeNode<Integer,Integer> tnp = new TreeNode<>();
			tnp.item = -1;
			tn.add(tnp);
		}
		for(int i=1;i<N;i++) {
			int[] uvw = readLineInt();
			int u = uvw[0]-1;
			int v = uvw[1]-1;
			int w = uvw[2];
			if(u>v) {
				int tmp = u;
				u = v;
				v = tmp;
			}
			tn.get(v).addNeighbor(tn.get(u),w);
		}
		int CNT = N-1;
		tn.get(0).item = 0;
		HashSet<TreeNode<Integer,Integer>> tn_finished = new HashSet<>();
		TreeNode<Integer,Integer> tmp = tn.get(0);
		tn_finished.add(tmp);
		HashSet<TreeNode<Integer,Integer>> tn_frontiere = new HashSet<>();
		for(TreeVertex<Integer,Integer> vt : tmp.vertexes) {
			tn_frontiere.add(vt.another(tmp));
		}
		while(CNT>0) {
			TreeNode<Integer,Integer> tnc = tn_frontiere.iterator().next();
			for(TreeVertex<Integer,Integer> v : tnc.vertexes) {
				TreeNode<Integer,Integer> another = v.another(tnc);
				if(another.item>=0) {
					tnc.item = (another.item+v.item)%2;
					CNT--;
					tn_finished.add(tnc);
					tn_frontiere.remove(tnc);
					for(TreeVertex<Integer,Integer> vt : tnc.vertexes) {
						if(!tn_finished.contains(vt.another(tnc))) {
							tn_frontiere.add(vt.another(tnc));
						}
					}
					break;
				}
			}
		}
		for(int i=0;i<N;i++) {
			print(tn.get(i).item);
		}
	}
	
	//functions here
	//note that all methods should be STATIC
	static int getAnother(int v) {
		if(v==0) {return 0;}
		return 3-v;
	}

	private static <T> int arraySearch(T needle, T[] heystack) {
		for(int i=0;i<heystack.length;i++) {
			if(needle.equals(heystack[i])) {
				return i;
			}
		}
		return -1;
	}
	private static int[] sort(int[] base) {
		int[] copy = array_copy(base);
		Arrays.sort(copy);
		return copy;
	}
	private static int[] array_copy(int[] base) {
		int[] copy = new int[base.length];
		for(int i=0;i<base.length;i++) {
			copy[i] = base[i];
		}
		return copy;
	}
	private static int[] asArray(ArrayList<Integer> ints) {
		int[] intlist = new int[ints.size()];
		for(int i=0;i<intlist.length;i++) {
			intlist[i] = ints.get(i);
		}
		return intlist;
	}
	private static String[] readLine(){
		try{
			return reader.readLine().split(" ");
		}catch(Exception e){
			e.printStackTrace();
			return new String[]{e.getMessage()};
		}
	}
	private static int[] readLineInt(){
		try{
			String[] s = readLine();
			int[] ints = new int[s.length];
			for(int i=0;i<ints.length;i++) {
				ints[i] = Integer.parseInt(s[i]);
			}
			return ints;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static byte[] readLineByte(){
		try{
			String[] s = readLine();
			byte[] bytes = new byte[s.length];
			for(int i=0;i<bytes.length;i++) {
				bytes[i] = Byte.parseByte(s[i]);
			}
			return bytes;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static char[] readLineChar(){
		try{
			String[] s = readLine();
			char[] chars = new char[s.length];
			for(int i=0;i<chars.length;i++) {
				chars[i] = (char)Integer.parseInt(s[i]);
			}
			return chars;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}
	private static void printd(Object o){
		if(MODE_DEBUG)System.err.println(o);
	}
	private static void printd(){
		if(MODE_DEBUG)System.err.println();
	}
}

class TreeNode<V,E>{
	HashSet<TreeNode<V,E>> neighbor = new HashSet<>();
	HashSet<TreeVertex<V,E>> vertexes = new HashSet<>();
	V item;
	public void addNeighbor(TreeNode<V,E> neighbor, E item) {
		this.neighbor.add(neighbor);
		neighbor.neighbor.add(this);
		addVertex(neighbor,item);
		return;
	}
	public void addVertex(TreeNode<V,E> to, E item) {
		TreeVertex<V,E> v = new TreeVertex<>();
		v.item = item;
		v.node1 = this;
		v.node2 = to;
		this.vertexes.add(v);
		to.vertexes.add(v);
	}
	public TreeVertex<V,E> getVertexTo(TreeNode<V,E> node){
		for(TreeVertex<V,E> v : vertexes) {
			if(v.node1==this&&v.node2==node || v.node1==node&&v.node2==this) {
				return v;
			}
		}
		return null;
	}
	@Override
	public String toString(){ // TODO 自動生成されたメソッド・スタブ
	return item.toString(); }
}

class TreeVertex<V,E>{
	TreeNode<V,E> node1;
	TreeNode<V,E> node2;
	E item;
	public TreeNode<V,E> another(TreeNode<V,E> from){
		if(node1==from) {return node2;}
		else if(node2==from) {return node1;}
		else {return null;}
	}
	@Override
	public String toString(){ // TODO 自動生成されたメソッド・スタブ
	return node1.toString()+"<- ["+item.toString()+"] ->"+node2.toString(); }
}
