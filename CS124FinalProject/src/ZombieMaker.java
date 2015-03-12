

public class ZombieMaker implements Runnable{
	private GameEngine ref;
	private double prob;
	private int chance;
	public ZombieMaker(GameEngine ref){
		this.ref = ref;
		prob = 99.0;	
	}
	@Override
	public void run() {
		while(true){
			chance = (int)(Math.random() * 100);
			if(ref.zombieList.size() >= 10){
				//Do Nothing
			}
			else if(chance > prob){
				ref.zombieList.add(ref.factory.createZombie());
				prob = 100.0;
				System.out.println("Created Enemy");
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			prob *= 0.9995;		
		}
	}
}
