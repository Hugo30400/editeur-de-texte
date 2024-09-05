package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parametersCheck(3, "Format attendu : remplacer;Debut;Fin;remplacement")) return;
        int longueurDeParametre = parameters.length;

        int debut, fin;

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
