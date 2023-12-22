function Main(input) {
	var A = parseInt(input.split(" ")[0]);
  var B = parseInt(input.split(" ")[1]);
  var C = parseInt(input.split(" ")[2]);
  if(A <= C && B >= C){
     console.log("Yes");
     }else{
     console.log("No");
     }
  
}

Main(require("fs").readFileSync("/dev/stdin", "utf8"));
