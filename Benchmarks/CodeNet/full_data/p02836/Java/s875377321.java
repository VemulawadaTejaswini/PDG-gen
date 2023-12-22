String s="linkaeiouideknil";
String p="";
String word="linkedin";
char[] wordC = word.toCharArray();
StringBuilder sb = new StringBuilder();
sb.append(word);
String drow = sb.reverse().toString();
sb.reverse();
sb.append(drow);
String pali=sb.toString();
char[] sC = s.toCharArray();
sC=Arrays.copyOf(sC, pali.length());
sb.delete(0, sb.length());
int counter=0;
for (int i = 0; i < sC.length; i++) {
    if(sC[i]!=pali.charAt(i)){
        sC[i]=pali.charAt(i);
        counter++;
    }
    sb.append(sC[i]);
}
System.out.println(counter);    
p=sb.toString();
System.out.println(p);