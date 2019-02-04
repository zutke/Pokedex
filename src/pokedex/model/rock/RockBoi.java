package pokedex.model.rock;

import pokedex.model.Pokemon;

public class RockBoi extends Pokemon implements GardenWalkway
{
	public RockBoi(String name, int health)
	{
		super(name, health);
		this.name = name;
		this.health = health;
		this.canEvolve = true;
	}

	@Override
	public int RockAround()
	{
		int damage = 0;
		System.out.println(this.name + " rocks around.");
		return damage;
	}

	@Override
	public int Cobble()
	{
		int damage = 0;
		
		return damage;
	}
}


