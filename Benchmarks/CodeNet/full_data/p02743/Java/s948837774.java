public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer a = scan.next();
        Integer b = scan.next();
  		Integer c = scan.next();
 		
  		if(Math.sqrt(a)+Math.sqrt(b) < Math.sqrt(c))System.out.println("Yes");
        else System.out.println("No");
        scan.close();
    }