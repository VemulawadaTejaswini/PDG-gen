import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int iin = sc.nextInt();
		int iim = sc.nextInt();
		int iir = sc.nextInt();
		HashSet<Integer> igolist = new HashSet<Integer>();
		int[][] iroot = new int[iin][iin];
		int[][] igroot = new int[iir][iir];
		int iia = 0;
		int iib = 0;
		int iic = 0;
		for(int r=0;r<iir;r++){
			iia = sc.nextInt();
			iia--;
			igolist.add(iia);
		}
		for(int m=0;m<iim;m++){
			iia = sc.nextInt();
			iib = sc.nextInt();
			iic = sc.nextInt();
			iia--;
			iib--;
			iroot[iia][iib] = iic;
			iroot[iib][iia] = iic;
		}
		for(int i=0;i<iin;i++){
			for(int j=0;j<iin;j++){
				if(i==j){
					continue;
				}
				if(iroot[i][j]==0){
					iroot[i][j] = 200000;
				}
			}
		}
		for(int x=0;x<iin;x++){
			for(int y=0;y<iin;y++){
				for(int z=0;z<iin;z++){
					if(x==y || y==z || x==z){
						continue;
					}
					if(iroot[y][z] > iroot[y][x] + iroot[x][z]){
						iroot[y][z] = iroot[y][x] + iroot[x][z];
					}
				}
			}
		}
		iib = 0;
		iic = 0;
		for(int i=0;i<iin;i++){
			if(igolist.contains(i)){
				for(int j=i+1;j<iin;j++){
					if(igolist.contains(j)){
						iia = iroot[i][j];
						if(iib<iia){
							iib = iia;
						}
						iic += iia; 
					}
				}
			}
		}
		if(iir==2){
			System.out.println(iic);
		}
		else{
			System.out.println(iic-iib);
		}
    }
}
