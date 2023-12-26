class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int scInt;
        int[] check  = new int[3];
        while (sc.hasNext()) {
            scInt = sc.nextInt();
	if (check[0] < scInt) {
		check[2] = check[1];
		check[1] = check[0];
		check[0] = scInt;
	} else if (check[1] < scInt) {
		check[2] = check[1];
		check[1] = scInt;
	} else if (check[2] < scInt) {
		check[2] = scInt;
	} else {
	}
        }
	System.out.println(check[0]);         
	System.out.println(check[1]);         
	System.out.println(check[2]);         
    }
}
