
public class DefaultState implements State{
	Zombie z;
	public DefaultState(Zombie z){
		this.z = z;
	}
	@Override
	public void defaultAction() {
		
		
		/*
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(z.direction == 0){
			if(!z.colRight())
			z.x+=z.SPEED;
		}
		else if(z.direction == 1){
			if(!z.colUp())
			z.y-=z.SPEED;
		}
		else if(z.direction == 2){
			if(!z.colLeft())
			z.x-=z.SPEED;
		}
		else{
			if(!a.colDown())
			z.y+=z.SPEED;
		}			
		int chance = (int) (100 * Math.random());
		if(chance > z.turnProb){
			z.direction = (int) (Math.random() * 4);
			z.turnProb = 100.0;
		}
		z.turnProb *= 0.9995;
		*/
	}

	@Override
	public void reachedPlayer() {
		// TODO Auto-generated method stub
		
	}
	
}
