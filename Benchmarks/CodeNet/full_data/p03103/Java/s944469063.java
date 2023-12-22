import java.util.*;
class Drink {
    int cost;
    int amount;
    public Drink(int cost, int amount) {
	this.cost = cost;
	this.amount = amount;
    }

    public int getCost() {
	return this.cost;
    }
}
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.next());
	int M = Integer.parseInt(sc.next());
	Drink[] drinks = new Drink[N];
	long yen = 0;
	for(int i = 0; i<N; i++) {
	    drinks[i] = new Drink(Integer.parseInt(sc.next()),Integer.parseInt(sc.next()));
	}
	Arrays.sort(drinks, Comparator.comparing(Drink::getCost));
	for(int i = 0; i<N; i++) {
	    if(drinks[i].amount<=M) {
		yen += (long)drinks[i].cost*(long)drinks[i].amount;
		M = M-drinks[i].amount;
	    }else{
		yen += (long)drinks[i].cost*(long)M;
		M = 0;
	    }
	    if(M<=0)break;
	}
	System.out.println(yen);
    }
}