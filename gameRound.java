public static int gameRound(int playerChoice, int npcChoice) {
    int result;
    System.out.println(playerSelection(playerChoice)+playerSelection(npcChoice));
    if (playerChoice==1&&npcChoice==3||playerChoice==2&&npcChoice==1||playerChoice==3&&npcChoice==2){
        result=1;
    } else if (playerChoice==npcChoice){
        result=0;
    } else {
        result=2;
    }
    return result;
}