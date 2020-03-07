

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */


public abstract class Monster //extends DungeonCharacter
{
	static double chanceToHeal;
	static int minHeal;
	static int maxHeal;
	static DungeonCharacter Monster;

//-----------------------------------------------------------------
  public void heal()
  {
	boolean canHeal;
	int healPoints;

	canHeal = (Math.random() <= chanceToHeal) && (Monster.getHitPoints()> 0);

	if (canHeal)
	{
		healPoints = (int)(Math.random() * (maxHeal - minHeal + 1)) + minHeal;
		Monster.addHitPoints(healPoints);
		System.out.println(Monster.getName() + " healed itself for " + healPoints + " points.\n"
							+ "Total hit points remaining are: " + Monster.getHitPoints());
		System.out.println();
	}//end can heal
  }//end heal method

//-----------------------------------------------------------------
 public void subtractHitPoints(int hitPoints)
 {
		Monster.subtractHitPoints(hitPoints);
		heal();
 }//end method
 
//----------------------------------------------------------------
 //Getters
	 public String getName()
	 {
		 return Monster.getName();
	 }
	 public boolean isAlive()
	 {
		 return Monster.isAlive();
	 }
	public void attack(Hero theHero) 
	{
		Monster.attack(theHero);
	}
	public int getAttackSpeed() 
	{
		return Monster.getAttackSpeed();
	}
//----------------------------------------------------------------
}//end Monster class