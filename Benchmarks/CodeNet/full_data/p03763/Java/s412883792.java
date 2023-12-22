import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int an[][]=new int[n][26];
	int bn[][]=new int[n][26];
	int min=50;
	int ans[] =new int[26];
	int a ='a';
	List<String> list = new ArrayList<String>();
    for(int i=0;i<n;i++){
    	list.add(scan.next());
    }
    for(int i=0;i<n;i++){
    	an=ch(list.get(i),i,n);
    	for(int f=0;f<26;f++){
    		bn[i][f]=an[i][f];
    	}
    }
    for(int f=0;f<26;f++){
    	min=50;
    	for(int i=0;i<n;i++){
    		if(min>bn[i][f]){
    			min=bn[i][f];
    		}
    	}
    ans[f]=min;
    }
    for(int i=0;i<26;i++){
    	a='a';
    	a=a+i;
    	for(int f=0;f<ans[i];f++){

    		System.out.print((char)a);
    	}
    }
}
	public static List<Character > cha(String s){
		List<Character > a = new ArrayList<Character >();
		for(int i=0;i<s.length();i++){
			a.add(s.charAt(i));
		}
		return a;
	}
	public static int[][] ch(String st,int b,int n){
		int [][] c=new int[n][26];
		for(int f=0;f<26;f++){
			int count=0;
			int a='a';
			a=a+f;
			for(int i=0;i<st.length();i++){
				if((char)a==st.charAt(i)){
				count++;
				}
			}
		c[b][f]=count;
		}
		return c;
	}
}