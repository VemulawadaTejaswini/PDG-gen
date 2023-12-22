import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] iArray = Arrays.stream(sc.nextLine().split(" ")) //" "で区切ってString配列へ
    .mapToInt(Integer::parseInt) //数値にして
	.toArray(); //配列へ
	int n = iArray[0];
	int m = iArray[1];
	int x = iArray[2];
	int y = iArray[3];
	int Flag = 0;

	int[] xArray = Arrays.stream(sc.nextLine().split(" ")) //" "で区切ってString配列へ
    .mapToInt(Integer::parseInt) //数値にして
	.toArray(); //配列へ

	int[] yArray = Arrays.stream(sc.nextLine().split(" ")) //" "で区切ってString配列へ
    .mapToInt(Integer::parseInt) //数値にして
	.toArray(); //配列へ

	for(int i = x;i <= y;i++){
		if(xzy(x,y,i) && xCheck(xArray,n,i) && yCheck(yArray,m,i)){
			if(Flag != 1){
				// 出力
				System.out.println("No War");
				Flag = 1;
			}
		}else{
			//continue
		}
	}

	if (Flag == 1){

	}else{
		// 出力
		System.out.println("War");
	}

	}

	public static boolean xzy(int x, int y, int z){
		if(x < z && z <= y){
			return true;
		}else{
			return false;
		}
	}

	public static boolean xCheck(int[] xn, int n, int z){
		for(int i = 0;i < n;i++){
			if(xn[i] < z){
				//continue
			}else{
				return false;
			}
		}
		return true;
	}

	public static boolean yCheck(int[] ym, int m, int z){
		for(int i = 0;i < m;i++){
			if(ym[i] >= z){
				//continue
			}else{
				return false;
			}
		}
		return true;
	}
}
