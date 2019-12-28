import static org.junit.Assert.*;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {

	@Test
	public void returnFizzBy3() {
		int number = 5;
		String result = FizzBuzz.of(number);
		assertThat(result).isEqualTo("Fizz");
	}

}
