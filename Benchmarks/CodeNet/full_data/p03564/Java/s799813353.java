import java.util.Scanner;

class Main{
  public static void main(String args[]){
    
    Scanner scan = new Scanner(System.in);
    int n = Integer.parseInt(scan.next());
    int k = Integer.parseInt(scan.next());
    
    int keijibanNo = 1;
    int keijibanNoAfCalcA = 0;
    int keijibanNoAfCalcB = 0;
    
    for (int i = 0 ; i < n ; i++) {
    	keijibanNoAfCalcA = calcA(keijibanNo);
    	keijibanNoAfCalcB = calcB(keijibanNo, k);
    	if (keijibanNoAfCalcA > keijibanNoAfCalcB) {
    		keijibanNo = keijibanNoAfCalcB;
    	} else {
    		keijibanNo = keijibanNoAfCalcA;
    	}	
    }
	System.out.println(String.valueOf(keijibanNo));
	return;
  }
  
  private static int calcA(int keijibanNo){
  	return keijibanNo * 2;
  }

  private static int calcB(int keijibanNo, int k){
  	return keijibanNo + k;
  }
  
}

