import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//int[] array_k = new int[100000];
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		if(k%2==1) {
			for(int i=1;n+1>i;i++) {
				if(i%k == 0) {
					for(int j=1;n+1>j;j++) {
						if(j%k == 0) {
							for(int l =1;n+1>l;l++) {
								if(l%k == 0) {
									count++;
									//System.out.println(i+" "+j+" "+l);
								}
							}
						}
					}
				}
			}
			System.out.println(count);
		}
		else {
			for(int i=1;n+1>i;i++) {
				if(i%k == 0) {
					for(int j=1;n+1>j;j++) {
						if(j%k == 0) {
							for(int l =1;n+1>l;l++) {
								if(l%k == 0) {
									count++;
									//System.out.println(i+" "+j+" "+l);
								}
							}
						}
					}
				}
				if(i%k == k/2) {
					for(int j=1;n+1>j;j++) {
						if(j%k == k/2) {
							for(int l =0;n+1>l;l++) {
								if(l%k == k/2) {
									count++;
									//System.out.println(i+" "+j+" "+l);
								}
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}