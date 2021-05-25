import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class dayOne{
    public static void main(String[] beees){
        int[] data = new int[200];
        try{
        File fileObj = new File("R:/_Code/25daysofcode/1/input.txt");
        Scanner scanner = new Scanner(fileObj);
        for(int i = 0; scanner.hasNextLine(); i++){
            String strin = scanner.nextLine();
            data[i] = Integer.parseInt(strin);
        }
        scanner.close();
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
        //The above block of code reads the file into an int array
        
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i1 = 0; i1 < data.length; i1++){
            a = data[i1];
            for(int i2 = 0; i2 < data.length; i2++){
                b = data[i2];
                for(int i3 = 0; i3 < data.length; i3++){
                c = data[i3];
                    if(a+b+c == 2020){
                    System.out.println(a*b*c);
                }
            }
        }
    }
        
    }
    
}