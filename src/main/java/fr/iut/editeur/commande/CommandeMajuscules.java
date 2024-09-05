package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscules extends CommandeDocument {

    public CommandeMajuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parametersCheck(3, "Format attendu : majuscules;Debut;Fin")) return;

        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);

        this.document.majuscules(debut, fin);
        super.executer();
    }
}
