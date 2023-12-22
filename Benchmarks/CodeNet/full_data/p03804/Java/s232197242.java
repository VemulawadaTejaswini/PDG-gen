import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
	static String[] Lb;
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
    int N = in.nextInt(); // the number of cells on the Y axis
    int X = in.nextInt(); // the number of cells on the Y axis
    List<String>  lineA= new ArrayList<>();
    List<String>  lineB= new ArrayList<>();
    in.nextLine();
    int count = 0;
    while(count< N){
        lineA.add(in.nextLine());
    count++;
    }
    count =0;
    while(count< X){
        lineB.add(in.nextLine());
    count++;
    }
      System.out.println(recalTo(lineA,lineB));
}
	static int cal (int N,int X){
		int L = 0;
		L = N + X;
		L += (N-X)/X * 2 -X * 2;
		return L;
	}
	//文字列比較
	public static int recal(String A , String B ,int i ,boolean trig){
		if(B.length() + i > A.length()){
			return -1;
		}
		if(A.substring(i, i + B.length()).equals(B)){
			return i;
		}else{
			if(trig){
				return recal(A,B,++i, trig);
			}else{
				return -1;
			}
		}
	}
	
	public static String recalTo(List<String> A , List<String> B){
		int length = 0;
		int index = 0;
		boolean trig = true;
		int lengthLA = 0;
		//Aの続きから検索を再開したい。
		List<String> AA = A;
		while(true){
			if(AA.isEmpty()){
				break;
			}
			if(AA.get(0).length() == lengthLA){
				AA.remove(0);
			}
			String LAA = AA.get(0).substring(lengthLA);
			//length= 0のときは最初の文字から検索して、length>0のときはその位置の文字列を検索する。
			for(String LA : A){
				if(trig){
					LA = LAA;
				}
				String LB  = B.get(index);
				if((length = recal(LA,LB,length, trig)) != -1){
					index++;
					trig = false;
				}else{
					trig = true;
					length = 0;
					if(index != 0){
						break;
					}
				}
				if(B.size() == index && length !=-1 && !trig){
					return "Yas";
				}
			}
			lengthLA++;
		}
		return "No";
	}
}