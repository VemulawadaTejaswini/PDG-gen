import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		int difference = B-A;
		ArrayList<Integer> AList = new ArrayList<Integer>();
		ArrayList<Integer> BList = new ArrayList<Integer>();

		for(int i = 0;i < K;i++){
			if(difference !=0){
				if(i > difference/2){
					if(difference/2 == 0){
						AList.remove(AList.size() - 1);
					}
					break;
				}
			}
			AList.add(A + i);
		}
		for(int i = 0;i < K;i++){
			if(difference!=0){
				if(i > difference/2){
					if(difference/2 == 0){
						BList.remove(BList.size() - 1);
					}
					break;
				}
				BList.add(B - i);
			}
		}
		if(difference!=0){
			if(difference/2 < K&&difference%2 ==0){
				BList.remove(BList.size()-1);
			}
		}
		for(int i = 0;i<AList.size();i++){
			System.out.println(AList.get(i));
		}
		Collections.sort(BList);
		for(int i = 0;i<BList.size();i++){
			System.out.println(BList.get(i));
		}

	}

}
