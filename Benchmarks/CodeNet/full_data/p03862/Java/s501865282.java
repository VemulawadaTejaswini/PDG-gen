package main

import "fmt"
type long int64
func Min(x,y long) long {
 if x < y {
  return x
 }
 return y
}

func main() {
 var N,x,ans,i long
 var a [100000]long

 fmt.Scan(&N,&x)
 for i=0;i<N;i++ {
  fmt.Scan(&a[i])
 }

 for i=1;i<N;i++ {
  var diff long = a[i-1]+a[i]-x
  if diff > 0 {
   ans += diff
   min := Min(diff,a[i])
   a[i] -= min
   diff -= min
   if diff > 0 {
    a[i-1]-=diff
   }
  }
 }
 fmt.Println(ans)
}