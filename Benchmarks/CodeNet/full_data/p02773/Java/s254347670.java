import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Map<String,Integer> tV = new TreeMap<>();//total vote paper
		ArrayList<Integer> list = new ArrayList<Integer>();//contain the number of votes
		
		int nV = scn.nextInt();//taking number of votes
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
			
		}
		//store the number of cointing vote paper 
		for(Map.Entry<String,Integer> vote : tV.entrySet()) {
			list.add(vote.getValue());
		}
		//Chaking, all number of vote same
		if(Collections.max(list) == Collections.min(list)) {
			for(Map.Entry<String,Integer> vote : tV.entrySet()) {
				System.out.println(vote.getKey().toString());//print all equales votes
			}
		}else {
			if(Collections.min(list) != Collections.max(list)) {
				for(Map.Entry<String,Integer> vote : tV.entrySet()) {
					if(vote.getValue() == Collections.max(list)) {
						System.out.println(vote.getKey().toString());//print selected votes
					}
				}
			}
		}
		scn.close();
	}
}