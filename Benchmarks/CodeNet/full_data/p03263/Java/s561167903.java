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

	static ArrayDeque<String> moves=new ArrayDeque<>();

	public static void main(String[] $){


		for(int i=0;i<h;++i)
			Arrays.setAll(f[i],o->s.nextInt());

		int fx=-1,fy=-1,ty=-1,tx=-1;

		int j=0,e=0,d=0;
		loop:
		for(int i=0;i<h;++i){
			if(ty==-1){
				if(i%2==0){
					j=0;
					e=w;
					d=1;
				}else{
					j=w-1;
					e=-1;
					d=-1;
				}
			}

			for(;j!=e;j+=d){
				if(ty>=0){//roll
					if(i==ty&&j==tx){
						ty=-1;
					}else{
						if(j+d==e)
							moves.add((i+1)+" "+(j+1)+" "+(i+2)+" "+(j+1));
						else
							moves.add((i+1)+" "+(j+1)+" "+(i+1)+" "+(j+d+1));
					}
				}else{
					if(f[i][j]%2==1){
						if(fy==-1){
							fy=i;
							fx=j;
						}else{
							ty=i;
							tx=j;
							i=fy-1;
							j=fx;
							fy=-1;
							if((i+1)%2==0){
								e=w;
								d=1;
							}else{
								e=-1;
								d=-1;
							}
							continue loop;
						}
					}
				}
			}
		}
		System.out.println(moves.size());
		moves.forEach(System.out::println);
	}
}
