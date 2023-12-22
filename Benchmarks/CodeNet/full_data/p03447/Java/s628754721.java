import static org.hamcrest.CoreMatchers.is;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

	@Test
	public void 入力例_1() throws Exception {
		String input = 
			"1234" + System.lineSeparator() +
			"150" + System.lineSeparator() +
			"100";
		String output = 
			"84";

		assertIO(input, output);
	}

	@Test
	public void 入力例_2() throws Exception {
		String input = 
			"1000" + System.lineSeparator() +
			"108" + System.lineSeparator() +
			"108";
		String output = 
			"28";

		assertIO(input, output);
	}

	@Test
	public void 入力例_3() throws Exception {
		String input = 
			"579" + System.lineSeparator() +
			"123" + System.lineSeparator() +
			"456";
		String output = 
			"0";

		assertIO(input, output);
	}

	@Test
	public void 入力例_4() throws Exception {
		String input = 
			"7477" + System.lineSeparator() +
			"549" + System.lineSeparator() +
			"593";
		String output = 
			"405";

		assertIO(input, output);
	}

	private void assertIO(String input, String output) throws Exception {
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		Main.main(new String[0]);

		Assert.assertThat(out.toString(), is(output + System.lineSeparator()));
	}
}
