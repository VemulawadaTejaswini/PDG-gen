class main{
	public static void main(String[] args){
		String hitachiString = "hi";    
        int result = args.indexOf(hitachiString);
        if (result != -1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	}
}