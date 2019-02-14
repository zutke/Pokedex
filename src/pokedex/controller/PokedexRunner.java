package pokedex.controller;

import pokedex.view.*;

public class PokedexRunner
{
	public static void main(String[] args)
	{
		PokedexController controller = new PokedexController();
		PokedexFrame frame = new PokedexFrame(controller);
		controller.start();
	}
}