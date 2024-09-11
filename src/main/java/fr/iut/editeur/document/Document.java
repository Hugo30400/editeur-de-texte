package fr.iut.editeur.document;

/**
 * Cette classe sert à créer un objet Document contenant du texte
 */
public class Document {

    /**
     *  Variable qui contient le texte d'un Document
     */
    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Ajouter à this le texte placé en paramètre
     * @param texte contient le texte à ajouter
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Remplace la section choisie de @this par @remplacement
     * @param debut index de début de la section à remplacer
     * @param fin index de fin de la section à remplacer
     * @param remplacement texte de la section remplacée
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    /**
     * Met en majuscule la section choisie de @this
     * @param debut index de début de la section à mettre en majuscule
     * @param fin index de fin de la section à mettre en majuscule
     */
    public void majuscules(int debut, int fin) {
        String enMajuscule = texte.substring(debut, fin + 1);
        remplacer(debut, fin, enMajuscule.toUpperCase());
    }

    /**
     * Efface la section choisie de this
     * @param debut index de début de la section à effacer
     * @param fin index de fin de la section à effacer
     */
    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
