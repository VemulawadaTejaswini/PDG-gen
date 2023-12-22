import java.util.*;
import java.math.*;
 import static java.util.stream.Collectors.toList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Shop> list = new ArrayList<Shop>();
		long money =0;
		long totalAmount =0;
 
		for(int i=0;i<n;i++){
			Shop shop = new Shop();
			shop.setCost(sc.nextInt());
			shop.setAmount(sc.nextInt());
			list.add(shop);
		}

		// ArrayList<Shop> sortedList = list
		// .stream()
		// .sorted((s1, s2) -> s1.getCost()- s2.getCost())
  //       .collect(Collectors.toList());
		list.sort((s1, s2) -> s1.getCost()- s2.getCost());

        // System.out.println("sortedList "+list);
		int countIndex=0;
		while(totalAmount<m){
			long need = m- totalAmount;
			long canGetAmount = list.get(countIndex).getAmount();

        	// System.out.println("target "+target);

			if(canGetAmount<need){
				totalAmount += canGetAmount;
				money += list.get(countIndex).getCost() * canGetAmount;
			}else{
				totalAmount += need;
				money += list.get(countIndex).getCost() * need;
			}

        	// System.out.println("money "+money);
        	// System.out.println("totalAmount "+totalAmount);
			// listA.remove(countIndex);
			// listB.remove(countIndex);
			countIndex++;
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

	public static class Shop{
		private int cost;
		private int amount;
		public int getCost(){
			return this.cost;
		}
		public int getAmount(){
			return this.amount;
		}

		public void setCost(int cost){
			this.cost = cost;
		}
		public void setAmount(int amount){
			this.amount = amount;
		}
	}
}


