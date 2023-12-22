import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt();
		int v[]=new int[n];
		int odd[]=new int[100000];
		int even[]=new int[100000];
		int z=0,y=0,x=0,cou=0;
		while(z<n){
			v[z]=stdIn.nextInt();
			if(z%2==0){
				odd[v[z]]++;
				x++;
			}
			else{
				even[v[z]]++;
				y++;
			}
			z++;
		}z=0;
		Arrays.sort(odd);
		Arrays.sort(even);
		if(x!=odd[99999]){
			cou+=x-odd[99999];
		}
		if(y!=even[99999]){
			cou+=y-even[99999];
		}
		if(x==odd[99999]&&y==even[99999]){
			if(v[0]==v[1])
				cou+=y;
		}
		System.out.println(cou);
	}
}