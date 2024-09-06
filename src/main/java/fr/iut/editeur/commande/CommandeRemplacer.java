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

        String remplacement = "";
        if (parameters.length > 3) remplacement = parameters[3];

        this.document.remplacer(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]), remplacement);
        super.executer();
    }
}
