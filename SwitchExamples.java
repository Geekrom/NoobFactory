import java.util.*;

public class SwitchExamples
{
  public static void main(String[] args){
      int randNum0 = 0, randNum1 = 55;
      
      Random rand = new Random();
      rand.setSeed(System.currentTimeMillis());
      randNum0 = rand.nextInt(10) ;
      String letter = "";
      //System.out.println(randNum0);
      
      switch(randNum0){
        case 0:
        System.out.println("Case 0");
        break;
         case 1:
        System.out.println("Case 1");
        break;
         case 2:
        System.out.println("Case 2");
        break;
         case 3:
        System.out.println("Case 3");
        break;
         case 4:
        System.out.println("Case 4");
        break;
         case 5:
        System.out.println("Case 5");
        break;
        default:
        System.out.printf("What are you doing?\nThe number %d is not valid!" , randNum0 );
        break;
        
        
        }
    
    
    }
}
