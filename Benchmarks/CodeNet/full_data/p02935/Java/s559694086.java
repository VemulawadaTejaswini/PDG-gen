import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Double> v = new ArrayList<Double>();
		for(int i = 0; i < n; i++){
			v.add(sc.nextDouble());
		}
		for(int i = 0; i < n-1; i++){
			Collections.sort(v);
			double min = 9999;
			int minidx = -1;
			for(int j = 0; j < v.size()-1; j++){
				double tmp = v.get(j+1)-v.get(j);
				if(tmp < min){
					min = tmp;
					minidx = j;
				}
			}
			double tmp = (v.get(minidx+1)+v.get(minidx))/2;
			v.remove(minidx);
			v.remove(minidx);
			v.add(tmp);
		}
		System.out.print(v.get(0));
	}
}
