
public class Gremlin extends Monster
{
    public Gremlin()
	{
		Gremlin.Monster =new DungeonCharacter("Gnarltooth the Gremlin", 70, 5, .8, 15, 30);
		Gremlin.chanceToHeal = .4;
		Gremlin.maxHeal = 40;
		Gremlin.minHeal = 20;

    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		System.out.println(Monster.name + " jabs his kris at " +
							opponent.getName() + ":");
		Monster.attack(opponent);

	}//end override of attack


}//end class Gremlin