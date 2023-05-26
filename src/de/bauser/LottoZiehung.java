package de.bauser;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

class LottoZiehung {

  private int[] ziehung = new int[6];
  ArrayList<Integer> arrayListeZiehung = new ArrayList<Integer>();
  
  	int[] gewinnzahlen() {
		Random zufallszahl = new Random();
	  
	    	for(int i=0; i<6; i++) {
	    		ziehung [i] = zufallszahl.nextInt(49) + 1;
	    		  	for(int j=0; j<i; j++) {
	    			if(ziehung[i] == ziehung[j]) {
	    				i=-1;
	    			}
	    		  	}
	    	}		        Arrays.sort(ziehung);
	    				    return ziehung;
	}
  	
	ArrayList<Integer> umwandelnVonZiehung () {
		 for(int i=0;i<ziehung.length;i++) {
	    	 arrayListeZiehung.add(ziehung[i]);        
	     }       return arrayListeZiehung;
	}	
	
	public int[] getZiehung() {
		return ziehung;
	}

	public void setZiehung(int[] ziehung) {
		this.ziehung = ziehung;
	}
	
	public ArrayList<Integer> getArrayListeZiehung() {
		return arrayListeZiehung;
	}

	public void setArrayListeZiehung(ArrayList<Integer> arrayListeZiehung) {
		this.arrayListeZiehung = arrayListeZiehung;
	}
}