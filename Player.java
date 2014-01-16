
public class Player
{
	
	
	/*Here we will initiate every variable that will need to hold a value
	 * This will include every single stat, total and base as well as defensive stats
	 *  including evasion armor, mana, hp, etc..
	 */
	
	private final int BASEHPKNIGHT = 25;
	private final int BASEHPTHIEF = 15;
	private final int BASEHPWIZARD = 15;
	
	private final int BASEMANAKNIGHT = 5;
	private final int BASEMANATHIEF = 10;
	private final int BASEMANAWIZARD = 15;
		
	private String[] inventory = new String[15];
	//for the equipment we're going to have an array, where depending on gear type
	//it will assign it a specific index of the array
	//Index 0 = Helmet, 1 = Weapon Slot, 2 = Weapon Slot, 3 = Armor, 4 = Armor, 5 = gloves, 6 = boots, 7 = belt, 8 = amulet
	private String[] equipment = new String[9];
	
	public String job;
	
	//These will be used for stat points per level
	private int addedVitality = 0;
	private int addedIntellect = 0;
	private int addedDexterity = 0;
	private int addedStrength = 0;
	private int level = 1;
	
	//Base stat variables
	private int baseStr;
	private int baseDex;
	private int baseVit;
	private int baseInt;
	
	//These will be used to calculate leveled stats + gear stats
	private int totalVitality;
	private int totalIntellect;
	private int totalStrength;
	private int totalDexterity;
	private int totalPhysicalDamage;
	private int totalMagicDamage;
	private int totalHealth;
	
	//Defensive Stats
	private int baseEva;
	private int baseArmor;
	
	//Offensive stats
	private int weaponPhysicalDamage;
	private int weaponMagicDamage;

	
	
	/*
	 * This is where we'll create a player object.
	 * The current idea is that a player will be created with a specific class
	 * The class will set the initial base stats.
	 * Since there are only three classes, this reads in a string of the class, and runs the method to set stats
	 */
	public Player(Object jobs)
	{	
		if(jobs.equals("Knight"))
		{
			setKnightClass();
			System.out.println("Base HP Knight" + totalHealth);
		}
		
		else if(jobs.equals("Thief"))
		{
			setThiefClass();
		}
		
		else if(jobs.equals("Wizard"))
		{
			setWizardClass();
		}
		
	}
	
	
	/*
	 * These are the methods that will solely be dedicated to setting up the class of the character
	 * this will set each stat for the class
	 * There's 3 methods for 3 classes
	 */
	public void setKnightClass()
	{
		setStrength(10);
		setDexterity(5);
		setIntellect(1);
		setHealth("Knight");
		job = "Knight";
	}
	
	public void setThiefClass()
	{
		setStrength(5);
		setDexterity(10);
		setIntellect(1);
		setHealth("Thief");
		job = "Thief";
	}
	
	public void setWizardClass()
	{
		setStrength(1);
		setDexterity(5);
		setIntellect(10);
		setHealth("Wizard");
		job = "Wizard";
	}
	
	//This method, if called, will return what class the player is
	//This may be useful later for class specific skills
	public String getJob()
	{
		return job;
	}
		
//	All setStat methods are used for setting up the class initial stats.
//	All getStat methods are used to return the amount of a specific stat, this will
//	most likely be changed to instead of returning a base stat, it will return the current amount
//	
//	Strength Methods
	public void setStrength(int strength)
	{
		baseStr = strength;
	}
	
	public void setAdditionalStrength(int leveledStrength)
	{
		addedStrength =+ leveledStrength;
	}
	
	public int getStrength()
	{
		return baseStr;
	}
	
	public int getAdditionalStrength()
	{
		return addedStrength;
	}
	
	
	//Dexterity Methods
	public void setDexterity(int dexterity)
	{
		baseDex = dexterity;
	}
	
	public int getDexterity()
	{
		return baseDex;
	}
	
	
	//Intellect Methods
	public void setIntellect(int intellect)
	{
		baseInt = intellect;
	}
	
	public int getIntellect()
	{
		return baseInt;
	}
	
	//Vitality Methods
	public void setVitality(int vitality)
	{
		baseVit = vitality;
	}
	
	public void setAdditionalVitality(int vitality)
	{
		addedVitality =+ vitality;
	}
	
	public int getAdditionalVitality()
	{
		return addedVitality;
	}
	
	//Health
	public void setHealth(Object job)
	{
		if(job.equals("Knight"))
		{
			totalHealth = ((BASEHPKNIGHT*level) + (addedVitality*6));
		}
		
		else if(job.equals("Thief"))
		{
			totalHealth = (BASEHPTHIEF*level) + (addedVitality*6);
		}
		
		else if(job.equals("Wizard"))
		{
			totalHealth = (BASEHPWIZARD*level) + (addedVitality*6);
		}
	}
	
	public int getHealth()
	{
		return totalHealth;
	}
	
	//Damage Methods *will be updated further with items
	public void setPhysicalDamage(Object job)
	{
		if(job.equals("Knight"))
		{
			totalPhysicalDamage = (weaponPhysicalDamage + (totalStrength*4));
		}
		else if(job.equals("Thief"))
		{
			totalPhysicalDamage = (weaponPhysicalDamage + (totalStrength*4));
		}
		else if(job.equals("Wizard"))
		{
			totalPhysicalDamage = (weaponPhysicalDamage + (totalStrength*4));
		}
	}
	
	public void setMagicDamage(Object job)
	{
		if(job.equals("Knight"))
		{
			totalMagicDamage = (weaponMagicDamage + (totalIntellect*2));
		}
		else if(job.equals("Thief"))
		{
			totalMagicDamage = (weaponMagicDamage + (totalIntellect*2));
		}
		else if(job.equals("Wizard"))
		{
			totalMagicDamage = (weaponMagicDamage + (totalIntellect*2));
		}
	}
	

	
	
	
	
}
