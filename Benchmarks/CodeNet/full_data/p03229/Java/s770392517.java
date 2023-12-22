import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int a[]=new int[N];
		int cen[]=new int[N];
		int lef[]=new int[N+10];
		int rig[]=new int[N+10];
		int small=0,big=0;
		int z=0,y=1,x=1,w=1,lef2=0,rig2=0,ir=0,key=0;
		while(z<N) {
			a[z]=stdIn.nextInt();
			z++;
		}z=0;
		Arrays.sort(a);
		while(z<N) {
			if(a[0]!=a[z]) {
				small=z;
				break;
			}
			z++;
		}z=N-1;
		while(z>=0) {
			if(a[N-1]!=a[z]) {
				big=z+2;
				break;
			}
			z--;
		}z=0;
		if(small>N-big+1) {
			y=0;
			while(z<small+N-big+1) {
				if(z%2==0) {
					cen[z]=a[y];
					y++;
				}
				else {
					cen[z]=a[N-x];
					x++;
				}
				z++;
			}z=0;y=1;x=0;
			lef2=(N-(small+N-big+1))/2;
			if((N-(small+N-big+1))%2==1)
				ir=1;
			if(ir==1) {
				while(z<lef2+1) {
					if(z%2==0) {
						lef[z]=a[small+1+lef2-y*2];
						z++; y++;
					}
					else {
						lef[z]=a[small+1+lef2+x*2];
						z++;x++;
					}
				}
			}
			else {
				while(z<lef2) {
					if(z%2==0) {
						lef[z]=a[small+lef2-y*2];
						z++;y++;
					}
					else {
						lef[z]=a[small+1+lef2+x*2];
						z++;x++;
					}
				}
			}x=0;y=0;
			if(ir==1) {
				while(y<lef2) {
					if(y%2==0) {
						rig[y]=a[small+lef2+x*2];
						x++;y++;
					}
					else {
						rig[y]=a[small+lef2-w*2];
						y++; w++;
					}
				}
			}
			else {
				w=0;
				while(y<lef2) {
					if(y%2==0) {
						rig[y]=a[small-1+lef2-x*2];
						x++;y++;
					}
					else {
						rig[y]=a[small+lef2+w*2];
						w++;y++;
					}
				}
			}x=0;
		}
		if(small<N-big+1) {
			x=0;
			while(z<small+N-big+1) {
				if(z%2==0) {
					cen[z]=a[N-y];
					y++; z++;
				}
				else {
					cen[z]=a[x];
					x++;z++;
				}
			}z=0;y=1;x=0;
			lef2=(N-(small+N-big+1))/2;
			if((N-(small+N-big+1))%2==1)
				ir=1;
			if(ir==1) {
				while(z<lef2+1) {
					if(z%2==0) {
						lef[z]=a[small+1+lef2+x*2];
						z++; x++;
					}
					else {
						lef[z]=a[small+1+lef2-y*2];
						z++;y++;
					}
				}
			}
			else {
				y++;
				while(z<lef2) {
					if(z%2==0) {
						lef[z]=a[small+1+lef2+x*2];
						z++;x++;
					}
					else {
						lef[z]=a[small+2+lef2-y*2];
						z++;y++;
					}
				}
			}x=0;y=0;
			if(ir==1) {
				while(y<lef2) {
					if(y%2==0) {
						rig[y]=a[small+lef2-x*2];
						x++;y++;
					}
					else {
						rig[y]=a[small+lef2+w*2];
						w++; y++;
					}
				}
			}
			else {
				w=0;
				while(y<lef2) {
					if(y%2==0) {
						rig[y]=a[small+lef2+x*2];
						x++;y++;
					}
					else {
						rig[y]=a[small-1+lef2-w*2];
						y++;w++;
					}
				}
			}
		}
		if(small==N-big+1) {
			while(z<small+N-big+1) {
				if(z%2==0) {
					cen[z]=a[big-1];
					z++;
				}
				else {
					cen[z]=a[small-1];
					z++;
				}
			}z=0;
			lef2=(N-(small+N-big+1))/2;
			if((N-(small+N-big+1))%2==1)
				ir=1;
			if(ir==1) {
				y=0;
				while(z<lef2) {
					if(z%2==0) {
						lef[z]=a[small+lef2-1-y*2];
						y++;z++;
					}
					else {
						lef[z]=a[small+lef2+x*2];
						x++;z++;
					}
				}y=0;x=0;
				while(y<lef2) {
					if(y%2==0) {
						rig[y]=a[small+lef2+1+x*2];
						y++;x++;
					}
					else {
						 rig[y]=a[small+lef2-w*2];
						 y++;w++;
					}
				}w=0;x=0;
				if(a[small+lef2]-lef[0]>rig[y-1]-a[small+lef2])
					rig2=1;
				if(a[small+lef2]-lef[0]<rig[y-1]-a[small+lef2]||a[small+lef2]-lef[0]==rig[y-1]-a[small+lef2])
					rig2=2;
			}
			else {
				y=0;
				while(z<lef2) {
					if(z%2==0) {
						lef[z]=a[small+lef2+y*2];
						z++; y++;
					}
					else {
						lef[z]=a[small+lef2-x*2];
						z++; x++;
					}
				}y=0;x=0;
				while(y<lef2) {
					if(y%2==0) {
						rig[y]=a[small+lef2-1-x*2];
						y++; x++;
					}
					else {
						rig[y]=a[small+lef2-1+w*2];
						y++; w++;
					}
				}
			}
		}
		x=1;w=0;ir=1;
		if(small+1==big) {
			while(x<small+N-big+1) {
				if(cen[x]-cen[x-1]<0)
					ir=-1;
				key+=(cen[x]-cen[x-1])*ir;
				ir=1;
				x++;
			}
		}
		else {
			if(rig2==1)
				key=a[small+lef2]-lef[0];
			while(x<z) {
				if(lef[x]-lef[x-1]<0)
					ir=-1;
				key+=(lef[x]-lef[x-1])*ir;
				ir=1;
				x++;
			}x=1;
			if(lef[z-1]-cen[0]<0)
				key+=cen[0]-lef[z-1];
			else
				key+=lef[z-1]-cen[0];
			while(x<small+N-big+1) {
				if(cen[x]-cen[x-1]<0)
					ir=-1;
				key+=(cen[x]-cen[x-1])*ir;
				ir=1;
				x++;
			}
			if(cen[small+N-big]-rig[y-1]<0)
				key+=rig[y-1]-cen[small+N-big];
			else
				key+=cen[small+N-big]-rig[y-1];
			y-=1;
			while(y!=0) {
				if(rig[y]-rig[y-1]<0)
					ir=-1;
				key+=(rig[y]-rig[y-1])*ir;
				ir=1;
				y--;
			}
			if(rig2==2)
				key+=rig[0]-a[small+lef2];
		}
		System.out.println(key);
	}
}