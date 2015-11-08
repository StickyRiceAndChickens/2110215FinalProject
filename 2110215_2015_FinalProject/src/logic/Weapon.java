package logic;

public abstract class Weapon extends DestroyableEntity {
	
	private int power;
	private Soldier owner;
	
	protected Weapon(int x, int y, int life, int power, Soldier owner) {
		super(x, y, life);
		// TODO Auto-generated constructor stub
	}

}
