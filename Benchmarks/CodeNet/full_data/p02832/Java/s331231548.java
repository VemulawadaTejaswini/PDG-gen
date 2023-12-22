import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int block = scn.nextInt();
		int[] a = new int[block];
		int count = 1, tmp=1, breakcount = 0;
		for(int i = 0;i<block;i++){
			a[i] = scn.nextInt();
		}
		while(tmp<=block){
			if(a[tmp-1] == count){
				count++;
			}
			else breakcount++;
			tmp++;
		}
		if((count-1)==block)System.out.println("0");
		else if(breakcount==block)System.out.println("-1");
		else System.out.println(breakcount);
	}
}
