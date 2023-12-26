class Main {
	public static void main(String[] args) {
		Scanner as = new Scanner(System.in);
		String s;
		String p;
		String str;
		int j = 0;
		int count = 0;
		int test = 0;
	    char sli[];
	    char pli[];
	    s = as.nextLine();
	    p = as.nextLine();
	    s = s+s;
	    sli = new char[s.length()];
	    pli = new char[p.length()];
	    for(int i=0;i<s.length();i++){      
            sli[i] = s.charAt(i);
        }
		for(int i=0;i<p.length();i++){      
			pli[i] = p.charAt(i);
		}
		for(int i=0;i<(s.length()/2);i++){      
			for(j=0;j<p.length();j++){
				if(sli[j+i] == pli[j]){
					count++;
				}
				else{
					count = 0;
				}
			}
			if(count == p.length()){
				break;
			}
			count = 0;
        }
		if(count == p.length()){
			str = "Yes";
			System.out.println(str);
		}
		else{
			str = "No";
			System.out.println(str);
		}
	}
}
