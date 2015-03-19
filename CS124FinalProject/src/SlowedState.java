
public class SlowedState implements State{
	Zombie z;
	public SlowedState(Zombie z){
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
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(z.targetX > z.xpos){
				z.xpos++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(z.targetY < z.ypos){
				z.ypos--;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(z.targetY > z.ypos){
				z.ypos++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

	@Override
	public void reachedPlayer() {
		// TODO Auto-generated method stub
		
	}
	
}