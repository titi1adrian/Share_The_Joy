
public class BagFactory implements IBagFactory {
	
	private static BagFactory bagFactory = null;
	
	public static BagFactory getBagFactory() {
		
		if ( bagFactory == null)
			bagFactory = new BagFactory();
		
		return bagFactory;
	}
	
	private BagFactory () {

	}
	
	@Override
	public IBag makeBag(String type) {
		IBag bag = null;
		
		if (type.equals("RANDOM") || type.equals("Random") || type.equals("random"))
			bag = new RandomBag();
		
		if (type.equals("FIFO") || type.equals("Fifo") || type.equals("fifo"))
			bag = new FIFOBag();
		
		if (type.equals("LIFO") || type.equals("Lifo") || type.equals("lifo"))
			bag = new LIFOBag();
		
		// In caz ca nu se introduce o varianta valida
		if (bag == null) {
			try {
				@SuppressWarnings("unused")
				int a = 3/0;
			}
			catch(Exception e) {
				System.out.println("That is not a valid type of bag ! (RANDOM, FIFO or LIFO)");
			}
		}
			
		return bag;
	}

}
