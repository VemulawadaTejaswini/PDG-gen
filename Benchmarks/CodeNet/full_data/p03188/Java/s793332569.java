    import java.util.*;
    public class Main {
    	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    // 整数の入力
	    int k = sc.nextInt();
	    // 出力

	    int n;
	    int amari;
	    if(k == 1){
		System.out.println("1");
		System.out.println("1");
	    }else if(k == 2){
		System.out.println("2");
		System.out.println("1 2");
		System.out.println("2 1");
	    }else if(k == 3){
		System.out.println("2");
		System.out.println("1 2");
		System.out.println("3 1");
	    }else if(k == 4){
		System.out.println("2");
		System.out.println("1 2");
		System.out.println("3 4");
	    }else{
		int cut = 4 - k % 4;
		if (cut != 4){
		    n = (k + cut) / 2;
		}else{
		    n = k / 2;
		}
		System.out.println(n);
		for(int r = 0; r < n; r++){
		    for(int c = 0; c < n; c++){
			if (r % 2 == 0){
			    System.out.print(c + 1 + " ");
			}else{
			    if(c == 1 && cut >= 1 ||
			       c == 2 && cut >= 2 ||
			       c == 3 && cut >= 3){
				System.out.print(c + " ");
			    }else{
				System.out.print(c + 1 + n + " ");
			    }
			}
		    }
		    System.out.println();
		}
	    }
	}
    }
