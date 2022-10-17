import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {
    
		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    Scanner userInput = new Scanner(System.in);
    int numPressed = 0;
    
    for(int i = 0; i < 50; i++){
      arrayList.add(fileScanner.nextLine());
    }
    
    while(numPressed != 5){
      System.out.println("Press 1 to learn about salary.");
      System.out.println("Press 2 to learn about the job.");
      System.out.println("Press 3 to learn about demand.");
      System.out.println("Press 4 to view current students.");
      System.out.println("Press 5 to quit.");

      numPressed = userInput.nextInt();

      if(numPressed == 1){
        System.out.println("$98,345 average salary.");
      }else if(numPressed == 2){
        System.out.println("US News - 100 Best Jobs!");
      }else if(numPressed == 3){
        System.out.println("Top 10 Forbes In-Demand Jobs!");
      }else if(numPressed == 4){
        for(String Sn : arrayList){
          System.out.println(Sn);
        }
      }else{
        
      }
    }
    userInput.close();
	}
}