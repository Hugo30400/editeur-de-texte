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

    /**
     * Cette méthode sert à vérifier si la commande possède le bon nombre de paramètres attendus
     * @param nbParameters nombre de paramètres de la commande
     * @param errMessage le message d'erreur en cas d'erreur
     * @return true si le nombre de paramètres de la commande n'est pas le même que le nombre de paramètres attendus.
     *         Sinon renvoie false
     */
    public boolean parametersCheck(int nbParameters, String errMessage) {
        if (parameters.length < nbParameters) {
            System.err.println(errMessage);
            return true;
        }
        return false;
    }

    /**
     * Cette méthode sert à vérifier si les paramètres de la commande de type int ne sont pas d'un autre type
     * @param parametersNumber contient le ou les paramètres d'une commande qui doivent être des entiers, pour pouvoir
     *                         procéder à la vérification
     * @return false si parametersNumber contient que des entiers
     */
    public boolean parametersNumbersCheck(String... parametersNumber) {
        try {
            for (String number : parametersNumber) {
                int numberInt = Integer.parseInt(number);
            }
        } catch (NumberFormatException e) {
            System.err.println("L'un ou plusieurs des paramètres qui doivent être des chiffres ne le sont pas"); return true;
        }
        return false;
    }
}
