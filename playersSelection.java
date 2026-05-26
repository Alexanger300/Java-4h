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
    }
    return object;
}