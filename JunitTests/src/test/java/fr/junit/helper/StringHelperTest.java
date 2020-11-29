package fr.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	// AACD => CD ACD=> CD CDFE=> CDFE CDAA => CDAA
	StringHelper helper;

	@Before
	public void before() {
		helper = new StringHelper();
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFistPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_NotContainsA() {
		assertEquals("CDFE", helper.truncateAInFirst2Positions("CDFE"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinLast2Position() {
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}

	// ABCD => false, ABAB => true AB=> true , A => false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegative() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositive() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
}
