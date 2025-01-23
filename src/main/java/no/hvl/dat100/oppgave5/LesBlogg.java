package no.hvl.dat100.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";
	

	
	public static Blogg les(String mappe, String filnavn) {
		
		filnavn = "bloggkorrekt.dat";
		mappe = "src.no.hvl.dat100.tests";
		
		String filer = mappe + "." + filnavn;
		
		try(Scanner leser = new Scanner(filer)){
			
			
			while(leser.hasNext()) {
				if(leser.next() == TEKST) {
					TEKST = leser.next();
					System.out.println(TEKST);
				}
				if(leser.next() == BILDE) {
					BILDE = leser.next();
					System.out.println(BILDE);
					
				}
				leser.close();
				
				
			}
			
		}

	}
}
