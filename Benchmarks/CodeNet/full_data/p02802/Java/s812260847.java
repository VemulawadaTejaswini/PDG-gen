import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int mondai = sc.nextInt();
		int teisyutu = sc.nextInt();
		int[] seitou = new int[mondai];
		int[] pena = new int[mondai];
        int ansOK = 0;
		int ansNG = 0;
		for ( int i = 0; i < teisyutu; i++){
			int number = sc.nextInt() - 1;
			String ret = sc.next();
			if ( seitou[number] == 0){
				if (ret.equals("AC")){
					seitou[number]++;
				} else {
					pena[number]++;
				}
			}
		}
		for ( int i = 0; i < seitou.length; i++){
			if ( seitou[i] == 1){
				ansOK += seitou[i];
				ansNG += pena[i];
			}
		}
		System.out.println(ansOK + " " + ansNG);
	}
}
