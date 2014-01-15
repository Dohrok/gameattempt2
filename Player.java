
public class Player
{
        
        
        /*Here we will initiate every variable that will need to hold a value
         * This will include every single stat, total and base as well as defensive stats
         *  including evasion armor, mana, hp, etc..
         */
        private String job;
        private int totalVit;
        private final int BASESTRENGTH= 20;
        private int baseDex;
        private final int BASEVITAlITY= 20;
        private final int BASEINTELECT= 20;
        private final int BASEEVASION= 20;
        private int baseHP;
        
        private int level= 1;
        private int addVitality= 0;
        
        private int baseHPKnight = 15;
        private int baseHPThief = 10;
        private int baseHPWizard = 10;
        private int baseArmor;
              
        
        /*
         * This is where we'll create a player object.
         * The current idea is that a player will be created with a specific class
         * The class will set the initial base stats.
         * Since there are only three classes, this reads in a string of the class, and runs the method to set stats
         */
        public Player(String job)
        {        
                if(job.equals("Knight"))
                {
                        setKnightClass();
                }
                
                if(job.equals("Thief"))
                {
                        setThiefClass();
                }
                
                if(job.equals("Wizard"))
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
               // setStrength(10);
               //setDexterity(5);
                setAdditionalVitality(2);
                job = "Knight";
        }
        
        public void setThiefClass()
        {
                //setStrength(5);
                //setDexterity(10);
                job = "Thief";
        }
        
        public void setWizardClass()
        {
                //setStrength(1);
               //setDexterity(5);
                job = "Wizard";
        }
        
        //This method, if called, will return what class the player is
        //This may be useful later for class specific skills
        public String getJob()
        {
                return job;
        }
        
        public void setAdditionalVitality(int vitality)
        {
                addVitality=+ vitality;
        }
        
        public int getAdditionalVitality()
        {
               return addVitality;
        }
        
        public int calculateHealth(int level, int BASEVITALITY, int addVitality)
        {
               
               return (level*BASEVITALITY*(addVitality*14));
               //WoW uses 14HP per 1 vitality after base vit, just something to go by
        }
                
        //All setStat methods are used for setting up the class initial stats.
        //All getStat methods are used to return the amount of a specific stat, this will
        //most likely be changed to instead of returning a base stat, it will return the current amount
        
        /*
        public void setStrength(int strength)
        {
                baseStr = strength;
        }
        
        public int getStrength()
        {
                return baseStr;
        }
        
        public void setDexterity(int dexterity)
        {
                baseDex = dexterity;
        }
        
        public int getDexterity()
        {
                return baseDex;
        }
        

        public void setHealth(int health)
        {
                if(job == "Knight")
                {
                        health = baseHPKnight + (totalVit*3);
                }
                
                if(job == "Thief")
                {
                        health = baseHPThief + (totalVit*3);
                }
                
                if(job == "Wizard")
                {
                        health = baseHPWizard + (totalVit*3);
                }
        }
        */
        
        
        
        
        
        
}
