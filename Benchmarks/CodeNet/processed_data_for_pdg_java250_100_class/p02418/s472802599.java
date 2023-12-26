class Main {
	public static void main(String[] args) {   
		Scanner scanner = new Scanner(System.in);
			String s= scanner.nextLine();
			String p= scanner.nextLine();
			char[] chars; 
			chars=new char[s.length()];
			String[] Strings;
			Strings=new String[s.length()];
			String compare="";
			boolean anther =false; 
			for(int i=0;i < s.length();i++){
				chars[i]=s.charAt(i);
				Strings[i]=String.valueOf(chars[i]);
			}
			int loop=0;
			for(int i =0;i<s.length();i++){
				loop=i;
			for(int ii=i;ii<p.length()+i;ii++){
				if(loop == s.length()){
					loop=0;
				}
				compare = compare.concat(Strings[loop]);	
				loop=loop+1;
				if(compare.equals(p)){
					anther=true;
				}
				}
			compare="";
			}
				if(anther){
					System.out.println("Yes");
				}
				else{
					System.out.println("No");
				}
		scanner.close();
	}
}
