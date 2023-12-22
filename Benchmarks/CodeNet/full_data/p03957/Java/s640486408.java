Matcher m = p.matcher(C);
int a = 0;
if (m.find()){
  a = a+1;
}
Matcher n = p.matcher(F);

if (m.find()){
  a = a+1;
}

if(a==2){System.out.print("true");}
else{System.out.print("no");}