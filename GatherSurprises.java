import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {
	
	private static final Random random = new Random();
	
	public static ArrayList<ISurprise> gather (int n ) {
		
		ArrayList<ISurprise> gifts = new ArrayList<ISurprise>(n);
		
		for (int i  = 0 ; i < n ; i++) {
			
			int a = random.nextInt(3) + 1;
			
			if (a == 1)
				gifts.add(new FortuneCookie());
			
			if (a == 2)
				gifts.add(new Candies());
			
			if (a == 3)
				gifts.add(new MinionToy());
		}
		
		return gifts;
	}
	
	public static ISurprise gather() {
		
		int a = random.nextInt(2) + 1;
		
		if (a == 1)
			return new FortuneCookie();
		
		if (a == 2)
			return new Candies();
		
		if (a == 3)
			return new MinionToy();
		
		return null;
	}
	
	
	
	private GatherSurprises() {
		
	}
	

}
