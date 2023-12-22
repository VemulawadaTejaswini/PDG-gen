
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		ArrayList<Integer>[] data=new ArrayList[n+1];
		for(int i=0;i<n+1;i++){
			data[i]=new ArrayList<Integer>();
		}
		int[] info=new int[n];
		for(int i=0;i<m;i++){
			int buf=sc.nextInt();
			int buff=sc.nextInt();
//			System.out.println(buf+" "+buff);
			data[buf].add(buff);
			data[buff].add(buf);
		}
		int cnt=0;
		boolean update=true;
		while(update){
			update=false;
			for(int i=1;i<n+1;i++){
				if(data[i].size()==1){
					int buf=data[i].get(0);
					int k=0;
					while(true){
						if(data[buf].get(k)==i){
						data[buf].remove(k);
						break;
						}
						k++;
					}
					data[i].clear();
					//System.out.println(i+"is cleared");
					update=true;
					cnt++;
				}
			}
		}
	//	for(int i=0;i<n+1;i++){
	//		System.out.println(i+" sizeis "+data[i].size());
	//	}
		System.out.println(cnt);
	}

}