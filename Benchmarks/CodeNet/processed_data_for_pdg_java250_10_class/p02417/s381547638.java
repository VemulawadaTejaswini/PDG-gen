class Main {
    public static void main(String [] args){
    	Scanner sc = new Scanner(System.in);
    	int[] count = new int[26];
    	while(sc.hasNext()){
    		 String moji = sc.next();
	    	 for(int i = 0; i < moji.length(); ++i){
	             if(Character.isLowerCase(moji.charAt(i))){
	            	 int num = moji.charAt(i) - 'a';
	            	 count[num]++;
	             }else if(Character.isUpperCase(moji.charAt(i))){
	            	 int num = moji.charAt(i) - 'A';
	            	 count[num]++;
	             }
	         }
    	}
    	 for(int i = 0 ; i < count.length ; i++ ){
    		 char alpha = (char)('a' + i);
    		 System.out.println(alpha + " " + ":" + " " + count[i]);
    	 }
    }
}
