
public class DefaultState implements State{
	Zombie z;
	public DefaultState(Zombie z){
		this.z = z;
	}
	@Override
	public void defaultAction() {
		
		try {
			Thread.sleep(25);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(Math.pow(z.xpos-z.targetX,2) + Math.pow(z.ypos-z.targetY,2) <= 10000 ){
			
		}
		else{
			if(z.targetX < z.xpos){
				z.xpos--;
			}
			if(z.targetX > z.xpos){
				z.xpos++;
			}
			if(z.targetY < z.ypos){
				z.ypos--;
			}
			if(z.targetY > z.ypos){
				z.ypos++;
			}
		}
		
	}

	@Override
	public void reachedPlayer() {
		// TODO Auto-generated method stub
		
	}
	
}
