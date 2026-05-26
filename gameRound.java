public static int gameRound(Int playerChoice, int npcChoice) {
    int result;
    System.out.println("Votre choix est "+playerSelection(playerChoice)+"Le choix du bot est" +playerSelection(npcChoice));
    if (playerChoice==1&&npcChoice==3||playerChoice==2&&npcChoice==1||playerChoice==3&&npcChoice==2){
        System.out.println("Vous avez gagné cette round");
        result=1;
    } else if (playerChoice==npcChoice){
        System.out.println("C'est une égalité");
        result=0;
    } else {
        System.out.println("Vous avez perdu cette round");
        result=2;
    }
    return result;
}