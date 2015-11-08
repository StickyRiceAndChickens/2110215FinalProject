package logic;

import java.util.ArrayList;

public class Player {
	
	protected ArrayList<City> myCities;
	protected ArrayList<Soldier> mySoldiers;
	protected boolean isLose;
	protected String name;
	protected int completedObjective;
	protected int food, gold;
	
	public Player(String name, int food, int gold) {
		this.name = name;
		isLose = false;
		completedObjective = 0;
		myCities = new ArrayList<City>();
		mySoldiers = new ArrayList<Soldier>();
		this.food = food;
		this.gold = gold;
		mySoldiers.add(new King());
	}

}
