import java.util.concurrent.TimeUnit;
public abstract class AbstractGiveSurprises {
	
	private IBag theBag;
	private int waitTime;
	
	
	public AbstractGiveSurprises(String type , int waitTime) {
		this.waitTime = waitTime;
		BagFactory b = BagFactory.getBagFactory();
		
		if (type.equals("RANDOM") || type.equals("Random") || type.equals("random"))
			this.theBag = b.makeBag(type);
		
		if (type.equals("FIFO") || type.equals("Fifo") || type.equals("fifo"))
			this.theBag = b.makeBag(type);
		
		if (type.equals("LIFO") || type.equals("Lifo") || type.equals("lifo"))
			this.theBag = b.makeBag(type);
		
		// In caz ca nu se introduce o varianta valida
		if (this.theBag == null) {
			try {
				@SuppressWarnings("unused")
				int a = 3/0;
			}
			catch(Exception e) {
				System.out.println("That is not a valid type of bag ! (RANDOM, FIFO or LIFO)");
			}
		
		}
	}

	public void put (IBag surprises) {
		this.theBag.put(surprises);
	}
	
	public void put (ISurprise newSurprise) {
		this.theBag.put(newSurprise);
	}

	public void give() {
		this.theBag.takeOut();
		this.giveWithPassion();
	}
	
	public void giveAll() {
		
		while (!this.theBag.isEmpty()) {
			this.give();
			try {
				  TimeUnit.SECONDS.sleep(this.waitTime); // number of seconds to sleep
				} catch (InterruptedException e) {
				  e.printStackTrace();
				}
		}
	}
	
	public boolean isEmpty() {
		return this.theBag.isEmpty();
	}
	
	abstract void giveWithPassion();

}
