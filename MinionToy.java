import java.util.Random;

public class MinionToy extends Object implements ISurprise {
	
	private nameOfAllMinions nameOfMinion;
	private typeOfAllMinions typeOfMinion;
	private static final Random random = new Random();
	private static enum nameOfAllMinions {Dave, Carl, Kevin, Stuart, Jerry, Tim, Jack, Liam, Noah, Oliver};
	private static enum typeOfAllMinions {Shy, Happy, Angry, Sleepy, Lazy, Active, Goofy, Lovable, Gourmet, Serious};
	private static int indexOfLastNameOfMinion = -1;
	
	public MinionToy() {
		int[] a;
		
		a = generate();
		
		this.nameOfMinion = nameOfAllMinions.values()[a[0]];
		this.typeOfMinion = typeOfAllMinions.values()[a[1]];
	}
	
	private static int[] generate() {
		
		int [] a = new int[2];
		
		if (MinionToy.indexOfLastNameOfMinion + 1 > 9)
			MinionToy.indexOfLastNameOfMinion = 0;
		else
			MinionToy.indexOfLastNameOfMinion++;
		
		a[0] = MinionToy.indexOfLastNameOfMinion;
		a[1] = random.nextInt(10);
		
		return a;
	}

	@Override
	public String toString() {
		return "The name of the minion is " + this.nameOfMinion + " and he is " + this.typeOfMinion;
	}
	
	@Override
	public void enjoy() {
		
	}
	
	

}
