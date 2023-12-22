import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int h = sc.nextInt();
		int w = sc.nextInt();


		String list[][] = new String[h][w];
		for(int i=0;i<h;i++){
				String s = sc.next();
			// System.out.println(s);
				if(s.contains("#")){
						for (int j = 0; j < s.length(); j++) {
						list[i][j]= String.valueOf(s.charAt(j));
					}
				}
		}

		for(int i=0;i<w;i++){
			boolean isIn=false;
			for(int j=0;j<h;j++){
				String ss = list[j][i];

			// System.out.print("h" +j + " w"+i + " ");
			// System.out.println(ss);
				if(Objects.nonNull(ss) && ss.contains("#")){
					isIn =true;
				}
			}

			if(!isIn){
				for(int k=0;k<h;k++){
					list[k][i]="";
				}
			}
		}


		for(int i=0;i<list.length;i++){
			for(int j=0;j<list[i].length;j++){
				if(Objects.nonNull(list[i][j])){
					System.out.print(list[i][j]);
				}
			}

				if(Objects.nonNull(list[i][0])){
			System.out.println("");
				}
		}
	}
}