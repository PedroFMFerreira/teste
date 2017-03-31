/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;
import java.util.Random;
/**
 *
 * @author User
 */
public class Git {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!!");
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        
        if(randomInt%2==0){
            System.out.println("Portugal");
        }
        else{
            System.out.println("Aveiro");
        }
    }
    
}
