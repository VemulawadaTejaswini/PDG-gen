class Main {
	public static void main (String[] args) {
        Scanner input=new Scanner(System.in);
        String ch;
        ch=input.next();
        boolean ans=Character.isUpperCase(ch.charAt(0));
        if(ans)
            System.out.println("A");
        else  
             System.out.println("a");
        input.close();
	}
}
