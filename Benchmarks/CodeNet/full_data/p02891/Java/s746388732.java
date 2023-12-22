import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {

			String str = scan.next();
			long W = scan.nextLong();
			String[] split = str.split("");
			
			
			int sameNum = 1;
			long ans = 0;
			long headTail=0;
			
			for(int i = 1; i<split.length;i++) {
				if(split[i-1].equals(split[i])) {
					sameNum++;
				} else {
					ans += sameNum/2;
					sameNum=1;
				}
			}
          	ans += sameNum/2;
			sameNum=1;
			
			int headSame = 1;
			boolean changeHead = true;
			for(int i=0; i<split.length-1;i++) {
				if(split[i].equals(split[i+1])) {
					headSame++;
				} else {
					if(headSame%2==1) {
						changeHead = false;
					}
					break;
				}
			}
			
			int tailSame = 1;
			boolean changeTail = true;
			if(!changeHead) {
				for(int i=split.length-1; i>0;i--) {
					if(split[i].equals(split[i-1])) {
						tailSame++;
					} else {
						if(tailSame%2==1) {
							changeTail = false;
						}
						break;
					}
				}
			}
			
			
			if(split[0].equals(split[split.length-1])
					&& !changeHead
					&& !changeTail) {
				headTail = W-1;
			}
			System.out.println(ans*W+headTail);
		}
	}
}