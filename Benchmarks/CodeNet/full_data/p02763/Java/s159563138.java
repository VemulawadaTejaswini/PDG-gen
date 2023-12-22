import java.util.*;
import java.util.function.*;

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		SegmentTree<BitSet> seg=new SegmentTree<>(n,
				new BitSet(0),
				(a,b)->{
					BitSet o=(BitSet)a.clone();
					o.or(b);
					return o;
				});

		BitSet[] cache=new BitSet[26];
		for(int i=0;i<26;++i){
			cache[i]=new BitSet(i+1);
			cache[i].set(i);
		}

		{
			String t=s.next();
			for(int i=0;i<n;++i)
				seg.build_set(i,cache[t.charAt(i)-'a']);
			seg.build();
		}

		for(int q=s.nextInt();q>0;--q){
			if(s.nextInt()==1){
				seg.apply(s.nextInt()-1,cache[s.next().charAt(0)-'a']);
			}else{
				System.out.println(seg.query(s.nextInt()-1,s.nextInt()).cardinality());
			}
		}
	}
}

/**
 * @see http://codeforces.com/blog/entry/18051
 */
class SegmentTree<T>{
	T initv,array[];
	int size;

	/**
	 * a+0=a<br>
	 * a+(b+c)=(a+b)+c
	 */
	BinaryOperator<T> merger;

	SegmentTree(int size,T initvalue,BinaryOperator<T> merger){
		this.size=size;
		this.initv=initvalue;
		this.merger=merger;
		initArray();
	}
	@SuppressWarnings("unchecked")
	private void initArray(){
		array=(T[])new Object[size*2];
		Arrays.fill(array,initv);
	}

	void build_set(int i,T v){
		array[i+size]=v;
	}
	void build(){
		for(int i=size-1;i>0;--i)
			array[i]=merger.apply(array[i<<1],array[i<<1|1]);
	}

	void apply(int p,T value){
		for(array[p+=size]=value;p>1;p>>=1)
			array[p>>1]=merger.apply(array[p],array[p^1]);
	}
	/**
	 * [l, r)
	 */
	T query(int l,int r){
		T res=initv;
		for(l+=size,r+=size;l<r;l>>=1,r>>=1){
			if((l&1)>0) res=merger.apply(res,array[l++]);
			if((r&1)>0) res=merger.apply(res,array[--r]);
		}
		return res;
	}
}
