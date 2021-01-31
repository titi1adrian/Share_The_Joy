
public class Main {
	
	public static void main(String [] args) {
		
		/*
		// 1. Testare Surprize
		FortuneCookie a = new FortuneCookie();
		System.out.println(a.toString());
		
		Candies b = new Candies();
		System.out.println(b.toString());
		
		MinionToy c = new MinionToy();
		MinionToy c1 = new MinionToy();
		MinionToy c2 = new MinionToy();
		MinionToy c3 = new MinionToy();
		MinionToy c4 = new MinionToy();
		MinionToy c5 = new MinionToy();
		MinionToy c6 = new MinionToy();
		System.out.println(c.toString());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		System.out.println(c5.toString());
		System.out.println(c6.toString());
		*/
		
		/*
		// 2. Testare Bags
		
			// Testare constructori
		BagFactory b = BagFactory.getBagFactory();
		IBag bagRandom = b.makeBag("random");
		IBag bagFifo = b.makeBag("fifo");
		IBag bagLifo = b.makeBag("lifo");
		
			// Testare adaugare
		bagRandom.put(GatherSurprises.gather(4));
		bagFifo.put(GatherSurprises.gather(4));
		bagLifo.put(GatherSurprises.gather(4));
		
		bagRandom.put(GatherSurprises.gather());
		bagFifo.put(GatherSurprises.gather());
		bagLifo.put(GatherSurprises.gather());
		
		
		RandomBag aux1 = (RandomBag) bagRandom;
		FIFOBag aux2 = (FIFOBag) bagFifo;
		LIFOBag aux3 = (LIFOBag) bagLifo;
		
			// Testare vizualizare continut
		System.out.println("\nThe random BAG : ");
		aux1.showSurprises();
		
		System.out.println("\nThe FIFO BAG : ");
		aux2.showSurprises();
		
		System.out.println("\nThe LIFO BAG : ");
		aux3.showSurprises();
		
			// Testare put
		bagRandom.put(bagFifo);
		
			// Testare isEmpy() si size()
		System.out.println("\n\nIs the random bag empty ? " + bagRandom.isEmpty() + " The sie : " + bagRandom.size());
		System.out.println("Is the FIFO bag empty ? " + bagFifo.isEmpty() + " The sie : " + bagFifo.size());	
		System.out.println("Is the LIFO bag empty ? " + bagLifo.isEmpty() + " The sie : " + bagLifo.size());	
		
			// Testare scoatere cadouri
		
		System.out.println("\nThe random BAG : ");
		aux1.showSurprises();
		System.out.println("\nFrom random bag we got : " + bagRandom.takeOut());
		
		bagFifo.put(GatherSurprises.gather(4));
		System.out.println("\nThe FIFO BAG : ");
		aux2.showSurprises();
		System.out.println("\nFrom FIFO bag we got : " + bagFifo.takeOut());
		
		System.out.println("\nThe LIFO BAG : ");
		aux3.showSurprises();
		System.out.println("\nFrom LIFO bag we got : " + bagLifo.takeOut());
		*/
		
		/*
		// 3 .Testare Give Surprises
		
		AbstractGiveSurprises giveRandom = new GiveSurpriseAndSing("Random", 2);
		AbstractGiveSurprises giveFifo = new GiveSurpriseAndApplause("FIFO", 3); 
		AbstractGiveSurprises giveLifo = new GiveSurpriseAndHug("Lifo", 4);
		
		BagFactory b = BagFactory.getBagFactory();
		IBag bagRandom = b.makeBag("random");
		IBag bagFifo = b.makeBag("fifo");
		IBag bagLifo = b.makeBag("lifo");
		
		bagRandom.put(GatherSurprises.gather(4));
		bagFifo.put(GatherSurprises.gather(4));
		bagLifo.put(GatherSurprises.gather(4));
		
		giveRandom.put(bagFifo);
		giveFifo.put(bagLifo);
		giveLifo.put(bagRandom);
		
		giveRandom.give();
		giveFifo.give();
		giveLifo.give();
		
		giveRandom.giveAll();
		giveFifo.giveAll();
		giveLifo.giveAll();
		 */
		
	}

}
