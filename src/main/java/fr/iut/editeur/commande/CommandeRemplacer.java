package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        int longueurDeParametre = parameters.length;

        if(longueurDeParametre < 3) {
            System.err.println("Format attendu : remplacer;Debut;Fin;remplacement");
            return;
        }
        int debut;
        int fin;

        try {
            debut = Integer.parseInt(parameters[1]);
            fin = Integer.parseInt(parameters[2]);
        } catch (NumberFormatException e) {
            System.err.println("Format attendu : remplacer;Debut;Fin;remplacement"); return;
        }

        String remplacement = "";
        if (longueurDeParametre > 3) remplacement = parameters[3];

        this.document.remplacer(debut, fin, remplacement);
        super.executer();
    }
}
