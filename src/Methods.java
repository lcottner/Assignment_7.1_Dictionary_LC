/**
*The Methods program holds algorithms that are needed
*to sort a dictionary
*
* @author  Lacey Cottner
* @version 1.0
* @since   2021-10-26
*/
import java.util.ArrayList;

public class Methods { 
	
	/**Sorts an arraylist using insertion sort
	@param ArrayList of Strings
	@returns nothing */
	public static void insertionSort2(ArrayList <String> B){
	  int i,j;
	  String key;
	  for (j = 1; j < B.size(); j++) {
	    key = B.get(j);
	    i = j - 1;
	    while (i >= 0) {
	      if (key.compareTo(B.get(i)) > 0) {
	        break;
	      }
	      B.set(i+1, B.get(i));
	      i--;
	    }
	    B.set(i+1, key);
	   
	  }
	}
 }

