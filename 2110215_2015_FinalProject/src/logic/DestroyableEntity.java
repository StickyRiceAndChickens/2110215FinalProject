package logic;

public abstract class DestroyableEntity extends Entity implements Destroyable, Moveable {
	
	protected int speedX,speedY;
	protected int life;
	
	protected DestroyableEntity(int x,int y,int life) {
		super(x,y);
		this.life=life;
		
		
	}

	@Override
	public void move(int speedX,int speedY) {
		// change position
		
		x+=speedX;
		y+=speedY;
		
	}

	public int getLife() {
		return life;
	}

	@Override
	public  void changeLife(int amount) {
		// when get attacked
		life+=amount;
		if(life<=0){
			life=0;
			this.isDestroy=true;
		}
		
	}
	
	public abstract void update();
	
	

}
