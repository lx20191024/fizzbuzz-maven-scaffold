import static org.junit.Assert.*;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {

	@Test
	public void returnFizzBy3() {
		int number = 3;
		assertThat(FizzBuzz.of(number)).isEqualTo("Fizz");
	}
	
	@Test
	public void returnFizzBy5() {
		int number = 5;
		assertThat(FizzBuzz.of(number)).isEqualTo("Buzz");
	}

	@Test
	public void returnFizzBy15() {
		int number = 15;
		assertThat(FizzBuzz.of(number)).isEqualTo("Fizz Buzz");
	}
	@Test
	public void returnFizzBy2() {
		int number = 2;
		assertThat(FizzBuzz.of(number)).isEqualTo(String.valueOf(number));
	}
}
