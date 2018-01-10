package ex1;

import java.util.Date;

/**
 * @author Rémi FERREIRA
 *
 */
public class Entreprise {

	/**
	 * siret : iddentifiant de l'entreprise
	 * nom : nom de l'entreprise
	 * adresse : adresse de l'entreprise
	 * dateCreation : date de creation de l'entreprise
	 */
	public int siret;
	public String nom;
	public String adresse;
	public Date dateCreation;
	
	public static final int CAPITAL_MAX = 3_000_000;
	
	/**
	 * Affiche le statut de l'entreprise
	 */
	public void Afficher_statut(){
		
	}
	
}
