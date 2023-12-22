import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean first = true;
		String[] col1 = null;
		int num = 0;
		int maxGravity = 0;
		back[] ba = null;
		gra[] g = null;
		int i = 0;
		while(in.hasNext()){
			String str = in.nextLine();
			if(first){
				col1 = str.split(" ",0);
				num = Integer.parseInt(col1[0]);
				maxGravity = Integer.parseInt(col1[1]);
				ba = new back[num];
				g = new gra[num];
				first = false;
			}else{
				String[] col2 = str.split(" ",0);
				ba[i] = new back(Integer.parseInt(col2[1]),Integer.parseInt(col2[0]));
				g[i] = new gra(Integer.parseInt(col2[1]),Integer.parseInt(col2[0]));
				i++;
			}
			if(i == num){
				break;
			}
		}
		Arrays.sort(ba);
		Arrays.sort(g);
		int vTotal = 0;
		int gg = 0;
		int vv = 0;
		for(gra obj : g){
			gg +=obj.getGravity();
			vv += obj.getValue();
			if(gg >= maxGravity){
				vTotal = vv;
				break;
			}
		}
		int std = 0;
		int gMax = 0;
		int nowVtotal = 0;
		while(std != num){
			for(int z=std;z<num;z++){
				gMax += ba[z].getGravity();
				nowVtotal += ba[z].getValue();
				if(gMax >= maxGravity){
					if(gMax > maxGravity){
						gMax -= ba[z].getGravity();
						nowVtotal -= ba[z].getValue();
					}
					if(vTotal < nowVtotal){
						vTotal = nowVtotal;
					}
				}
			}
			for(int x=0;x<std;x++){
				gMax += ba[x].getGravity();
				nowVtotal += ba[x].getValue();
				if(gMax >= maxGravity){
					if(gMax > maxGravity){
						gMax -= ba[x].getGravity();
						nowVtotal -= ba[x].getValue();
					}
					if(vTotal < nowVtotal){
						vTotal = nowVtotal;
					}
				}
			}
			if(vTotal < nowVtotal){
					vTotal = nowVtotal;
			}
			std++;
			nowVtotal = 0;
			gMax = 0;
		}
		System.out.println(vTotal);
	}

}
class back implements Comparable<back>{
	int gravity = 0;
	int value = 0;

	public  back(int value,int gravity){
		this.value = value;
		this.gravity = gravity;
	}

	public int getValue(){
		return value;
	}
	public int getGravity(){
		return gravity;
	}

	@Override
	public int compareTo(back o) {
		return o.value - this.value ;
	}

}

class gra implements Comparable<gra>{
	int gravity = 0;
	int value = 0;

	public  gra(int value,int gravity){
		this.value = value;
		this.gravity = gravity;
	}

	public int getValue(){
		return value;
	}
	public int getGravity(){
		return gravity;
	}

	@Override
	public int compareTo(gra o) {
		return o.gravity - this.gravity ;
	}


}

