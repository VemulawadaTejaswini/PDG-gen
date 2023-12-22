

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		List<Plan> pn = new ArrayList<>();
		for(int i=0;i<len;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			pn.add(new Plan(a,b,c));
			
		}
		
		List<Plan> pList = pn.stream().sorted((s1, s2) -> s1.d - s2.d)
				.collect(Collectors.toList());
		int sum = 0;
		
		for(int i=0;i<pList.size();i++) {
			if(pList.get(i).a>=pList.get(i).b&&pList.get(i).a>=pList.get(i).c) {
				if(pList.get(i).flaga==0) {
					sum+= pList.get(i).a;
					if(i<pList.size()-1) {
						Plan tp = pList.get(i+1);
						tp.flaga = 1;
					}
				}else {
					if(pList.get(i).b>=pList.get(i).c) {
						sum+= pList.get(i).b;
						if(i<pList.size()-1) {
							Plan tp = pList.get(i+1);
							tp.flagb = 1;
						}
					}else {
						sum+= pList.get(i).c;
						if(i<pList.size()-1) {
							Plan tp = pList.get(i+1);
							tp.flagc = 1;
						}
					}
				}
			}
			if(pList.get(i).b>pList.get(i).a&&pList.get(i).b>pList.get(i).c) {
				if(pList.get(i).flagb==0) {
					sum+= pList.get(i).b;
					if(i<pList.size()-1) {
						Plan tp  = pList.get(i+1);
						tp.flagb = 1;
					}
				}else {
					if(pList.get(i).a>=pList.get(i).c) {
						sum+= pList.get(i).a;
						if(i<pList.size()-1) {
							Plan tp  = pList.get(i+1);
							tp.flaga = 1;
						}
					}else {
						sum+= pList.get(i).c;
						if(i<pList.size()-1) {
							Plan tp  = pList.get(i+1);
							tp.flagc = 1;
						}
					}
				}
				
			}
			if(pList.get(i).c>pList.get(i).a&&pList.get(i).c>pList.get(i).b) {
				if(pList.get(i).flagc==0) {
					sum+= pList.get(i).c;
					if(i<pList.size()-1) {
						Plan tp  = pList.get(i+1);
						tp.flagc = 1;
					}
				}else {
					if(pList.get(i).b>=pList.get(i).a) {
						sum+= pList.get(i).b;
						if(i<pList.size()-1) {
							Plan tp  = pList.get(i+1);
							tp.flagb = 1;
						}
					}else {
						sum+= pList.get(i).a;
						if(i<pList.size()-1) {
							Plan tp  = pList.get(i+1);
							tp.flaga = 1;
						}
					}
				}
			}
			
		}
		System.out.println(sum);
	}
}


class Plan{
	int a;
	int b;
	int c;
	int d = a + c + b;
	int flaga = 0;
	int flagb = 0;
	int flagc = 0;
	Plan(int a,int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
}
