import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = s.nextInt();
		int b = s.nextInt();
		String str = s.next();
		int countAccepted = 0;
		boolean countBMax = false;

		String[] arr = str.split("");
		for(int i=0;i<arr.length;i++){

			if(arr[i].equals("c")){
				System.out.println("No");

			}else if(arr[i].equals("a")){
				if( countAccepted<a+b){
					System.out.println("Yes");
					countAccepted++;
				}else{
					System.out.println("No");
				}

			}else if(arr[i].equals("b")){
				if(countAccepted<a+b && countBMax==false){
					System.out.println("Yes");
					countAccepted++;
				}else{
					System.out.println("No");
				}
			}
		}
	}
}