package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		filnavn = "blogg.dat";
		mappe = "src.no.hvl.dat100.tests";
		
		String filer = mappe + "." + filnavn;
		
		try(PrintWriter skriver = new PrintWriter(filer);) {
			
			skriver.print(samling.toString());
			skriver.close();
			return true;
		}
		catch(FileNotFoundException e) {
			return false;
		}
	}
}
