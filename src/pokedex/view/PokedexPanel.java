package pokedex.view;

import java.awt.event.*;
import javax.swing.*;

import pokedex.controller.PokedexController;

public class PokedexPanel extends JPanel
{
	private PokedexController app = new PokedexController();
	private SpringLayout appLayout = new SpringLayout();
	
	private JButton changeButton;
	private JComboBox pokedexDrop;
	
	private JTextField health;
	private JTextField number;
	private JTextField evolve;
	private JTextField enhancement;
	private JTextField attack;
	private JTextField name;
	
	private JLabel healthL;
	private JLabel numberL;
	private JLabel evolveL;
	private JLabel enhancementL;
	private JLabel attackL;
	private JLabel nameL;
	private JLabel imageL;
	
	private ImageIcon pokemonIcon;
	
	public PokedexPanel(PokedexController app)
	{
		super();
		this.app = app;
		this.appLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon();
		
		health = new JTextField("0");
		number = new JTextField("My pokename");
		evolve = new JTextField("false");
		enhancement = new JTextField("0");
		attack = new JTextField("0");
		name = new JTextField("0");
		
		healthL = new JLabel("This pokemon's health is:");
		numberL = new JLabel("This pokemon's number is:");
		evolveL = new JLabel("Can this pokemon evolve?");
		enhancementL = new JLabel("This pokemon's enhancement level is:");
		attackL = new JLabel("This pokemon's attack level is:");
		nameL = new JLabel("This pokemon's name is:");
		
		changeButton = new JButton("Click here to change pokevalues");
		pokedexDrop = new JComboBox<String>(); // stub
		
		setupPanel();
	}
	
	public void setupPanel()
	{
		
		this.setLayout(appLayout);
		this.add(changeButton);
		this.add(pokedexDrop);
		this.add(health);
		this.add(number);
		this.add(evolve);
		this.add(enhancement);
		this.add(attack);
		this.add(name);
		
		this.add(healthL);
		this.add(numberL);
		this.add(evolveL);
		this.add(enhancementL);
		this.add(attackL);
		this.add(nameL);
		//this.add(imageL);
		
		//imageL.setVerticalTextPosition(JLabel.BOTTOM);
		//imageL.setHorizontalTextPosition(JLabel.CENTER);
		
		this.setVisible(true);
	}
	
	private void sendDataToController()
	{
		int index = pokedexDrop.getSelectedIndex();
		
		if(app.isInt(attack.getText()) && app.isDouble(enhancement.getText()) && app.isInt(health.getText()))
		{
			String[] data = new String[5];
			
			app.updatePokemon(index, data);
		}
	}
	
	private void changeImageDisplay(String name)
	{
		String path = "/pokemon/view/images";
		String defaultName = "ultraball";
		String extension = ".png";
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name.toLowerCase() + extension));
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		imageL.setIcon(pokemonIcon);
		repaint();
	}
	
	private void setupListeners()
	{
		changeButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
						sendDataToController();
					}
				});
		pokedexDrop.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent selection)
					{
						// TODO
					}
				});
	}
}
