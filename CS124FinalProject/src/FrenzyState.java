
public class FrenzyState implements State{
	Zombie z;
	FrenzyState(Zombie z){
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
				z.xpos = z.xpos-2;
			}
			if(z.targetX > z.xpos){
				z.xpos = z.xpos+2;
			}
			if(z.targetY < z.ypos){
				z.ypos = z.ypos-2;
			}
			if(z.targetY > z.ypos){
				z.ypos = z.ypos+2;
			}
		}
	}
	@Override
	public void reachedPlayer() {
		// TODO Auto-generated method stub
		
	}
}
