public class Driver {

	public static void main(String[] args) {
		Counter counter = new Counter();
		
		System.out.println("Current count: " + counter.getCount());
		
		counter.increment();
		counter.increaseBy(2);
		
		System.out.println("Current count: " + counter.getCount());
		
		counter.decrement();
		counter.decreaseBy(-2);
		
		System.out.println("Current count: " + counter.getCount());
	}

}
