package sample.Database;

public class Const {
    public static final String UTILISATEURS_TABLE = "utilisateurs";
    public static final String COCKTAILS_TABLE = "cocktails";
    public static final String INGREDIENTS_TABLE = "ingredients";


    //region UTILISATEURS
    //Constantes nom des colonnes UTILISATEURS
    public static final String UTILISATEURS_UTILISATEURID = "utilisateurid";
    public static final String UTILISATEURS_NOM = "nom";
    public static final String UTILISATEURS_PRENOM = "prenom";
    public static final String UTILISATEURS_UTILISATEUR = "utilisateur";
    public static final String UTILISATEURS_MOTDEPASSE = "motdepasse";
    public static final String UTILISATEURS_LOCATION = "location";
    public static final String UTILISATEURS_GENRE = "genre";
    //endregion

    //region COCKTAILS
    //Constantes nom des colonnes COCKTAILS
    public static final String COCKTAILS_COCKTAILID = "cocktailid";
    public static final String COCKTAILS_LIBELLE = "libelle";
    public static final String COCKTAILS_DESCRIPTION = "description";
    public static final String COCKTAILS_IMAGE = "image";
    public static final String COCKTAILS_PROCEDURE = "procedure";
    public static final String COCKTAILS_DATECREATION = "datecreation";
    public static final String COCKTAILS_INGREDIENTID = "ingredientid";
    //endregion

    //region INGREDIENTS
    //Constantes nom des colonnes INGREDIENTS
    public static final String INGREDIENTS_INGREDIENTID = "ingredientid";
    public static final String INGREDIENTS_LIBELLE = "libelle";
    public static final String INGREDIENTS_TYPE = "type";
    public static final String INGREDIENTS_UNITE = "unite";
    //endregion
}
