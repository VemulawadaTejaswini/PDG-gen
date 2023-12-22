import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String aa=sc.next();
		int mojisu=aa.length();
		String crib=sc.next();
		int c_moji=crib.length();

		int[] key=new int[mojisu];
		int[] c_key=new int[c_moji];

		for(int i=0; i<mojisu; i++) {
			if(aa.charAt(i)=='?') {
				key[i]=-1;
			}
			else {
				key[i]=aa.charAt(i)-96;
			}
		}

		for(int i=0; i<c_moji; i++) {
			c_key[i]=crib.charAt(i)-96;
		}

		cb(key,c_key);


	}
	static void cb(int[] a,int[] b) {
		boolean deki=false;
		int counter=0;
		int ate=-1;

		for(int i=0; i<=a.length-b.length; i++) {
			counter=0;
			for(int j=0; j<b.length; j++) {
				if(a[i+j]==b[j] || a[i+j]==-1) {
					if(counter==0) {
						counter++;
						deki=true;
					}
					else if(counter>0) {
						counter++;
					}

					if(counter==b.length) {
						ate=i;
						break;
					}

				}
				else {
					counter=0;
					deki=false;
					ate=-1;
				}
			}
			if(ate>=0 && deki==true) {
				break;
			}
		}

		if(ate>=0) {
			for(int i=ate; i<b.length+ate; i++) {
				a[i]=b[i-ate];
			}
			for(int i=0; i<a.length; i++) {
				if(a[i]<0) {
					a[i]=1;
				}
			}
			String krs="";

			for(int i=0; i<a.length; i++) {
				krs=krs+((char)(a[i]+96))+"";
			}

			System.out.println(krs);
		}

		else {
			System.out.println("UNRESTORABLE");
		}
	}
}