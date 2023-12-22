import java.util.*;
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if((str.contains("N") && !str.contains("S")) || (str.contains("S") && !str.contains("N")) || (str.contains("E") && !str.contains("W")) || (str.contains("W") && !str.contains("E"))){
			System.out.println("NO");
		} else
			System.out.println("YES");	 
	}

}
