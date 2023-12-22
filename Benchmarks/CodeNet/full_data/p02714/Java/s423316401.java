import java.util.*;

class Judge{
  boolean jud(char str1,char str2,char str3){
    if(str1==str2)
      return false;
    if(str1==str3)
      return false;
    else
      return true;
  }
}

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str;
    str = sc.next();
    char[] s = str.toCharArray();
    int pair = 0;
    Judge judge = new Judge();
    for(int k=2;k<n;k++){
      for(int j=1;j<k;j++){
	if(s[j]==s[k])
	    continue;
        for(int i=0;i<j;i++){
	  if(k-j==j-i)
            continue;
          if(judge.jud(s[i],s[j],s[k]))
            pair++;
        }
      }
    }
    System.out.println(pair);
  }
}