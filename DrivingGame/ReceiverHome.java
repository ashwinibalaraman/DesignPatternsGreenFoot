import greenfoot.*;

public class ReceiverHome extends ConcreteReceiver 
{
    
    public ReceiverHome()
    {
    }
    public void doAction(){
        if(Greenfoot.mouseClicked(getWorld().getObjects(HomeButton.class).get(0))){
             World welcomeworld = new WelcomeWorld();
             Greenfoot.setWorld(welcomeworld);
                        
        }
    }
   
    
}
