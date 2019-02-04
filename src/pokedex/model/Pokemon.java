package pokedex.model;

public abstract class Pokemon
{
	protected String name;
	protected int health;
	protected boolean canEvolve;
	public Pokemon(String name, int health)
	{
		this.name = name;
		this.health = health;
	}
}
