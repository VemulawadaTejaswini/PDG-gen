class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
		int zz = (4*x) - y;
      	if(zz == 0) {
         System.out.println("Yes");
        }else{
          int z = zz /2;
          int r = zz % 2;
          if (r==0 && z>0) {        
            if(x >= z){
          System.out.println("Yes");
            }else{
              System.out.println("No");
            }
          } else {
          System.out.println("No");
    		}
        }
    }
}
