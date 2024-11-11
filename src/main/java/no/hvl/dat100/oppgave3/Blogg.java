package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggstabell;
	private int nestledig;

	public Blogg() {
		innleggstabell = new Innlegg[20];
		nestledig = 0;
	}

	public Blogg(int lengde) {
		innleggstabell = new Innlegg[lengde];
		nestledig = 0;
	}

	public int getAntall() {
		return nestledig;
	}
	
	public Innlegg[] getSamling() {
		
		return innleggstabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		for(int i = 0; i < nestledig; i++) {
			
			if(innleggstabell[i].erLik(innlegg)) {
				return i;
			}
		}
		
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		
		return finnInnlegg(innlegg) != -1;
		
		}

	public boolean ledigPlass() {
		
		boolean ledig = false;
		
		if(nestledig < innleggstabell.length) {
			ledig = true;
		}
		
		return ledig;	
	}
	
	public boolean leggTil(Innlegg innlegg) {

			for(int i = 0; i < nestledig; i++) {
				if(innleggstabell[i].getId() == innlegg.getId()) {
					return false;
				}
			}
			
			if (nestledig < innleggstabell.length) {
	            innleggstabell[nestledig] = innlegg;
	            nestledig++;
	            return true;
	        }
	        return false;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
        sb.append(nestledig).append("\n");

        for (int i = 0; i < nestledig; i++) {
        	if(innleggstabell[i] != null) {
            sb.append(innleggstabell[i].toString());
        	}
        }
        return sb.toString();
    }
	

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}