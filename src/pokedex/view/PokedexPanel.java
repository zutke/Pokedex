package pokedex.view;

import java.awt.event.*;
import javax.swing.*;

import pokedex.controller.PokedexController;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PokedexPanel extends JPanel
{
	private PokedexController app = new PokedexController();
	private SpringLayout appLayout = new SpringLayout();
	
	/*
	 * private JButton changeButton; private JComboBox pokedexDrop;
	 * 
	 * private JTextField health; 
	 * private JTextField number; 
	 * private JTextField evolve; 
	 * private JTextField enhancement; 
	 * private JTextField attack; 
	 * private JTextField name;
	 * 
	 * private JLabel healthL; 
	 * private JLabel numberL; 
	 * private JLabel evolveL;
	 * private JLabel enhancementL; 
	 * private JLabel attackL; 
	 * private JLabel nameL;
	 * private JLabel imageL;
	 */
	
	private ImageIcon pokemonIcon;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField healthField;
	private JTextField attackField;
	private JTextField enhancementField;
	private JTextField evolvableField;
	
	public PokedexPanel(PokedexController app)
	{
		super();
		this.app = app;
		this.pokemonIcon = new ImageIcon();
		
		setupPanel();
	}
	
	public void setupPanel()
	{
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{450, 0};
		gridBagLayout.rowHeights = new int[]{50, 50, 50, 50, 50, 50, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		nameField = new JTextField();
		nameField.setText("Name");
		GridBagConstraints gbc_nameField = new GridBagConstraints();
		gbc_nameField.fill = GridBagConstraints.BOTH;
		gbc_nameField.insets = new Insets(0, 0, 5, 0);
		gbc_nameField.gridx = 0;
		gbc_nameField.gridy = 0;
		add(nameField, gbc_nameField);
		nameField.setColumns(10);
		
		numberField = new JTextField();
		numberField.setText("Number");
		GridBagConstraints gbc_numberField = new GridBagConstraints();
		gbc_numberField.fill = GridBagConstraints.BOTH;
		gbc_numberField.insets = new Insets(0, 0, 5, 0);
		gbc_numberField.gridx = 0;
		gbc_numberField.gridy = 1;
		add(numberField, gbc_numberField);
		numberField.setColumns(10);
		
		healthField = new JTextField();
		healthField.setText("Health");
		GridBagConstraints gbc_healthField = new GridBagConstraints();
		gbc_healthField.fill = GridBagConstraints.BOTH;
		gbc_healthField.insets = new Insets(0, 0, 5, 0);
		gbc_healthField.gridx = 0;
		gbc_healthField.gridy = 2;
		add(healthField, gbc_healthField);
		healthField.setColumns(10);
		
		attackField = new JTextField();
		attackField.setText("Attack");
		GridBagConstraints gbc_attackField = new GridBagConstraints();
		gbc_attackField.fill = GridBagConstraints.BOTH;
		gbc_attackField.insets = new Insets(0, 0, 5, 0);
		gbc_attackField.gridx = 0;
		gbc_attackField.gridy = 3;
		add(attackField, gbc_attackField);
		attackField.setColumns(10);
		
		enhancementField = new JTextField();
		enhancementField.setText("Enhancement");
		GridBagConstraints gbc_enhancementField = new GridBagConstraints();
		gbc_enhancementField.fill = GridBagConstraints.BOTH;
		gbc_enhancementField.insets = new Insets(0, 0, 5, 0);
		gbc_enhancementField.gridx = 0;
		gbc_enhancementField.gridy = 4;
		add(enhancementField, gbc_enhancementField);
		enhancementField.setColumns(10);
		
		evolvableField = new JTextField();
		evolvableField.setText("Evolvable?");
		GridBagConstraints gbc_evolvableField = new GridBagConstraints();
		gbc_evolvableField.fill = GridBagConstraints.BOTH;
		gbc_evolvableField.gridx = 0;
		gbc_evolvableField.gridy = 5;
		add(evolvableField, gbc_evolvableField);
		evolvableField.setColumns(10);
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
