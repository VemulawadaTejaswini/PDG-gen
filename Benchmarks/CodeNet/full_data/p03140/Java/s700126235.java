import java.util.Scanner;
public class Main {

			public static void main(String[]args) {
			
				Scanner sc = new Scanner(System.in);
				int N = sc.nextInt();
				String A = sc.next();
				char achar[] =A.toCharArray();
				String B = sc.next();
				char bchar[] = B.toCharArray();
				String C = sc.next();
				char cchar[] = C.toCharArray();
				
				int counter = 0;
				for (int i = 0; i<N; i++) {
					if(achar[i] == bchar[i]&&bchar[i] ==cchar[i])  //3文字同じ
						continue;
					else if(achar[i] ==bchar[i]||achar[i] == cchar[i]||bchar[i] == cchar[i]) //2文字ごとおなじ
						counter++;
					else
						counter += 2;
				}
				
				System.out.println(counter);
			}
}
