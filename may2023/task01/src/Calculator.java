
import java.util.*;
import java.io.*;


public class Calculator{
    public static void main(String[] args) {
        System.out.println("Welcome to calculator");
        Console console = System.console();
        String keyboardInput = console.readLine("Enter new Query");

        Double $last = null;
        while (!(keyboardInput.equals("exit"))){
            String[] inputList = keyboardInput.split(" ");

            for (int i = 0; i<inputList.length; i++ ){
                if (inputList[i].equals("$last")){
                    if ($last != null){
                        inputList[i] = $last.toString();
                    }
                    else{
                        System.out.println("This is your first calculation. No $last saved");
                        continue;
                    }
                }
            }

            
            Double result = 0.0;
            
            if (inputList.length != 3){
                System.out.println("Wrong format of input");
            }
            
            else if (inputList[1].equals("+")){
                result = Double.parseDouble(inputList[0]) + Double.parseDouble(inputList[2]);
                $last = result;  
            }

            else if(inputList[1].equals("-")){
                result = Double.parseDouble(inputList[0]) - Double.parseDouble(inputList[2]);
                $last = result; 
            }
            else if(inputList[1].equals("*")){
                result = Double.parseDouble(inputList[0]) * Double.parseDouble(inputList[2]);
                $last = result; 
            }
            else if(inputList[1].equals("/")){
                result = Double.parseDouble(inputList[0]) / Double.parseDouble(inputList[2]);
                $last = result; 
            }
            else{
                System.out.println("Invalid Input");
            }

            System.out.println(result);2
            
            //end
            keyboardInput = console.readLine();


        }
        
    }
}