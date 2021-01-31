import java.util.ArrayList;

public class FIFOBag implements IBag {

	private static final String type = "FIFO";
	private ArrayList<ISurprise> surprises = new ArrayList<ISurprise>();
	
	
	//Metode proprii clasei
	
	public ArrayList<ISurprise> getSurprises() {
		return this.surprises;
	}
	
	public void showSurprises() {
			
			for (int i = 0 ; i < this.surprises.size() ; i++) {
				
				if (this.surprises.get(i) instanceof FortuneCookie) {
					FortuneCookie aux = (FortuneCookie) this.surprises.get(i);
					System.out.print((i+1) + ". ");
					System.out.println(aux.toString());
				}
				
				if (this.surprises.get(i) instanceof Candies) {
					Candies aux = (Candies) this.surprises.get(i);
					System.out.print((i+1) + ". ");
					System.out.println(aux.toString());
				}
				
				if (this.surprises.get(i) instanceof MinionToy) {
					MinionToy aux = (MinionToy) this.surprises.get(i);
					System.out.print((i+1) + ". ");
					System.out.println(aux.toString());
				}
				
			}
		}
	
	public String getType() {
		return type;
	}
	
	//Metode Override
	
	@Override
	public void put(ISurprise newSurprise) {
		this.surprises.add(newSurprise);
	}

	//Metoda pentru a pune in bag alt bag
	@Override
	public void put(IBag bagOfSurprises) {
		
		if (bagOfSurprises instanceof RandomBag) {
			RandomBag aux = (RandomBag) bagOfSurprises;
			this.surprises.addAll(aux.getSurprises());
			((RandomBag) bagOfSurprises).getSurprises().clear();
		}
		
		if (bagOfSurprises instanceof FIFOBag) {
			FIFOBag aux = (FIFOBag) bagOfSurprises;
			this.surprises.addAll(aux.getSurprises());
			((FIFOBag) bagOfSurprises).surprises.clear();
		}
		
		if (bagOfSurprises instanceof LIFOBag) {
			LIFOBag aux = (LIFOBag) bagOfSurprises;
			this.surprises.addAll(aux.getSurprises());
			((LIFOBag) bagOfSurprises).getSurprises().clear();
		}
	}
	
	//Metoda pentru a pune in bag direct cadouri
	@Override
	public void put(ArrayList<ISurprise> gifts) {
		this.surprises.addAll(gifts);
	}

	@Override
	public ISurprise takeOut() {
		
		ISurprise aux = null;
		
		if (this.surprises.size() != 0) {
			int a = 0;
		
			aux = this.surprises.get(a);
			this.surprises.remove(a);
		
		}else {
			
				System.err.println("The bag is empty !");
		}
		
		return aux;
	}

	@Override
	public boolean isEmpty() {
		if (this.surprises.size() != 0)
			return false;
		else
			return true;
	}

	@Override
	public int size() {
		return this.surprises.size();
	}
	


}
