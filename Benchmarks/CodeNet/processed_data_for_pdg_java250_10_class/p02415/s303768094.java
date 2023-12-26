class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        str = scan.nextLine();
        char[] charA;
        charA = str.toCharArray();   
        for (int count = 0; count < charA.length; count++){
        	if( Character.isUpperCase(charA[count])){
        		charA[count] = Character.toLowerCase(charA[count]);
        	}
        	else if(Character.isLowerCase(charA[count])){
        		charA[count] = Character.toUpperCase(charA[count]);
            }
        }
        System.out.println(charA);
    }
}     
