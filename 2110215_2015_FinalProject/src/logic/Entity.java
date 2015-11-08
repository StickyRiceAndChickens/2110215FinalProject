package logic;

public abstract class Entity {
	protected int x;
	protected int y;
	protected int z;
	protected boolean isVisible,isDestroy;
	
	protected Entity(int x,int y){
		this.x=x;
		this.y=y;
		this.isDestroy=false;
		this.isVisible=true;
	}

	public int getZ() {
		return z;
	}

	public boolean isVisible() {
		return isVisible&&!isDestroy;
	}

	public boolean isDestroy() {
		return isDestroy;
	}
	
	
}
