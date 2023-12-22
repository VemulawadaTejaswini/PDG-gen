import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int mondai = sc.nextInt();
		int teisyutu = sc.nextInt();
		String[] seitou = new String[mondai];
		int[] pena = new int[mondai];
        int ansOK = 0;
		int ansNG = 0;
		if (teisyutu == 0){
			System.out.print(0);
			return;
		}
		for ( int i = 0; i < teisyutu; i++){
			int number = sc.nextInt() - 1;
			String ret = sc.next();
			if ( seitou[number] == null){
				if (ret.equals("AC")){
					seitou[number] = "AC";
				} else {
					pena[number]++;
				}
			}
		}
		for ( int i = 0; i < seitou.length; i++){
			if ( seitou[i] != null){
				ansOK++;
				ansNG += pena[i];
			}
		}
		System.out.println(ansOK + " " + ansNG);
	}
}
