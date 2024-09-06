package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscules extends CommandeDocument {

    public CommandeMajuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parametersCheck(3, "Format attendu : majuscules;Debut;Fin")) return;
        if(parametersNumbersCheck(parameters[1], parameters[2])) return;

        this.document.majuscules(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]));
        super.executer();
    }
}
