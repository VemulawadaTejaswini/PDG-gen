import java.io.*;
import java.util.*;

class Solver extends Main{
	Solver(){
	}
}

class Main{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc=new Scanner(System.in);
		int[] prm=readlI(sc," ");
		int n=prm[0];
		int m=prm[1];
		long[][] data=new long[n][2]; 
		for(int i=0; i<prm[0]; i++){
			data[i]=readlL(sc," ");
		}
		long base=data[0][0];
		List<Long> a=new ArrayList<Long>();
		List<Long> b=new ArrayList<Long>();
		List<Long> c=new ArrayList<Long>();
		List<Long> d=new ArrayList<Long>();
		for(int i=0; i<data.length; i++){
			if(data[i][0]==base){
				a.add(data[i][1]);
			}else if(data[i][0]==base+1){
				b.add(data[i][1]);
			}else if(data[i][0]==base+2){
				c.add(data[i][1]);
			}else if(data[i][0]==base+3){
				d.add(data[i][1]);
			}
		}
		Collections.sort(a);Collections.reverse(a);a.add(0,(long)0);
		Collections.sort(b);Collections.reverse(b);b.add(0,(long)0);
		Collections.sort(c);Collections.reverse(c);c.add(0,(long)0);
		Collections.sort(d);Collections.reverse(d);d.add(0,(long)0);
		for(int i=1; i<a.size(); i++) a.set(i,(long)a.get(i)+a.get(i-1));
		for(int i=1; i<b.size(); i++) b.set(i,(long)b.get(i)+b.get(i-1));
		for(int i=1; i<c.size(); i++) c.set(i,(long)c.get(i)+c.get(i-1));
		for(int i=1; i<d.size(); i++) d.set(i,(long)d.get(i)+d.get(i-1));
		long val=0;
		long wgt=0;
		long total=0;
		for(int i=0; i<a.size(); i++){
			for(int j=0; j<b.size(); j++){
				for(int k=0; k<c.size(); k++){
					for(int l=0; l<d.size(); l++){
						val=a.get(i)+b.get(j)+c.get(k)+d.get(l);
						wgt=base*i+(base+1)*j+(base+2)*k+(base+3)*l;
						if(wgt<=(long)m && total<val){
							total=val;
						}
					}
				}
			}
		}
		puts(total);
	}	
	
	//utility
	static int[] readlI(Scanner sc, String dl){
		return Arrays.stream(sc.nextLine().trim().split(dl)).mapToInt(Integer::parseInt).toArray();
	}
	static long[] readlL(Scanner sc, String dl){
		return Arrays.stream(sc.nextLine().trim().split(dl)).mapToLong(Long::parseLong).toArray();
	}
	static int readI(Scanner sc){
		return Integer.parseInt(sc.nextLine().trim());
	}
	static String[] readlS(Scanner sc, String dl){
		return sc.nextLine().trim().split(dl);
	}
	static String resadS(Scanner sc){
		return sc.nextLine().trim();
	}
	@SuppressWarnings("unchecked")
	static <T> void puts(T... args){
		for(int i=0; i<args.length-1; i++){
			System.out.printf("%s ",args[i]);
		}
		System.out.println(args[args.length-1]);
	}
	static void puts(int[] ary){
		for(int i=0; i<ary.length-1; i++){
			System.out.printf("%d ",ary[i]);
		}
		System.out.println(ary[ary.length-1]);
	}
	static void puts(long[] ary){
		for(int i=0; i<ary.length-1; i++){
			System.out.printf("%d ",ary[i]);
		}
		System.out.println(ary[ary.length-1]);
	}
	static void tblSort(int[][] tbl){
		Arrays.sort(tbl, new Comparator<int[]>(){
			@Override
			public int compare(int[] a, int[] b){
				if(a[0]==b[0]){
					return b[1]-a[1];
				}else{
					return b[0]-a[0];
				}
			}
		});
	}
}
