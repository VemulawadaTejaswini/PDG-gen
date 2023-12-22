import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.*;
import java.security.NoSuchAlgorithmException;
import java.lang.annotation.*;
import java.util.stream.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.*;
import java.io.*;
import java.util.concurrent.*;
import java.lang.reflect.*;



// Solution can be found in Submission.testCase(). psvm method can be found in Main.main(String[] args)
// Please note that the code isn't obfuscated; only compressed

class Main{public static void main(String[]args){new TaskB().runSubmission();}};







@ContestSubmission(ContestType.SINGLE_TESTCASE)
@CacheVersion(0)
class TaskB extends AbstractSubmission {

	@Override
	public void testCase() {
		int N = sc.nextInt();
		int T = sc.nextInt();

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			int n = sc.nextInt();
			int t = sc.nextInt();
			if (t <= T) {
				min = Math.min(n, min);
			}
		}

		out.println(min == Integer.MAX_VALUE ? "TLE" : min);
	}



	@Override
	public void init() {
		// Nothing here! Good for initializing look-up tables

		// Note that there could be multiple Problem instances running on different threads. Writing static variables
		// here (or anywhere else) could lead to race conditions! Use static initialization instead
	}











	// Set to TRUE to override default (which may both be true or false). Setting to FALSE has no effect

	/* DISABLE-CODE-COMPRESSION: TRUE */
	/* GLOBAL-DISABLE-CODE-COMPRESSION: DEFAULT */
	/* JAVA-6-COMPATIBILITY-MODE: DEFAULT */
	/* KEEP-UNUSED-DEPENDENCIES: DEFAULT */





	
};

abstract class AbstractSubmission{public Scanner sc;public PrintStream out;public PrintStream debug;public volatile int testCaseCount=-1;public volatile int testCaseIndex;public volatile double progress=0;public void runSubmission(){runSubmission(false);}public void runSubmission(boolean debug){runSubmission(System.in,System.out,debug);}public void runSubmission(InputStream in,PrintStream out,boolean debug){runSubmission(in,out,debug?out:new VoidPrintStream());}public void runSubmission(InputStream in,PrintStream out,PrintStream debug){this.sc=new Scanner(in);this.out=out;this.debug=debug;ContestType type=getType();if(type.testCaseCount<=0){testCaseCount=sc.nextInt();sc.nextLine();}else{testCaseCount=type.testCaseCount;}testCaseIndex=0;init();for(testCaseIndex=1;testCaseIndex<=testCaseCount;testCaseIndex++){progress=0;out.printf(type.caseString,testCaseIndex,testCaseCount);testCase();}}public ContestType getType(){return getType(getClass());}public static ContestType getType(Class<?extends AbstractSubmission>clss){return getAnnotation(clss).value();}private static ContestSubmission getAnnotation(Class<?extends AbstractSubmission>clss){if(!clss.isAnnotationPresent(ContestSubmission.class)){throw new RuntimeException("ContestSubmission annotation not present on class "+clss.getCanonicalName()+"!");}return clss.getAnnotation(ContestSubmission.class);}private static String b64Hash(String s)throws NoSuchAlgorithmException{MessageDigest digest=MessageDigest.getInstance("SHA-256");byte[]encodedhash=Arrays.copyOf(digest.digest(s.getBytes(StandardCharsets.UTF_8)),3);return Base64.getEncoder().encodeToString(encodedhash);}public abstract void testCase();public abstract void init();};

abstract class Algorithm{private static long globalCounter=0;private long counter=globalCounter++;private Object result;private boolean end;protected Object runCustomAlgorithm(Runnable runnable){end=false;result=null;runnable.run();return result;}protected void end(){end(null);}protected void end(Object result){this.result=result;this.end=true;}protected boolean shouldEnd(){return end;}};

@Retention(RetentionPolicy.RUNTIME)@Target(ElementType.TYPE)@interface CacheVersion{int value();};

@Retention(RetentionPolicy.RUNTIME)@Target(ElementType.TYPE)@interface ContestSubmission{ContestType value();};

enum ContestType{PLAIN("",-1),ETH_JUDGE("",-1,null,false,false,6),GOOGLE("Case #%d: ",-1),GOOGLE_JAM("Case #%d: ",-1,"Solution.java",false,false,8),GOOGLE_JAM_INTERACTIVE("",-1,"Solution.java",false,false,8),FACEBOOK("Case #%d: ",-1),BLOOMBERG("",1),SINGLE_TESTCASE("",1);public int testCaseCount;public String caseString;public String launcher;public boolean disableCompression;public boolean keepUnusedDependencies;public int javaVersion;ContestType(String caseString,int testCaseCount,String launcher,boolean disableCompression,boolean keepUnusedDependencies,int javaVersion){this.caseString=caseString;this.testCaseCount=testCaseCount;this.launcher=launcher;this.disableCompression=disableCompression;this.javaVersion=javaVersion;this.keepUnusedDependencies=keepUnusedDependencies;}ContestType(String a1,int a2){this(a1,a2,null,false,false,8);}};

@Retention(RetentionPolicy.SOURCE)@Target(ElementType.METHOD)@interface O{String value();};

class VoidPrintStream extends PrintStream{public VoidPrintStream(){super(new VoidOutputStream());}public void write(int b){return;}public void print(char[]buf){return;}public void print(String s){return;}public void print(Object obj){return;}public void println(char[]buf){return;}public void println(String s){return;}public void println(Object obj){return;}public PrintStream format(Locale l,String s,Object...objs){return this;}public PrintStream format(String s,Object...objs){return this;}};

class VoidOutputStream extends OutputStream{public void write(int b)throws IOException{return;}};