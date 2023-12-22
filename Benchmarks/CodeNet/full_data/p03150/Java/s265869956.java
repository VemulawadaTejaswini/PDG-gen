import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String a=scan.next();
		String str[]=new String[a.length()];
		for(int i=0;i!=a.length();i++) {
			char abc=a.charAt(i);
			str[i]=String.valueOf(abc);
		}
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		int count7=0;
		int count8=0;
		int ans=0;
		for(int i=0;i!=a.length();i++) {
			if(count8==1) {
				ans=0;
				break;
			}
			if(str[i].equals("e")&&count6==1) {
				if(count7==1) {
					count8=1;
				}
					ans++;
					break;
			}
			else {
				count7=1;
			}
			if(str[i].equals("c")&&count5==1) {
				if(count7==1) {
					count8=1;
				}
				if(str[i+1].equals("e")) {
					ans++;
					break;
				}
				else {
					count6=1;
				}
			}
			if(str[i].equals("n")&&count4==1) {
				if(count7==1) {
					count8=1;
				}
				if(str[i+1].equals("c")){
					if(str[i+2].equals("e")){
					ans++;
					break;
					}
					else {
						count6=1;
					}
				}
				else {
					count5=1;
				}
			}
			else {
				count7=1;
			}
			if(str[i].equals("e")&&count3==1) {
				if(count7==1) {
					count8=1;
				}
				if(str[i+1].equals("n")){
					if(str[i+2].equals("c")){
						if(str[i+3].equals("e")){
					ans++;
					break;
							}
						else {
							count6=1;
						}
					}
					else {
						count5=1;
					}
				}
				else {
					count4=1;
				}
			}
			else {
				count7=1;
			}
			if(str[i].equals("y")&&count2==1) {
				if(count7==1) {
					count8=1;
				}
				if(str[i+1].equals("e")){
					if(str[i+2].equals("n")){
						if(str[i+3].equals("c")){
			if(str[i+4].equals("e")){
					ans++;
					break;
							}
			else {
				count6=1;
			}
						}
						else {
							count5=1;
						}
					}
					else {
						count4=1;
					}
				}
				else {
					count3=1;
				}
			}
			else {
				count7=1;
			}
			if(str[i].equals("e")&&count1==1) {
				if(count7==1) {
					count8=1;
				}
				if(str[i+1].equals("y")){
					if(str[i+2].equals("e")){
						if(str[i+3].equals("n")){
			if(str[i+4].equals("c")){
				if(str[i+5].equals("e")){
					ans++;
					break;
				}
							}
			else {
				count6=1;
			}
						}
						else {
							count5=1;
						}
					}
					else {
						count4=1;
					}
				}
				else {
					count2=1;
				}
			}
			else {
				count7=1;
			}
			if(str[i].equals("k")&&i<=a.length()-7) {
if(str[i+1].equals("e")){
	if(str[i+2].equals("y")){
		if(str[i+3].equals("e")){
			if(str[i+4].equals("n")){
if(str[i+5].equals("c")){
	if(str[i+6].equals("e")){
		ans++;
		break;
	}
				}
else {
	count6=1;
}
			}
			else {
				count5=1;
			}
		}
		else {
			count4=1;
		}
	}
	else {
		count3=1;
	}
				}
else {
	count2=1;
}
			}
			else {
				count1=1;
			}
		}if(ans==1) {
		System.out.println("YES");
}
		else {
			System.out.println("NO");
		}
		}
	}