
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<>();

		while(scan.hasNext()) {
			Integer Nb = scan.nextInt();
			a.add(Nb);			
		}
		
		int[] b =new int[a.size()];
		
		for(int i=0;i<a.size();i++) {
			b[i]=a.get(i);
		}

		for(int i=0;i<a.size();i++) {
			int minj=i;
			for(int j=i;j<a.size();j++) {
				if(b[j]<b[minj]) {
					minj=j;
				}
			}
			int v=b[i];
			b[i]=b[minj];
			b[minj]=v;
			
		}
		
		int result=0;
		int tmp=0;
		for(int i=0;i<a.size()-1;i++) {
			tmp=b[i+1]-b[i];
			result=tmp+result;
			
		}
		
		
		System.out.println(result);

	}
}