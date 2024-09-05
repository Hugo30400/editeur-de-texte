package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public abstract class CommandeDocument implements Commande {

    protected Document document;

    protected String[]parameters;

    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }

    @Override
    public void executer() {
        System.out.println(this.document);
    }

    public boolean parametersCheck(int nbParameters, String errMessage) {
        if (parameters.length < nbParameters) {
            System.err.println(errMessage);
            return true;
        }
        return false;
    }
}
