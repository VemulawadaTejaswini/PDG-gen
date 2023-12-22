import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String buf,as,bs,cs,ass,bss,css;
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		int allLen = a.length() + b.length() + c.length();
		String ans;
		as = MatchingStr(a,b);
		bs = MatchingStr(a,c);
		cs = MatchingStr(b,c);
		ass = MatchingStr(as,bs);
		bss = MatchingStr(bs,cs);
		css = MatchingStr(as,cs);
		ans = retsho(retsho(ass,bss,allLen),css,allLen)
		System.out.println(ans.length());
	}
	public static String MatchingStr(String str1,String str2){
		String lon,sho,lonhead,lontail,str;
		int len1 = str1.length();
		int len2 = str2.length();
		int i;
		String buf,head,tail;
		if(len1 > len2){
			lon = str1;
			sho = str2;
		}else{
			lon = str2;
			sho = str1;
		}
		if(lon.length() == sho.length() && PatternMatches(lon,sho)){
			if(sho.contains("?")){
				return lon;
			}else{
				return sho;
			}
		}
		for(i = 1;i < (lon.length() - sho.length());i++){
			buf = lon.substring(i,i + sho.length());
			if(PatternMatches(sho,buf)){
				str = lon.substring(0,i) + sho + lon.substring(i + sho.length(),lon.length());
				return str;
			}
		}
		for(i = 0;i < sho.length();i++){
			head = sho.substring(i,sho.length());
			tail = sho.substring(0,sho.length() - i);
			lonhead = lon.substring(0,sho.length() - i);
			lontail = lon.substring(lon.length() - sho.length() + i,lon.length());
			if(PatternMatches(lonhead,head)){
				buf = sho.substring(0,i);
				return buf + lon;
			}else if(PatternMatches(tail,lontail)){
				buf = sho.substring(sho.length() - i,sho.length());
				return lon + buf;
			}
		}
		return lon + sho;
	}
	public static String retsho(String str1,String str2,int alllength){
		int str1len = alllength - str1.length();
		int str2len = alllength - str2.length();
		if(str1len > str2len){
			return str1;
		}else{
			return str2;
		}
	} 
	public static boolean PatternMatches(String str1,String str2){
		for(int i = 0;i < str1.length();i++){
			if(str1.charAt(i) != str2.charAt(i) && str1.charAt(i) != '?' && str2.charAt(i) != '?'){
				return false;
			}
		}
		return true;
	}
}
