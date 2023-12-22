import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		boolean boo = true;

		if (s.length()==1){
			count = 0;
		}
		else{
			char[] c = s.toCharArray();
			char index = c[0];
			for (int i=1;i<c.length;i++){
				if (c[i]!=index){
					boo = false;
				}
			}
			if (boo==true){
				count=0;
			}			
			else{
				s="";
				for (int i=0;i<c.length;i++){
					
					if (i==0){
						s = s+c[0];
					}
					else{
						if (c[i]!=c[i-1]){
							s = s+c[i];
						}
					}
				}

				c= s.toCharArray();

				if (c[0]==c[c.length-1]){
					char index1 =c[0];
					int diff=0;
					for (int i=1;i<c.length-1;i++){
						if (index1!=c[i]){
							diff++;
						}
					}
					count = count+diff*2;
				}
				else{
					char index1 =c[0];
					int diff=0;
					for (int i=1;i<c.length-1;i++){
						if (index1!=c[i]){
							diff++;
						}
					}
					count = count+diff*2+1;
				}
			}
		}
		System.out.println(count);
	}

}
