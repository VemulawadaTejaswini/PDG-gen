import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		// スペース区切りの整数の入力
		for(int i=1;i<=a;i++){
			list.add(sc.nextInt());
		}

		int count =0;
		int length = list.size();
		for(int j=0;j<length;j++){
// System.out.println("j"+j);
			if(j!=0){
							int value = list.get(j);
			if(value==list.get(j-1)){
				if(value==list.get(j+1)){
					

					if(list.get(j+1)==value+1){
						list.set(j,j-1);
					}else{
						list.set(j,j+1);
					}

					count++;
				}else{
					if(list.get(j+1)==value+1){
						list.set(j,j-1);
					}else
					{
						list.set(j,j+1);
					}
					count++;
				}
			}

				
							}
							// System.out.println("count"+count);
		}
		// System.out.println(list);
		System.out.println(count);
	}
}