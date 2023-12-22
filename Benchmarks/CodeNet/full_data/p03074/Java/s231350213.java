import java.util.*;
public class Main {
	ArrayList<Tree> t = new ArrayList<Tree>();
	int count;
	String num = "1";
	int max =1;

	Main(int n,int k,String[] S){
		for(int p=0;p<n;p++){
			if(!(S[p].equals(num))){
				Iterator it = t.iterator();
				while(it.hasNext()){
					Tree tree = (Tree)(it.next());
					if(tree.addSum(count)){
						int m = tree.getSum();
						if(m>max)max=m;
						it.remove();
					}
				}
				if(num.equals("0")){
					num="1";
				}else{
					num="0";
					t.add(new Tree(k,count));
				}
				count=0;
			}
			count++;
		}

		Iterator it = t.iterator();
		while(it.hasNext()){
			Tree tree = (Tree)(it.next());
			tree.addSum(count);
			int m = tree.getSum();
			if(m>max)max=m;
		}

		// 出力
		System.out.println(max);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		String s = sc.next();
		String[] S = s.split("");

		new Main(n,k,S);
	}
}

class Tree{
	int k;
	int sum;

	Tree(int k,int num){
		this.k = k*2;
		sum = num;
	}

	public boolean addSum(int num){
		sum += num;
		k--;
		if(k>0)return false;
		else return true;
	}

	public int getSum(){
		return sum;
	}
}