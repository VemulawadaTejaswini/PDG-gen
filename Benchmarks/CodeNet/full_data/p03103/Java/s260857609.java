import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        Comparator<Drink> comparator = Comparator.comparing(Drink::getA);
        drinkList = drinkList.stream().sorted(comparator).collect(Collectors.toList());
        for(Drink drink : drinkList){
        	if(M > count + drink.B) {
        		count += drink.B;
        		ansPrice += drink.A * drink.B;
        	}else{
        		ansPrice += drink.A * (M- count);
        		break;
        	}
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

	long getA(){
		return this.A;
	}

}
