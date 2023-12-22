import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	/* 入力 */
	int n = scan.nextInt();
	String[] s = new String[n];
	for(int i = 0; i < n; i++){
	    s[i] = scan.next();
	}

	/* B~Aの文字列を連結させる */
	String tmps = "";
	for(int i = 0; i < n; i++){
	    int tmp = 0;
	    if(s[i].charAt(0) == 'B'){
		tmp++;
		if(s[i].charAt(s[i].length()-1) == 'A'){
		    tmp++;
		    if(tmp == 2){
			tmps += s[i];
			s[i] = "";
		    }
		}
	    }
	}

	/* 文字列中の"AB"の個数を数える */
	int odda = 0;
	int oddb = 0;
	int count = 0;
	for(int i = 0; i < n; i++){
	    for(int j = 0; j < s[i].length(); j++){
		if(s[i].charAt(j) == 'A' && j != (s[i].length()-1)){
		    j++;
		    if(s[i].charAt(j) == 'B'){
			count++;
		    }
		}
	    }
	    if(s[i].length() != 0){
		if(s[i].charAt(0) == 'B'){
		    oddb++;
		}
		if(s[i].charAt(s[i].length()-1) == 'A'){
		    odda++;
		}
	    }
	}

	/* B~A連結文字中のABの個数 */
	for(int i = 0; i < tmps.length(); i++){
	    if(tmps.charAt(i) == 'A' && i != (tmps.length()-1)){
		i++;
		if(tmps.charAt(i) == 'B'){
		    count++;
		}
	    }
	}
	
	//System.out.println(tmps);

	//System.out.println(odda+" "+oddb);
	if(odda == oddb){
	    count += Math.min(oddb,odda);
	}else{
	    count += Math.min(oddb,odda)+1;
	}
	/*
	System.out.println("odd : "+odd);
	System.out.println("odda : "+odda);
	System.out.println("oddb : "+oddb);
	*/
	/*
	if(odd > 0){
	    count += (odd-1);
	    odda = odda-(odd-1);
	    oddb = oddb-(odd-1);
	}
	count += Math.min(odda,oddb);
	*/
	/*
	if(odd == n){
	    count--;
	}
	*/
	/* 出力 */
	System.out.println(count);
	
    }
}
