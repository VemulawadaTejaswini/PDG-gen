import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str;
    str = sc.next();
    char[] s = str.toCharArray();
    int r=0,g=0,b=0;
    for(int i=0;i<n;i++){
	switch(s[i]){
	case 'R':
		r++;
		break;
	case 'G':
		g++;
		break;
	case 'B':
		b++;
		break;
	}
    }
    int pair = r*g*b;
    for(int j=1;j<n;j++){
	for(int i=0;i<j;i++){
	    if(i!=j&&(2*j-i<n)){
		if(s[i]!=s[j]&&s[i]!=s[2*j-i]&&s[j]!=s[2*j-i])
			pair--;
	    }
	}
    }
    System.out.println(pair);
  }
}