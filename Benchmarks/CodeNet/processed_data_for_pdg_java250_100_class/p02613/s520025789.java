public class Main {
      public static void main(String args[]) {
    	  Scanner sc = new Scanner(System.in);
    	  int n = sc.nextInt();
    	  sc.nextLine();
    	  int a=0,w=0,t=0,r=0;
    	  while(n-->0) {
    		 String s = sc.nextLine();
    		 if(s.contains("AC"))
    			 a++;
    		 else if(s.contains("WA"))
    			 w++;
    		 else if(s.contains("TLE"))
    			 t++;
    		 else r++;
    	  }
    	  System.out.println("AC x "+a);
    	  System.out.println("WA x "+w);
    	  System.out.println("TLE x "+t);
    	  System.out.println("RE x "+r);
      }
}
