import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String ret = "No";
		int[] iline = new int[4];
		for(int i=0;i<4;i++){
			iline[i]=line.charAt(i);
		}
		if(iline[0]==iline[1]){
			if(iline[0]==iline[2]){
				ret = "Yes";
			}
		}
		else if(iline[1]==iline[2]){
			if(iline[1]==iline[3]){
				ret = "Yes";
			}
		}
		System.out.println(ret);
    }
}
