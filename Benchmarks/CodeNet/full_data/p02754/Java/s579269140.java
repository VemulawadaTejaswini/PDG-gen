import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import StdInOutStub.StandardInputSnatcher;
import StdInOutStub.StandardOutputSnatcher;
import TestUtil.TestDataFileReader;

public class MainTest
{
	String path = "./src/abc158/b/";
	StandardOutputSnatcher out = new StandardOutputSnatcher();
	StandardInputSnatcher in = new StandardInputSnatcher();
	TestDataFileReader r = new TestDataFileReader(path);

	@Before
	public void before()
	{
		System.setOut(out);
		System.setIn(in);
	}

	@After
	public void after()
	{
		System.setOut(null);
		System.setIn(null);
	}

	private void executeTest(TestDataFileReader r, int caseIndex)
	{
		if (caseIndex < r.getCaseSize()) {
			// 入力
			for (int i=0; i<r.getInputRow(caseIndex); i++) {
				in.inputln(r.getInput(caseIndex, i));
			}
			// テストターゲット実行
			Main.main(null);
			// 期待される出力
			for (int i=0; i<r.getOutputRow(caseIndex); i++) {
				Assert.assertThat(out.readLine(), Is.is(r.getOutput(caseIndex,i)));
			}
		} else {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void testMain1()
	{
		int caseIndex = 0;
		executeTest(r, caseIndex);

	}

	@Test
	public void testMain2()
	{
		int testCase = 1;
		executeTest(r, testCase);
	}

	@Test
	public void testMain3() {
		int testCase = 2;
		executeTest(r, testCase);
	}

	 @Test
	 public void testMain4()
	 {
		int testCase = 3;
		executeTest(r, testCase);
	 }

	  @Test
	  public void testMain5()
	  {
			int testCase = 4;
			executeTest(r, testCase);
	  }
		@Test
		public void testMain6()
		{
			int caseIndex = 5;
			executeTest(r, caseIndex);

		}

		@Test
		public void testMain7()
		{
			int testCase = 6;
			executeTest(r, testCase);
		}

		@Test
		public void testMain8() {
			int testCase = 7;
			executeTest(r, testCase);
		}

		 @Test
		 public void testMain9()
		 {
			int testCase = 8;
			executeTest(r, testCase);
		 }

		  @Test
		  public void testMain10()
		  {
				int testCase = 9;
				executeTest(r, testCase);
		  }
}
