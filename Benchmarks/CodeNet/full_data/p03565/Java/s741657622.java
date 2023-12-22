import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();
		int ixlen = line1.length()-line2.length()+1;
		int reti = -1;
		for(int i=0; i<ixlen && reti==-1 ;i++){
			if(line1.charAt(i) == '?' || line1.charAt(i) == line2.charAt(0)){
				reti = i;
				for(int j=i+1,k=1;k<line2.length();j++,k++){
					if(line1.charAt(j) != '?' && line1.charAt(j) != line2.charAt(k)){
						reti = -1;
						break;
					}
				}
			}
		}
		if(reti == -1){
			line1 = "UNRESTORABLE";
		}
		else{
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<reti;i++){
				if(line1.charAt(i)=='?'){
					sb.append('a');
					continue;
				}
				sb.append(line1.charAt(i));
			}
			sb.append(line2);
			for(int j=sb.length();j<line1.length();j++){
				if(line1.charAt(j)=='?'){
					sb.append('a');
					continue;
				}
				sb.append(line1.charAt(j));
			}
			line1 = sb.toString();
		}
        System.out.println(line1);
    }
}
