package com.neeraj;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperTestParametrized {

	private StringHelper st = new StringHelper();
	private String input;
	private String output;

	public StringHelperTestParametrized(String input, String output) {
		super();
		this.input = input;
		this.output = output;
	}

	@Parameters
	public static Collection<String[]> getParameters() {
		String[][] str = { { "AABCD", "BCD" }, { "AAB", "B" } };
		return Arrays.asList(str);

	}

	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals(output, st.truncateAInFirst2Positions(input));
	}
}
