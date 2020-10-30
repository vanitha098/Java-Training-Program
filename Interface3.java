import java.io.*; 
interface Vehicle { 
    void changeGear(int a); 
    void speedUp(int a); 
    void applyBrakes(int a); 
} 
class Bicycle implements Vehicle{ 
      
    int speed; 
    int gear; 
    public void changeGear(int newGear){ 
        gear = newGear; 
   }
    public void speedUp(int increment){       
        speed = speed + increment; 
    }
    public void applyBrakes(int decrement){
        speed = speed - decrement; 
    } 
    public void printStates() { 
         System.out.println("speed: " + speed + " gear: " + gear); 
    } 
} 
  
class Bike implements Vehicle { 
      
    int speed; 
    int gear; 
    public void changeGear(int newGear){ 
        gear = newGear; 
    } 
    public void speedUp(int increment){ 
        speed = speed + increment; 
    } 
    public void applyBrakes(int decrement){     
        speed = speed - decrement; 
    } 
    public void printStates() { 
         System.out.println("speed:"+ speed + " gear: " + gear); 
    } 
      
} 
public class Interface3 { 
      
    public static void main (String[] args) { 
        Bicycle b = new Bicycle(); 
        b.changeGear(2); 
        b.speedUp(3); 
       	b.applyBrakes(1); 
        System.out.println("Bicycle present state :"); 
        b.printStates(); 
 
        Bike bike = new Bike(); 
        bike.changeGear(1); 
        bike.speedUp(4); 
        bike.applyBrakes(3); 
          
        System.out.println("Bike present state :"); 
        bike.printStates(); 
    } 
} 