import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long k=sc.nextLong();
    long[] a=new long[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    long cntM=0,cntZ=0,cntP=0;
    for(int i=0;i<n;i++){
      if(a[i]<0){
        cntM++;
      }else if(a[i]==0){
        cntZ++;
      }else{
        cntP++;
      }
    }
    long proM=cntM*cntP;
    long proZ=cntZ*(cntM+cntP)+cntZ*(cntZ-1)/2;
    long proP=(cntM*(cntM-1)+cntP*(cntP-1))/2;
    long[] ma=Arrays.copyOfRange(a,0,(int)cntM);
    long[] pa=Arrays.copyOfRange(a,(int)(cntM+cntZ),a.length);
    
    System.err.println(cntM+","+cntZ+","+cntP);
    System.err.println(proM+","+proZ+","+proP);
    System.err.println(Arrays.toString(ma));
    System.err.println(Arrays.toString(pa));
    
    if(k<=proM){
      System.err.println("MINUS");
      System.out.println(calcM(ma,pa,k,proM));
    }else if(k<=proM+proZ){
      System.err.println("ZERO");
      System.out.println(0);
    }else{
      System.err.println("PLUS");
      System.out.println(calcP(ma,pa,k-proM-proZ,proP));
    }
    
    /*
    debug(ma,pa);
    brute(a);
    */
  }
  static long calcM(long[] ma,long[] pa,long k,long proM){
    long lo=-1_000_000_000_000_000_000L;
    long hi= 0;
//    while(hi-lo>1){
    while(true){
      long gaze=lo+(hi-lo)/2;
      long over =MPo(ma,pa,gaze);
      long under=MPu(ma,pa,gaze);
      System.err.println(gaze+":"+over+","+under);
      if(under<k&&over<=proM-k){
        return gaze;
      }else if(under>=k){
        hi=gaze;
      }else{
        lo=gaze+1;
      }
    }
//    return 404;
  }
  static long calcP(long[] ma,long[] pa,long k,long proP){
    System.err.println("calcP k="+k+",proP="+proP);
    long lo= 1;
    long hi= 1_000_000_000_000_000_001L;
//    while(hi-lo>1){
    while(true){
      long gaze=lo+(hi-lo)/2;
      long over =MMo(ma,gaze)+PPo(pa,gaze);
      long under=MMu(ma,gaze)+PPu(pa,gaze);
      System.err.print(gaze+":"+over+","+under);
      if(under<k&&over<=proP-k){
        return gaze;
      }else if(under>=k){
        System.err.println(" high!");
        hi=gaze;
      }else{
        System.err.println(" low!");
        lo=gaze+1;
      }
    }
//    return -404;
  }
  static long MPo(long[] ma,long[] pa,long x){
    long res=0;
    int mi=0;
    int pi=0;
    for(;pi<pa.length;pi++){
      while(mi<ma.length&&pa[pi]*ma[mi]<=x){
        mi++;
      }
      res=res+(ma.length-mi);
    }
    return res;
  }
  static long MPu(long[] ma,long[] pa,long x){
    long res=0;
    int mi=ma.length-1;
    int pi=pa.length-1;
    for(;pi>=0;pi--){
      while(mi>=0&&pa[pi]*ma[mi]>=x){
        mi--;
      }
      res=res+(mi+1);
    }
    return res;
  }
  static long PPo(long[] pa,long x){
    long res=0;
    int pi=pa.length-1;
    int pj=0;
    for(;pi>=0;pi--){
      while(pj<pa.length&&pa[pi]*pa[pj]<=x){
        pj++;
      }
      if(pi<=pj){
        break;
      }
      res=res+(pi-pj);
    }
    return res;
  }
  static long PPu(long[] pa,long x){
    long res=0;
    int pi=0;
    int pj=pa.length-1;
    for(;pi<pa.length;pi++){
      while(pj>=0&&pa[pi]*pa[pj]>=x){
        pj--;
      }
      if(pi>=pj){
        break;
      }
      res=res+(pj-pi);
    }
    return res;
  }
  static long MMo(long[] ma,long x){
    long res=0;
    int mi=0;
    int mj=ma.length-1;
    for(;mi<ma.length;mi++){
      while(mj>=0&&ma[mi]*ma[mj]<=x){
        mj--;
      }
      if(mi>=mj){
        break;
      }
      res=res+(mj-mi);
    }
    return res;
  }
  static long MMu(long[] ma,long x){
    long res=0;
    int mi=ma.length-1;
    int mj=0;
    for(;mi>=0;mi--){
      while(mj<ma.length&&ma[mi]*ma[mj]>=x){
        mj++;
      }
      if(mi<=mj){
        break;
      }
      res=res+(mi-mj);
    }
    return res;
  }
  static void debug(long[] ma,long[] pa){
    for(long i=0;i<=8000000000000000L;i+=1000000000000000L){
      System.err.println(i);
      System.err.println("PPo="+PPo(pa,i)+",MMo="+MMo(ma,i));
      System.err.println("PPu="+PPu(pa,i)+",MMu="+MMu(ma,i));
    }
  }
  static void brute(long[] a){
    PriorityQueue<Long> pq =new PriorityQueue<>();
    for(int i=0;i<a.length-1;i++){
      for(int j=i+1;j<a.length;j++){
        pq.add(a[i]*a[j]);
      }
    }
    long idx=1;
    while(!pq.isEmpty()){
      if(idx>=0){
        System.out.println(idx+"\t"+pq.poll());
      }else{
        pq.poll();
      }
      idx++;
      if(idx>=40){
        break;
      }
    }
  }
}