import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int [] x = new int [n];
		int [] y = new int [n];
		int [] a = new int [n];
		int goukei = 0;
		int min_x = 0; int max_x = w;
		int min_y = 0; int max_y = h;
		int fx = 0; int fy = 0;
		
		for(int i = 0; i < n; i++){
		x[i] = sc.nextInt();
		y[i] = sc.nextInt();
		a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++){
		switch(a[i]){
		case 1 : min_x = x[i]; break;
		case 2 : max_x = x[i]; break;
		case 3 : min_y = y[i]; break;
		case 4 : max_y = y[i]; break;
		default:
		}}
		
		if(max_x >= min_x){ fx = max_x - min_x; } else { fx = 0; }
		if(max_y >= min_y){ fy = max_y - min_y; } else { fy = 0; }
		goukei = fx * fy;
		
		System.out.println(goukei);
	}}
		