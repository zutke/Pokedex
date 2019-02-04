package pokedex.model.rock;

public class RockSnake extends RockBoi implements GardenBrigand
{
	public RockSnake(String name, int health)
	{
		super(name, health);
		this.name = name;
		this.health = health;
		this.canEvolve = false;
	}

	@Override
	public int SnakeAround()
	{
		int damage = 0;
		System.out.println(this.name + " snakes around.");
		return damage;
	}

	@Override
	public int Set()
	{
		int damage = 0;
		
		return damage;
	}
	

}
