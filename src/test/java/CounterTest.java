import static org.junit.Assert.*;
import org.junit.Test;

public class CounterTest {

	@Test
	public void resetSetsCountToZero() {
		Counter testCounter = new Counter();
		
		for (int i = 0; i < 10; i++) {
			testCounter.increment();
		}
		
		testCounter.reset();
		
		assertEquals(0, testCounter.getCount());
	}

	@Test
	public void incrementIncreasesCountByOne() {
		Counter testCounter = new Counter();
		
		for (int i = 1; i < 10; i++) {
			testCounter.increment();
			assertEquals(i, testCounter.getCount());
		}
	}

	@Test
	public void decrementDecreasesCountByOne() {
		Counter testCounter = new Counter();
		
		for (int i = 1; i < 10; i++) {
			testCounter.decrement();
			assertEquals(i * -1, testCounter.getCount());
		}
	}

	@Test
	public void increaseByAddsAmountToCount() {
		Counter testCounter = new Counter();

		testCounter.increaseBy(5);

		assertEquals(5, testCounter.getCount());
	}

	@Test
	public void decreaseBySubtractsAmountFromCount() {
		Counter testCounter = new Counter();

		testCounter.decreaseBy(4);

		assertEquals(-4, testCounter.getCount());
	}

	@Test
	public void multiplyByMultipliesCountByFactor() {
		Counter testCounter = new Counter();
		testCounter.increaseBy(3);

		testCounter.multiplyBy(4);

		assertEquals(12, testCounter.getCount());
	}

	@Test
	public void tripleMultipliesCountByThree() {
		Counter testCounter = new Counter();
		testCounter.increaseBy(4);

		testCounter.triple();

		assertEquals(12, testCounter.getCount());
	}

	@Test
	public void powerByRaisesCountToExponent() {
		Counter testCounter = new Counter();
		testCounter.increaseBy(3);

		testCounter.powerBy(3);

		assertEquals(27, testCounter.getCount());
	}

	@Test
	public void isCountEvenReturnsTrueForEvenCount() {
		Counter testCounter = new Counter();
		testCounter.increaseBy(2);

		assertTrue(testCounter.isCountEven());
	}

	@Test
	public void isCountEvenReturnsFalseForOddCount() {
		Counter testCounter = new Counter();
		testCounter.increaseBy(3);

		assertFalse(testCounter.isCountEven());
	}

}
