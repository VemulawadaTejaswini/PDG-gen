import java.util.* ; 
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
	int x = scan.nextInt() ;
	String[] s = new String[x];
	for(int i = 0 ; i < x ; i++) {
		s[i] = scan.next();
	}
	int count = 0;
	for(int i = 0 ; i < x -1  ; i++) {
		for(int j = i+1 ; j<x ; j++) {
			if(isAnagram(s[i],s[j]) == true) {
				count++;
			}
		}
	}
	System.out.println(count);
	
     
  }
  
  static boolean isAnagram(String s1 , String s2) {
	  HashMap<Character,Integer> hmap1 = new HashMap<>();
	  HashMap<Character,Integer> hmap2 = new HashMap<>();
	  char [] ch1 = s1.toCharArray();
	  char[] ch2 = s2.toCharArray();
	  
	  for(int i = 0 ; i <s1.length();i++) {
		  if(hmap1.get(ch1[i]) == null) {
			  hmap1.put(ch1[i], 1);
		  }else {
			  int c = hmap1.get(ch1[i]);
			  hmap1.put(ch1[i], c++);
		  }
	  }
	  for(int i = 0 ; i <s2.length();i++) {
		  if(hmap2.get(ch2[i]) == null) {
			  hmap2.put(ch2[i], 1);
		  }else {
			  int c = hmap2.get(ch2[i]);
			  hmap2.put(ch2[i], c++);
		  }
	  }
	  
	  if(hmap1.equals(hmap2)) {
		  return true ;
	  }else {
		  return false ;
	  }
  }
}