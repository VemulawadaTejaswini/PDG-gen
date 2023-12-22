import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = n/2;
        int amari = (n % 2 == 0) ? 0 : 1;
        String s = sc.next();

        for(int i = 0; i < n/2; i++) {
        	for(int j = 0; j <= i+amari; j++) {
        		System.out.println(s.substring(h+j,n) + " " + s.substring(j, j+h));
        		int l = bmSearch(s.substring(h+j,n),s.substring(j, j+h));
        		if( l == -1){

        	 		} else {
        	 		   System.out.println(l);
        	 		   return;
        	 	}
        	}
        	h--;
        	amari++;
        }
        System.out.println(0);
        return;
    }

    private static int bmSearch(String text, String pattern){
		  int[] cacheTable = new int[256];

		  for(int i = 0; i < 256; i++){
		   cacheTable[i] = pattern.length();
		  }
		  for(int i = 0; i < pattern.length(); i++){
		   cacheTable[pattern.charAt(i)] = pattern.length() - i -1;
		  }

		  int textIndex = pattern.length() - 1;
		  while(textIndex < text.length()) {

		   int patternIndex = pattern.length() - 1;

		   while(text.charAt(textIndex) == pattern.charAt(patternIndex)) {
		    if(patternIndex == 0){
		     return pattern.length();
		    }
		    --textIndex;
		    --patternIndex;
		   }

		   if(cacheTable[text.charAt(textIndex)] > pattern.length() - patternIndex){
		    textIndex += cacheTable[text.charAt(textIndex)];
		   } else {
		    textIndex += pattern.length() - patternIndex;
		   }
		  }
		  return -1;
		 }

}