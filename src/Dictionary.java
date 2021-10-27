/**
*The Dictionary program holds the
*main method and simulates what its like to sort
*a dictionary and add definitions to it
*
* @author  Lacey Cottner
* @version 1.0
* @since   2021-10-26
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {
	public static void main (String []args) {
ArrayList <String> words=new ArrayList<String> (); 
File text= new File("DictionaryWordValuePairs");
int a=0;

System.out.println("-------------------");
System.out.println("Added half of the unsorted list");
System.out.println("-------------------");
try {
	Scanner scan=new Scanner(text);
	
	while (a<220) {
	    String data = scan.nextLine();
	    {
	    		words.add(data);	
	    }
	    a++;	
	  }
		
		System.out.println(words);
		
		
		System.out.println("\n-------------------");
		System.out.println("Insertion Sort");
		System.out.println("-------------------");
		Methods.insertionSort2(words);
		System.out.println(words);
		
		System.out.println("\n-------------------");
		System.out.println("Adding remaining entries");
		System.out.println("-------------------");
		
		a=220;
		while (a<436) {
			 String data = scan.nextLine();
			for (int i=0; i<words.size(); i++) {
				if (words.get(i).compareTo(data)>0) {
					words.add(i, data);
					break;
				}
					
			}
			a++;
		}
		System.out.println(words);
		
		
	scan.close();
} catch (FileNotFoundException e) {
	System.out.println("An error occured");
	e.printStackTrace();
}


	}
}
