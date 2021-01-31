import java.util.Random;

public class Candies extends Object implements ISurprise {
	
	private int numberOfCandies;
	private flavours typeOfCandies;
	private static final Random random = new Random();
	private static  enum flavours {
		chocolate, jelly, fruits, vanilla, apple, hiwi, orange, grape, watermelon, strawberry};
	
		
	public Candies() {
		int [] a;
		
		a = generate();
		this.numberOfCandies = a[1];
		this.typeOfCandies = flavours.values()[a[0]];
	}
	
	private static int[] generate() {
		
		int[] a = new int[2];
		
		a[0] = random.nextInt(10);
		a[1] = random.nextInt(100) + 1;
		
		return a;
	}

	@Override
	public String toString() {
		return "There are " + this.numberOfCandies + " candies and they are " + this.typeOfCandies +  " flavoured";
	}

	@Override
	public void enjoy() {
		
	}
	
	
	
}
