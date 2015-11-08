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

	@Override
	public  void changeLifePoint(int amount) {
		// when get attacked
		life+=amount;
		
	}
	
	public abstract void update();
	
	

}
