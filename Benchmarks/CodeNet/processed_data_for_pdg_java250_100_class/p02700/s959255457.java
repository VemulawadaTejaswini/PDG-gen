public class Main {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int T_hp = sc.nextInt();
				int T_attack = sc.nextInt();
				int A_hp = sc.nextInt();
				int A_attack = sc.nextInt();
				int A_turn = 0;
				int T_turn =1;
					while(T_hp > 0 && A_hp > 0) {
						if(T_turn ==1) {
							A_hp = A_hp - T_attack;
							A_turn = 1;
							T_turn = 0;
						}else if(A_turn == 1) {
							T_hp = T_hp - A_attack;
							T_turn = 1;
							A_turn = 0;
						}
					}
				if(T_hp > 0) {
					System.out.println("Yes");
				}else if(T_hp <= 0) {
					System.out.println("No");
				}
			}
		}
