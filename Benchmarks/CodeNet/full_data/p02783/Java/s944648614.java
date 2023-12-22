import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int HP = sc.nextInt();
		int ATK = sc.nextInt();
		for(int i = 1;;i++){
			HP -= ATK;
			if(HP <= 0){
				System.out.println(i);
				break;
			}
		}
	}
}