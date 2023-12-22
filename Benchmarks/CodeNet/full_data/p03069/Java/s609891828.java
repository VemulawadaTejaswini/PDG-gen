import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	String s = scan.next();

	int index = n;
	for(int i = 0; i < n; i++){
	    if(s.charAt(i) == '#'){
		index = i;
		break;
	    }
	}

	int tmp1 = 0;
	for(int i = index+1; i < n; i++){
	    if(s.charAt(i) == '.'){
		tmp1++;
	    }
	}

	index = 0;
	for(int i = n-1; i >= 0 ; i--){
	    if(s.charAt(i) == '.'){
		index = i;
		break;
	    }
	}

	int tmp2 = 0;
	for(int i = index-1; i >= 0; i--){
	    if(s.charAt(i) == '#'){
		tmp2++;
	    }
	}

	int tmp3 = Integer.MAX_VALUE;
	for(int i = 0; i < n; i++){
	    int tmp = 0;
	    for(int j = 0; j < n; j++){
		if(j <= i && s.charAt(j) == '#'){
		    tmp++;
		}
		if(j > i && s.charAt(j) == '.'){
		    tmp++;
		}
	    }
	    if(tmp3 > tmp){
		tmp3 = tmp;
	    }
	}

	int[] a = new int[3];
	a[0] = tmp1;
	a[1] = tmp2;
	a[2] = tmp3;

	int count = Integer.MAX_VALUE;
	for(int i = 0; i < 3; i++){
	    if(count > a[i]){
		count = a[i];
	    }
	}

	/*
	if(tmp1 > tmp2){
	    count = tmp2;
	}else{
	    count = tmp1;
	}
	*/	
	System.out.println(count);
    }
}
