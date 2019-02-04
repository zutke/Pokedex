package pokedex.model.fire;

import pokedex.model.Pokemon;

public class FieryHamster extends Pokemon implements Smores
{
	public FieryHamster(String name, int health)
	{
		super(name, health);
		this.name = name;
		this.health = health;
		this.canEvolve = true;
	}

	@Override
	public int FightFire()
	{
		int damage = 0;
		
		return damage;
	}

	@Override
	public int GetBurned()
	{
		int damage = 0;
		
		return damage;
	}

	@Override
	public int RoastMarshmallows()
	{
		int damage = 0;
		System.out.println(this.name + " roasts marshmallows.");
		return damage;
	}
}
