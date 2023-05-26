package de.bauser;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class LottoTipp {
	
  private int[] tipp = new int[6];
  ArrayList<Integer> arrayListeTipp = new ArrayList<Integer>();
	
    int[] eingebenTipp() {
		Scanner input = new Scanner(System.in);
	    	System.out.println("Bitte die Lottozahlen eingeben:");
			
	    	for(int i = 0; i<tipp.length; i++) {
	    		System.out.println("    " + Arrays.toString(tipp));
	    		  while(true) {
	    			  try {
	    				  String numberString = input.nextLine();
	    				  int number = Integer.parseInt(numberString);
					
	    				  if (number >=1 && number <= 49) {
	    					  tipp [i] = number;
	    					  break;
	    				  }
	    				  else { 
	    					  System.out.println(number + "\n!ungültige Zahl! ");
	    				  }
	    			  }   
	    			  catch (NumberFormatException nfe) {
	    				  System.out.println("!keine Zahl! ");
	    			  }
	    		  }
	    	} 		  		input.close();
						    Arrays.sort(tipp);
						    return tipp;
		}
    
    ArrayList<Integer> umwandelnVonTipp () {
		 for(int i=0;i<tipp.length;i++) {
	    	 arrayListeTipp.add(tipp[i]);        
	     }       return arrayListeTipp;
    }

	public int[] getTipp() {
		return tipp;
	}

	public void setTipp(int[] tipp) {
		this.tipp = tipp;
	}
	
	public ArrayList<Integer> getArrayListeTipp() {
		return arrayListeTipp;
	}
	public void setArrayListeTipp(ArrayList<Integer> arrayListeTipp) {
		this.arrayListeTipp = arrayListeTipp;
	}
}