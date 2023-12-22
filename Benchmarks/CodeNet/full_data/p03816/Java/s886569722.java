import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < a.length; i++){ a[i] = sc.nextInt(); }
		
		int zyuhuku = 0;
		int hozon = 0;
		int count = 0;
		int min = 0;
		int max = 0;
		boolean hantei = false;
		
		for(int i = 0; i < n -1; i++){
		for(int j = i + 1; j < n; j++){
		if(a[i] > a[j]){hozon = a[i]; a[i] = a[j]; a[j] = hozon;}}}
		
		for(;;){
		
		zyuhuku = a[0];
		for(min = 1; min < n; min++){
		if(zyuhuku == a[min] && zyuhuku != 0){ min -= 1; hantei = true; break;}
		zyuhuku = a[min];}
		
		zyuhuku = a[n - 1];
		for(max = n - 2; 0 <= max; max--){
		if(zyuhuku == a[max] && zyuhuku != 0){ max += 1; break;}
		zyuhuku = a[max];}
		
		if(hantei){ a[min] = 0; a[max] = 0; hantei = false;}
		else { break; }
		
		}
		
		for(int i = 0; i < n; i++){if(a[i] != 0){ count++; }}
		System.out.println(count);
	}
}