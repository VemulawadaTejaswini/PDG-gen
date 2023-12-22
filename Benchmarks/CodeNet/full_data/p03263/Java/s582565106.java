import java.util.*;

public class Main{

	static class Move{
		int fy,fx,ty,tx;
		public Move(int fy,int fx,int ty,int tx){
			this.fy=fy+1;
			this.fx=fx+1;
			this.ty=ty+1;
			this.tx=tx+1;
		}
		@Override
		public String toString(){
			return fy+" "+fx+" "+ty+" "+tx;
		}
	}

	static Scanner s=new Scanner(System.in);
	static int h=s.nextInt(),w=s.nextInt();
	static int[][] f=new int[h][w];

	static ArrayList<Move> moves=new ArrayList<>();

	public static void main(String[] $){


		for(int i=0;i<h;++i)
			Arrays.setAll(f[i],o->s.nextInt());

		int px=-1,py=-1;

		for(int i=0;i<h;++i){
			int j,e,d;
			if(i%2==0){
				j=0;
				e=w;
				d=1;
			}else{
				j=w-1;
				e=-1;
				d=-1;
			}

			for(;j!=e;j+=d){
				if(f[i][j]%2==1){
					if(py==-1){
						py=i;
						px=j;
					}else{
						f(py,px,i,j);
						py=-1;
					}
				}
			}
		}
		System.out.println(moves.size());
		moves.forEach(System.out::println);
	}
	static void f(int py,int px,int i,int j){
		--f[py][px];
		++f[i][j];
		for(;py+1<=i-1;++py){
			moves.add(new Move(py,px,py+1,px));
		}
		if(px<j){
			for(;px<j;++px)
				moves.add(new Move(py,px,py,px+1));
		}else{
			for(;px>j;--px)
				moves.add(new Move(py,px,py,px-1));
		}
		if(py<i)
			moves.add(new Move(py,px,py+1,px));
	}
}
