import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int HP = sc.nextInt();
		int variousOfAttack = sc.nextInt();
		int sum_attack = 0;
		int[] attack = new int[variousOfAttack];
		for(int i=0; i < variousOfAttack; i++){
			attack[i] = sc.nextInt();
			sum_attack += attack[i];
		}
		if(sum_attack < HP){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}