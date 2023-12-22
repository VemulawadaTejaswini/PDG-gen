//package java作业2;

import java.util.LinkedList;
import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNextLine()){
		String s=new String();
		boolean judge;
		int length,cnt,cnte,cnto,temp,index;
		int[] kinds=new int[26];
		LinkedList<Integer> L=new LinkedList<Integer>();
		s=scan.nextLine();
		judge= true;
		length=s.length();
		cnt=cnte=cnto=0;
		for(int i=0;i<length;i++){
			temp=s.charAt(i)-'a';
			L.add(temp);
			kinds[temp]++;
		}
		for(int i=0;i<26;i++){
			if(kinds[i]==0)
				continue;
			if(kinds[i]==length){
				judge=false;
				break;
			}
			if(kinds[i]%2==1)
				cnto++;
			else
				cnte++;
		}
		//System.out.println(cnte+" "+cnto+" "+L.get(0)+" "+L.size());
		if(length==1||!judge){
			System.out.println("0");
		}
		else if((length%2==1&&cnte!=0&&cnto<=1)||(length%2==0&&cnto==0)){
			while(L.size()!=0){
				judge=true;
				for(int j=L.size()-1;j>0;j--){
					if(L.get(j)==L.getFirst()){
						cnt+=L.size()-1-j;
						L.remove(j);
						judge=false;
						break;
					}
				}
				L.removeFirst();
				if(judge){
					cnt+=L.size()/2;
				}
			}
			System.out.println(cnt);
		}
		else
			System.out.println("Impossible");
	}
	}
}
