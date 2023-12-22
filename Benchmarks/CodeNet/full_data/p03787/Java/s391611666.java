import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);

		int target = cin.nextInt();
		int edge = cin.nextInt();
		int a,b;
		int list[] = new int[target*target];
		Arrays.fill(list,0);
		int block =1;
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
		HashMap<Integer,Integer> connected = new HashMap<Integer,Integer>();
		for(int i=0;i<edge;i++){
			a=cin.nextInt()-1;
			b=cin.nextInt()-1;
			int key1[] = new int[2];
			int key2[] = new int[2];
			key1[0]=a+b*(target-1);
			key1[1]=a+a*(target-1);
			key2[0]=b+a*(target-1);
			key2[1]=b+b*(target-1);

			for(int j=0;j<=1;j++){
				if(!connected.containsKey(key1[j])){
					connected.put(key1[j], 1);
				}
				if(!connected.containsKey(key2[j])){
					connected.put(key2[j], 1);
				}
				if(list[key1[j]]==list[key2[j]]){
					list[key1[j]]=block;
					list[key2[j]]=block;
					ArrayList<Integer> num = new ArrayList<Integer>();
					num.add(key1[j]);
					num.add(key2[j]);
					map.put(block, num);
					block++;
				}else{
					if(map.containsKey(list[key1[j]])&&!map.containsKey(list[key2[j]])){
						map.get(list[key1[j]]).add(key2[j]);
						list[key2[j]]=list[key1[j]];
					}else if(!map.containsKey(list[key1[j]])&&map.containsKey(list[key2[j]])){
						map.get(list[key2[j]]).add(key1[j]);
						list[key1[j]]=list[key2[j]];
					}else{
						if(map.get(list[key1[j]]).size()>map.get(list[key2[j]]).size()){
							for(int k=0;k<map.get(list[key2[j]]).size();k++){
								list[map.get(list[key2[j]]).get(k)]=list[key1[j]];
								map.remove(list[key2[j]]);
							}
						}else{
							for(int k=0;k<map.get(list[key1[j]]).size();k++){
								list[map.get(list[key1[j]]).get(k)]=list[key2[j]];
								map.remove(list[key1[j]]);
							}
						}
					}
				}
			}
		}
		int result = (target*target-connected.size())+map.size();
		System.out.println(result);
	}
}
