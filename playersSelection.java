public static String playersSelection(int selection){
    String object="";
    switch (selection){
        case 1:
            object="Pierre";
            break;
        case 2:
            object="Feuille";
            break;
        case 3:
            object="Ciseaux";
            break;
        default:
            System.out.println("Veuillez entrer un nombre entre 1 et 3");
    }
    return object;
}