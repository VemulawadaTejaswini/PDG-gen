import java.util.*;
class Main /*atcoder beginner contest 42*/{
	public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			int n = s.nextInt() , l = s.nextInt();
			int n1 = n;
			int[] pre = new int[10];
			for(int i = 0;i < l;i++){
				int dig = s.nextInt();
				pre[dig] = 1;
			}

			String np = n+"";
			int[] no = new int[np.length()];
			int indx = np.length()-1;
			while(n != 0){
				int p = n%10;
				no[indx] = p;
				n/=10;
				indx--;
			}
/*
			for(int i = 0;i  < no.length;i++)
				System.out.print(no[i]);
			System.out.println();
*/			int change = 0;
			for(int i = 0;i  < no.length;i++){
				int ele = no[i];
				// System.out.println(ele);
				if(pre[ele] == 1){

					if(i == 0){
						for(int j = ele;j <= 9;j++){
							if(pre[j] != 1 ){
								no[i] = j;
								change = 1;
								break;
							}
						}
					}
					else{
						for(int j = ele;j <= 9;j++){
							if(pre[j] != 1){
								no[i] = j;
								change = 1;
								break;
							}
						}
					}

				}
			}
			if(change == 0){
				// System.out.println("exe");
				for(int j = n1;j  <= 10000 ;j++){
					String line = j+"";
					int flag = 0;
					// System.out.println("line = "+line+" j = "+j);
					for(int i = 0;i < line.length();i++)
					{
						char p = line.charAt(i);
						indx = Integer.parseInt(p+"");
						if(pre[indx] == 1){
							flag = 1;
							break;
						}
					}
					if(flag == 0){
						System.out.println(line);
						break;
					}
				}
			}
			else{

				for(int i = 0;i < no.length;i++)
					System.out.print(no[i]);
				System.out.println();
			}

	}
}