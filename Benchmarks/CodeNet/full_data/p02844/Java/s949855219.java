import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		char[] S=sc.next().toCharArray();
        boolean hyaku=false;
        boolean juu=false;
        boolean iti=false;
        int result;
        for(int i=0; i<10; i++){
            for(int k=0; k<10; k++){
                for(int l=0; l<10; l++){
                    for(int m=0; m<N; m++){
                        if(S[m]==i){
                           hyaku=true;
                        }
                        if(hyaku && S[m]==k){
                           juu=true;
                        }
                        if(hyaku && juu && S[m]==l){
                           iti=true;
                        }
                    }
                if(hyaku && juu&& iti){
                result++;
                }
                  hyaku==false;
                  juu==false;
                  iti==false;
                }
            }
        }
		System.out.println(result);
	}
}
