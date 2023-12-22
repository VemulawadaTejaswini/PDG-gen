import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		ArrayList<String> c = new ArrayList<>();
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		int max = 0;
		for(int i=0;i<N;i++){
			a.add(scanner.nextInt()+K);
			b.add(scanner.nextInt()+K);
			c.add(scanner.next());
		}
		for(int i=0;i<N;i++){
			for(int w=0;w<K;w++){
				for(int h=0;h<K;h++){
					int pos = 0;
					for(int j=0;j<N;j++){
						if(c.get(i).equals(c.get(j))){
							if(((((((a.get(j)-w)/K)%2)+((b.get(j)-h)/K)%2)))%2==0){
								pos++;
							}
						}
						else{
							if(((((((a.get(j)-w)/K)%2)+((b.get(j)-h)/K)%2)))%2!=0){
								pos++;
							}
						}
					}
					if(max<pos){
						max = pos;
					}
				}
			}
		}
		System.out.println(max);
	}
}