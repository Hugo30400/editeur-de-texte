package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parametersCheck(3, "Format attendu : remplacer;Debut;Fin;remplacement")) return;
        if(parametersNumbersCheck(parameters[1], parameters[2])) return;

        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);

        String remplacement = "";
        if (parameters.length > 3) remplacement = parameters[3];

        this.document.remplacer(debut, fin, remplacement);
        super.executer();
    }
}
