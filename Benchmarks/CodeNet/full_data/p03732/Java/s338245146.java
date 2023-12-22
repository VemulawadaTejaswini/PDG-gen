import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int w = sc.nextInt();
		int w1 = sc.nextInt();
		int v1 = sc.nextInt();
		ArrayList<Integer> listA = new ArrayList<Integer>();
		ArrayList<Integer> listB = new ArrayList<Integer>();
		ArrayList<Integer> listC = new ArrayList<Integer>();
		ArrayList<Integer> listD = new ArrayList<Integer>();
		listA.add(v1);
		for(int i = 1; i < n; i++){
		    int wNow = sc.nextInt();
		    int vNow = sc.nextInt();
		    if(wNow == w1) listA.add(vNow);
		    if(wNow == w1 + 1) listB.add(vNow);
		    if(wNow == w1 + 2) listC.add(vNow);
		    if(wNow == w1 + 3) listD.add(vNow);
		}
		listA.sort(Comparator.reverseOrder());
		listB.sort(Comparator.reverseOrder());
		listC.sort(Comparator.reverseOrder());
		listD.sort(Comparator.reverseOrder());
		
		// 計算
		int result = 0;
		for(int i = 0; i <= listA.size(); i++){
		    int tempWA = 0;
		    int tempVA = 0;
		    int indexA = 0;
		    while(indexA < i){
		        tempWA += w1;
		        if(tempWA > w) break;
		        tempVA += listA.get(indexA);
		        indexA++;
		    }
		    for(int j = 0; j <= listB.size(); j++){
		        int tempWB = tempWA;
		        int tempVB = tempVA;
		        int indexB = 0;
		        while(indexB < j){
		            tempWB += w1 + 1;
		            if(tempWB > w) break;
		            tempVB += listB.get(indexB);
		            indexB++;
		        }
		        for(int k = 0; k <= listC.size(); k++){
		            int tempWC = tempWB;
		            int tempVC = tempVB;
		            int indexC = 0;
		            while(indexC < k){
		                tempWC += w1 + 2;
		                if(tempWC > w) break;
		                tempVC += listC.get(indexC);
		                indexC++;
		            }
		            for(int l = 0; l <= listD.size(); l++){
		                int tempWD = tempWC;
		                int tempVD = tempVC;
		                int indexD = 0;
		                while(indexD < l){
		                    tempWD += w1 + 3;
		                    if(tempWD > w) break;
		                    tempVD += listD.get(indexD);
		                    indexD++;
		                }
		                result = max(result, tempVD);
		            }
		        }
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}
