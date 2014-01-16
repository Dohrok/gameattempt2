
public class Main
{

	public static void main(String[] args)
	{
		//Creating Players
		Player player1 = new Player("Knight");
		System.out.println(player1.getJob());
		System.out.println("Strength: " + player1.getStrength() + " --Expected Strength: 10");
		System.out.println("Dexterity: "+ player1.getDexterity() + " --Expected Dexterity: 5");
		System.out.println("Intellect: "+ player1.getIntellect() + " --Expected Intellect: 1");
		System.out.println("Health: "+ player1.getHealth() + " --Expected 25");
		
		Player player2 = new Player("Thief");
		System.out.println(player2.getJob());
		System.out.println("Strength: " + player2.getStrength() + " --Expected Strength: 5");
		System.out.println("Dexterity: "+ player2.getDexterity() + " --Expected Dexterity: 10");
		System.out.println("Intellect: "+ player2.getIntellect() + " --Expected Intellect: 1");
		System.out.println("Health: "+ player2.getHealth() + " --Expected 15");
		
		Player player3 = new Player("Wizard");
		System.out.println(player3.getJob());
		System.out.println("Strength: " + player3.getStrength() + " --Expected Strength: 1");
		System.out.println("Dexterity: "+ player3.getDexterity() + " --Expected Dexterity: 5");
		System.out.println("Intellect: "+ player3.getIntellect() + " --Expected Intellect: 10");
		System.out.println("Health: "+ player3.getHealth() + " --Expected 15");

		
	}

}
