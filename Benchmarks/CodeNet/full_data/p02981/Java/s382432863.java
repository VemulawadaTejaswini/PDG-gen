public int Main(int N, int A, int B){
  int train = N*A;
  int taxi = B; 
  
  if(train - taxi >0){
    return taxi;
  } else {
    return train;
  }
}