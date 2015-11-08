package logic;

public class Soldier extends DestroyableEntity{
	
	protected Player owner;
	
	public Soldier(Player owner,int x, int y, int life) {
		super(x, y, life);
		// ownner
		this.owner=owner;
	}
	
	public void walk(){
		move(5,0);
	}
	public void jump(){
		move(0,5);
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		if(!isDestroy){
			
		}
	}

}
