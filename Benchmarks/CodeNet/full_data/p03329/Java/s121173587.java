import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int money = scan.nextInt();
		int count = 0;

		while(true){
			money -= getMaxMoneyBank(money);
			count++;
			if(money <= 0){
				break;
			}
		}

		System.out.println(count);
	}

	// max money for bank
	public static int getMaxMoneyBank(int money){
		int moneyBank = 0;

		if(money >= 9){
			boolean flag = true;
			int pow6 = 0;
			int pow9 = 0;

			int i = 1;
			while(flag){
				pow9 = (int)Math.pow(9, i);

				if(money >= pow9 && money < (int)Math.pow(9, i+1)){
					break;
				}
				i++;
			}

			pow6 = (int)Math.pow(6, i+1);
			if(money >= pow6){
				moneyBank = pow6;
			}else{
				moneyBank = pow9;
			}
			

		} else if(money >= 6){
			moneyBank = 6;
		} else {
			moneyBank = 1;
		}

		return moneyBank;
	}
}
