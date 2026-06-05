public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 0;
	}
	
	public void increment() {
		count++;
	}
	
	public void increaseBy(int amount) {
		count += amount;
	}
	
	public void decrement() {
		count--;
	}
	
	public void decreaseBy(int amount) {
		count -= amount;
	}
	
	public void multiplyBy(int factor) {
		count *= factor;
	}
	
	public void triple() {
		multiplyBy(3);
	}

	public void powerBy(int exponent) {
		count = (int) Math.pow(count, exponent);
	}
	
	public boolean isCountEven() {
		return count % 2 == 0;
	}
	
	public int getCount() {
		return count;
	}
	
}
