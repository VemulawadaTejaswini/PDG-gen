import java.util.LinkedList;
import java.util.Scanner;
public class main{
	public static void main(String[] args) {
		String s=new String();
		boolean judge;
		int length,cnt,cnte,cnto,temp,index;
		int[] kinds=new int[26];
		LinkedList<Integer> L=new LinkedList<Integer>();
		Scanner scan=new Scanner(System.in);
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
		if(length==1||!judge){
			System.out.println("0");
		}
		else if(((length%2==1&&cnte!=0)||((length%2==0)&&cnto==0))&&cnto<=1){
			while(L.size()!=0){
				if(L.lastIndexOf(L.getFirst())!=-1){
					index=L.lastIndexOf(L.getFirst());
					cnt+=L.size()-1-index;
					L.remove(index);
					judge=false;
				}
				L.removeFirst();
				if(judge){
					cnt+=L.size()/2;
				}
			}
			System.out.println(cnt);
		}
			System.out.println(-1);
	}
}
