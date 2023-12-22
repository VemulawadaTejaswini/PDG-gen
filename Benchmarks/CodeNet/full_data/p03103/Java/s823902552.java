import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Long> listA = new ArrayList<>();
		ArrayList<Long> listB = new ArrayList<>();
		long money =0;
		long totalAmount =0;
 
		for(int i=0;i<n;i++){
			listA.add(sc.nextLong());
			listB.add(sc.nextLong());
		}
		while(totalAmount<m){
			int target = findExpensiveShop(listA);
			long need = m- totalAmount;
			long canGetAmount = listB.get(target);

        	// System.out.println("target "+target);

			if(canGetAmount<need){
				totalAmount += canGetAmount;
				money += listA.get(target) * canGetAmount;
			}else{
				totalAmount += need;
				money += listA.get(target) * need;
			}

        	// System.out.println("money "+money);
        	// System.out.println("totalAmount "+totalAmount);
			listA.remove(target);
			listB.remove(target);
		}


        System.out.println(money);
 
	}

	public static int findExpensiveShop(ArrayList<Long> shopList){
		int index =0;
		long min =1000000001;
		for(int i=0;i<shopList.size();i++){
			if(shopList.get(i)<min){
				min =shopList.get(i);
				index =i;
			}
		}
		return index;
	}
}
