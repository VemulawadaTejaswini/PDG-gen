import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Map<String,Integer> tV = new TreeMap<>();//total vote paper
		
		int nV = scn.nextInt();//taking number of votes
		int[] VList= new int[nV];
		
		for(int i = 0;i<nV;i++) {
			String v = scn.next();
			
			if(!tV.isEmpty()) {
				if(tV.containsKey(v)) {
					tV.put(v,tV.get(v)+1);
				}else {
					tV.put(v,1);
				}
			}else {
				tV.put(v,1);
			}
			
			VList[i] = tV.get(v);//store the number of cointing vote paper 
		}
		Arrays.sort(VList);
		//Chaking, all number of vote same
		if(VList[nV-1] == VList[0]) {
			for(Map.Entry<String,Integer> vote : tV.entrySet()) {
				System.out.println(vote.getKey().toString());//print all equales votes
			}
		}else {
			if(VList[0] != VList[nV-1]) {
				for(Map.Entry<String,Integer> vote : tV.entrySet()) {
					if(vote.getValue() == VList[nV-1]) {
						System.out.println(vote.getKey().toString());//print selected votes
					}
				}
			}
		}
		scn.close();
	}
}