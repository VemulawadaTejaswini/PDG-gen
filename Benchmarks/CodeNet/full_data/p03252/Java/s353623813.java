import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ss=sc.nextLine();
		String ts=sc.nextLine();
char s[]=ss.toCharArray();
int sint[]=new int[s.length];
ArrayList<Character> sch = new ArrayList<Character>();


char t[]=ts.toCharArray();
int tint[]=new int[t.length];
ArrayList<Character> tch = new ArrayList<Character>();


int cou=0;


for(int i=0;i<s.length;i++){
if(sch.indexOf(s[i])==-1){
	sch.add(s[i]);
	sint[i]=cou;
	cou++;
}else{
	sint[i]=sch.indexOf(s[i]);
}

}
cou=0;

for(int i=0;i<s.length;i++){
if(tch.indexOf(t[i])==-1){
	tch.add(t[i]);
	tint[i]=cou;
	cou++;
}else{
	tint[i]=tch.indexOf(t[i]);
}

}


if(Arrays.equals(sint,tint)){
	System.out.println("Yes");
}else{System.out.println("No");}

	}
	static void show(int x[]){
		for(int i=0;i<x.length;i++){
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}


}