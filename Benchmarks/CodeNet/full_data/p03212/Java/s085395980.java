class Main{
  public static void main(String[] args){
    java.util.Scanner sc = new java.util.Scanner(System.in);    
    int n = sc.nextInt();
    
    int count = 0;
    for(int i =0 ;  ; i++){
      int x = decode(i);
      if(x > n || -x > n){
        break;
      }
      if(x > 0){
        count++;
      }
    }
    System.out.println(count);
    
  }
  
  
  static int decode(int i){
    int rev = 0 ;
    int map[] = {0,3,5,7};
    int mapbitflg[] = {8,1,2,4};
    int flg = 0;
    while(i > 0){
      rev *= 10;
      rev += map[i%4];
      flg |= mapbitflg[i%4];
      i /= 4;
    }
    int res = 0;
    while(rev > 0 ){
      res *= 10;
      res += rev%10;
      rev /= 10;
    }
    if(flg == 7){
    	return res;
    }else{
      return -res;
    }
  }
}