import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		
		String[] sSplit = s.split("");

		String left = "(";
		String right = ")";

		int leftCnt = 0;
		int rightCnt = 0;

		int topCnt = 0;
		int tailCnt = 0;

		String[] temp = new String[n*2];
		int tempCnt = 0;

		for(int i=0; i<n; i++){
			if(sSplit[i].equals(left)){
				leftCnt++;
				temp[tempCnt++] = sSplit[i];
			}else if(sSplit[i].equals(right)){
				while(true){
					rightCnt++;
					if(i+1<n){
						if(sSplit[i+1].equals(right)){
							i++;
						}else{
							break;
						}
					}else{
						break;
					}
				}
				if(leftCnt>rightCnt){
					while(leftCnt-rightCnt>0){
						rightCnt++;
					}
					leftCnt = 0;
					while(rightCnt>0){
						temp[tempCnt++] = right;
						rightCnt--;
					}
				}else if(leftCnt<rightCnt){
					topCnt += rightCnt - leftCnt;
					leftCnt = 0;
					while(rightCnt>0){
						temp[tempCnt++] = right;
						rightCnt--;
					}
				}else if(leftCnt==rightCnt){
					leftCnt = 0;
					while(rightCnt>0){
						temp[tempCnt++] = right;
						rightCnt--;
					}
				}
			}
		}

		tailCnt = leftCnt;

		String[] ans = new String[topCnt + tempCnt + tailCnt];

		for(int i=0; i<topCnt; i++){
			System.out.print(left);
		}
		for(int i=0; i<tempCnt; i++){
			System.out.print(temp[i]);
		}
		for(int i=0; i<tailCnt; i++){
			System.out.print(right);
		}

	}

}
