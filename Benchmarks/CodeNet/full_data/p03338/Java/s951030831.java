import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String s = scn.next();
      	int max = 0;
        for (int i=1;i<n; ++i){
            String str1 = s.substring(0,i);
            String str2 = s.substring(i);
            int count = 0;
            boolean[] az1 = new boolean[26];
            boolean[] az2 = new boolean[26];
          
            for (int j=0;j<str1.length();j++){
                az1[str1.charAt(j)-'a']=true;
            }
            for (int j=0;j<str2.length();j++){
                az2[str2.charAt(j)-'a']=true;
            }
            for (int j=0;j<26;j++){
                if (az1[j] && az2[j]){
                  count = count + 1;
                }
            }
            max = Math.max(max,count);
        }
        System.out.println(max);
		}
	}
}