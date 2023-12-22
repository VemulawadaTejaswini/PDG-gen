import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		StringBuffer buf=new StringBuffer();
		Set<String> tmp=new HashSet<String>();
		for(int i=0;i<a;i++){
			String ss=s.next();
			buf.append(ss);
			tmp.add(ss);
		}
		s.close();
		String str=buf.toString();
		char[] gr=new char[tmp.size()];
		int n=0;
		for(String c : tmp)gr[n++]=c.charAt(0);
		List<String> list=new ArrayList<String>();
		permutation(new String(gr),"",list);
		Set<String> ans=new HashSet<String>();
		ans.add(str);
		for(String ss : list){
			String line=str;
			char[] chs=ss.toCharArray();
			for(int i=0;i<chs.length;i++){
				line=parse(line,chs[i]);
				ans.add(line);
			}
			line=str;
			for(int i=0;i<chs.length;i++){
				line=parseR(line,chs[i]);
				ans.add(line);
			}
		}
		int val=1000000007;
		System.out.println((ans.size())%val);
	}

	public static void permutation(String q, String ans,List<String> list){
		if(q.length()<=1){
			list.add(ans + q);
		}else{
			for (int i=0;i<q.length();i++) {
				permutation(q.substring(0, i)+q.substring(i+1),ans+q.charAt(i),list);
            }
        }
    }

	private static String parse(String str,char ch){
		boolean flg=false;
		int ct=0;
		char[] line=str.toCharArray();
		for(int i=0;i<line.length;i++){
			if(line[i]==ch){
				if(flg){
					for(int j=ct;j<=i;j++)line[j]=ch;
					flg=false;
				}else{
					ct=i;
					flg=true;
				}
			}
		}
		return new String(line);
	}

	private static String parseR(String str,char ch){
		boolean flg=false;
		int ct=0;
		char[] line=str.toCharArray();
		for(int i=line.length-1;i>=0;i--){
			if(line[i]==ch){
				if(flg){
					for(int j=ct;j>=i;j--)line[j]=ch;
					flg=false;
				}else{
					ct=i;
					flg=true;
				}
			}
		}
		return new String(line);
	}
}
