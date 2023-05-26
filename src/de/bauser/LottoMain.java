package de.bauser;
import java.util.Arrays;

public class LottoMain {
	
  public static void main(String[] args) {
	long l= 0;
	
	LottoTipp lottoTippHeute = new LottoTipp();
	  lottoTippHeute.eingebenTipp();
	      System.out.println("\nIhr Lottotipp (6 aus 49): " + Arrays.toString(lottoTippHeute.getTipp()));
	
	LottoZiehung lottoZiehungHeute = new LottoZiehung();
	  lottoZiehungHeute.gewinnzahlen();
	      System.out.println("\nDie Gewinnzahlen lauten : " + Arrays.toString(lottoZiehungHeute.getZiehung()));
	    
	lottoTippHeute.umwandelnVonTipp();   
	lottoZiehungHeute.umwandelnVonZiehung();
	
	    lottoTippHeute.getArrayListeTipp().retainAll(lottoZiehungHeute.getArrayListeZiehung());
	        System.out.println("\nRichtige Gewinnzahlen   : " + lottoTippHeute.getArrayListeTipp());

	          if (lottoTippHeute.getTipp().equals(lottoZiehungHeute.getZiehung())) {
	        	  System.out.println("\n         Sechs Richtige!");
	          }
	              do {
	            	  l++; lottoZiehungHeute.setZiehung(lottoZiehungHeute.gewinnzahlen());
	              } while( Arrays.equals(lottoTippHeute.getTipp(), lottoZiehungHeute.getZiehung())==false );
	      	  		    System.out.format("\nSechs Richtige nach gerade mal %d weiteren Ziehungen.", l);
  }
}