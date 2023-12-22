
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		//
		// 0, 1, 2
		// 3, 4, 5
		// 6, 7, 8
		//
		List<Integer> A = new ArrayList<Integer>();
        for (int i=0; i<9; i++) {
            A.add(sc.nextInt());
       }

		int N = sc.nextInt();
        for (int i=0; i<N; i++) {
       		// 登場したら0に変える
        	int index = A.indexOf(sc.nextInt());
        	if(index != -1){
            	A.set(index, 0);
        	}
        }
        
        // 判定
        boolean isBingo = false;
        if(A.get(0)==0 && A.get(1)==0 && A.get(2)==0){
        	isBingo = true;
        }else if(A.get(3)==0 && A.get(4)==0 && A.get(5)==0){
        	isBingo = true;
        }else if(A.get(6)==0 && A.get(7)==0 && A.get(8)==0){
        	isBingo = true;
        }else if(A.get(0)==0 && A.get(3)==0 && A.get(6)==0){
        	isBingo = true;
        }else if(A.get(1)==0 && A.get(4)==0 && A.get(7)==0){
        	isBingo = true;
        }else if(A.get(2)==0 && A.get(5)==0 && A.get(8)==0){
        	isBingo = true;
        }else if(A.get(0)==0 && A.get(4)==0 && A.get(8)==0){
        	isBingo = true;
        }else if(A.get(2)==0 && A.get(4)==0 && A.get(6)==0){
        	isBingo = true;
        }

        if(isBingo){
    		System.out.println("Yes");
        }else{
    		System.out.println("No");
        }
		sc.close();
	}

}
