import java.util.HashMap;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		dKI();
	}
	public static void dKI() {
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		int Q=scanner.nextInt();
		int[] childToParent=new int[N+1];
		HashMap<Integer, Integer> childWeight=new HashMap<>();
		for(int i=0;i<N-1;i++) {
			int parent=scanner.nextInt();
			int child=scanner.nextInt();
			childToParent[child]=parent;
		}
		for(int i=0;i<Q;i++) {
			int child=scanner.nextInt();
			int weight=scanner.nextInt();
			int temp=0;
			if(childWeight.containsKey(child)) {
				temp=childWeight.get(child);
			}
			childWeight.put(child,temp+weight);
		}
		int baseWeight=childWeight.get(1);
		StringBuffer stringBuffer=new StringBuffer();
		stringBuffer.append(baseWeight);
		for(int index=2;index<N+1;index++) {
			int parent=childToParent[index];
			int owner=childWeight.containsKey(index)?childWeight.get(index):0;
			int parentW=childWeight.containsKey(parent)?childWeight.get(parent):0;
			if(parent==1) {
				stringBuffer.append(" ").append(parentW+owner);
				continue;
			}
			stringBuffer.append(" ").append(owner+parentW+baseWeight);
		}	
		System.out.println(stringBuffer.toString());
	}
}
