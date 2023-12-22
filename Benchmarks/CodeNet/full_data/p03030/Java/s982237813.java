import java.util.*;
public class Main {
 
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int N = sc.nextInt();
			// スペース区切りの整数の入力
			ArrayList<String> city = new ArrayList<String>();
			ArrayList<Integer> point = new ArrayList<Integer>();
			int []rank=new int [N];

			for(int i=0 ; i<N ; i++){
				city.add(sc.next());
				point.add(sc.nextInt());
				//System.out.println(i);
				//System.out.println(city.get(i));
			}
			for(int i=0 ; i<N ; i++){
				for(int j = 0; j<N ; j++){
					if(city.get(i).compareTo(city.get(j))>0){
						rank[i]+=1;
					}else if (city.get(i).compareTo(city.get(j))==0&& point.get(i)<point.get(j)){
						rank[i]+=1;
					}
				}
			}
			for(int i=0 ; i<N ; i++){
				System.out.println(rank[i]+1);
			}
		}
 
	}