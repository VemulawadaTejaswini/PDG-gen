import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	int[] c = new int[M];
	int[] candi = new int[M];
	int[] dic = {10,2,5,5,4,5,6,3,7,6};
	String[] str = new String[N+1];
	for(int i = 0; i<M; i++) {
	    c[i] = sc.nextInt();
	}
	for(int i = 0; i<M; i++) {
	    int min = 10;
	    int minI = 0;
	    for(int j = 0; j<M; j++){
		if(min > dic[c[j]]) {
		    min = dic[c[j]];
		    minI = j;
		}
	    }
	    candi[i] = c[minI];
	    c[minI] = 0;
	}

	str[0]="";
	for(int i = dic[candi[0]]; i<=N; i++) {
	    String max = "0";
	    for(int j = 0; j<M; j++) {
		if(i>=dic[candi[j]] && (str[i-dic[candi[j]]]+ String.valueOf(candi[j])).length()>0 && str[i-dic[candi[j]]] != null) {
		    String newString = str[i-dic[candi[j]]]+ String.valueOf(candi[j]);
		    if(max.length()<=newString.length()) {
			max = ((newString).compareTo(max)>0) ? newString: max;
		    }
		}
	    }
	    str[i] = max;
	}
	System.out.println(str[N]);
    }
}