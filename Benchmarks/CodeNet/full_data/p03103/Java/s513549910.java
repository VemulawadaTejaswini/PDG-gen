import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();

		List<Drink> drinkList = new ArrayList<>();
		sc.nextLine();
        for (int i = 0; i < N; i++) {
        	Drink drink = new Drink(sc.nextInt(), sc.nextInt());
        	drinkList.add(drink);
        	sc.nextLine();
        }

        long count = 0;
        long ansPrice = 0;
        List<Long> priceList = new ArrayList<>();
    	for(Drink drink : drinkList){
        	priceList.add(drink.A);
        }
    	Collections.sort(priceList);
        while(true){
        	Drink drink = drinkList.stream().filter(drnk -> drnk.A == priceList.get(0)).findFirst().get();
        	if(M > count + drink.B) {
        		count += drink.B;
        		ansPrice += drink.A * drink.B;
        	}else{
        		ansPrice += drink.A * (M- count);
        		break;
        	}

        	drinkList.remove(drinkList.indexOf(drink));
        	priceList.remove(0);
        }

        System.out.println(ansPrice);

	}


}

class Drink {

	Drink(long a, long b){
		this.A = a;
		this.B = b;
	}

	long A;
	long B;
}
