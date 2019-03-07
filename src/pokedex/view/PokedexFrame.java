package pokedex.view;

import javax.swing.JFrame;

import pokedex.controller.PokedexController;

public class PokedexFrame extends JFrame
{
	public PokedexFrame(PokedexController app)
	{
		PokedexPanel panel = new PokedexPanel(app);
		setupFrame(panel);
	}
	
	public void setupFrame(PokedexPanel panel)
	{
		this.setContentPane(panel);
		this.setSize(1280,760);
		this.setVisible(true);
	}
}
