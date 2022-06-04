package com.pool.service.basic;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class BasicServiceTest {

	BasicService basicService;

	@BeforeEach
	public void init() {
		basicService = new BasicService();
		System.out.println("BEFORE EACH");
	}

	@BeforeAll
	public static void initBeforeAll() {
		System.out.println("BEFORE All");
	}

	@AfterAll
	public static void clearSessionAfterAll() {
		System.out.println("AFETR All");
	}

	@AfterEach
	public void clearSession() {
		System.out.println("AFETR EACH");
	}

	@Test
	@DisplayName("equals Not Equals Test")
	public void equalsNotEqualsTest() {

		var expected = 8;
		var expected1 = 9;
		var actual = basicService.add(4, 4);
		var actual1 = basicService.add(4, 4);
		assertEquals(expected, actual, "result should be 8");
		assertNotEquals(expected1, actual1, "result should be 8");
	}

	@Test
	@DisplayName("checkNullNotNull")
	public void checkNullNotNull() {
		String str1 = null;
		String str2 = "Shiva";
		assertNull(basicService.checkNull(str1), "Object is null");
		assertNotNull(basicService.checkNull(str2), "Object is not null");
	}

	@Test
	public void check_Null_Not_Null_Test() {
		String str1 = null;
		String str2 = "Shiva";
		assertNull(basicService.checkNull(str1), "Object is null");
		assertNotNull(basicService.checkNull(str2), "Object is not null");
	}

	@Test
	public void sameAndNotSame() {
		String testUserId = "508";
		assertSame(basicService.getUserId(), basicService.getDuplicateUserId(), "Objects should refer to same");
		assertNotSame(testUserId, basicService.getDuplicateUserId(), "Objects should refer to not same");
	}

	@Test
	public void isGreaterTest() {
		assertTrue(basicService.isGreater(508, 408));
		assertFalse(basicService.isGreater(408, 508));
	}

	@Test
	public void getFirstThreeLettersTest() {
		String[] firstThreeLetters = { "A", "B", "C" };
		assertArrayEquals(firstThreeLetters, basicService.getFirstThreeLetters(), "BOTH ARRAYS ARE EQUAL");
	}

	@Test
	public void getUserIdListTest() {
		List<String> userIdList = List.of("408", "423", "508");
		assertIterableEquals(userIdList, basicService.getUserIdList(), "Iterable test");
	}

	@Test
	public void getUserIdListLineTest() {
		List<String> userIdList = List.of("408", "423", "508");
		assertLinesMatch(userIdList, basicService.getUserIdList(), "Iterable test");
	}

	@Test
	public void exceptionTest() {
		assertThrows(Exception.class, () -> {
			basicService.isNumberPositive(-1);
		}, "EXCEPTION OCCURED");

		assertDoesNotThrow(() -> {
			basicService.isNumberPositive(1);
		}, "EXCEPTION DID NOT OCCURED");
	}

	@Test
	public void checkoutTest() {
		assertTimeoutPreemptively(Duration.ofSeconds(3), () -> basicService.checkout());
	}

}
