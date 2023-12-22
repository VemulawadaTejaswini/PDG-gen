public void minimuCost(int n, int[] hights) {
  if (n == 0 || n == 1) {
    return 0;
  }
  
  int[] minimumCostMemo = new int[n];
  minimumCostMemo[0] = 0;
  minimumCostMemo[1] = Math.abs(hights[0] - hights[1]);
  for (int i = 2; i < n; i++) {
    minimumCostMemo[i] = Math.min(
      (hights[i] - hights[i-2] + minimumCostMemo[i - 2]),
      (hights[i] - hights[i-1] + minimumCostMemo[i - 1]));
  }
  
  return minimumCostMemo[n - 1];
}