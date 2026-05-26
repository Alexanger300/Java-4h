public class 4Hmain {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        int playerScore = 0;
        int npcScore = 0;


        boolean quitter = false;

        while (!quitter) {
            System.out.println("\n=== Pierre, Papier, Ciseaux ===");
            System.out.println("1. Jouer");
            System.out.println("2. Quitter");
            System.out.print("Choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1 -> GameRound();
                case 2 -> quitter = true;
                default -> System.out.println("Choix invalide.");
            }
        }
    
        while ( playerScore!=3 && npcScore!=3) {
            switch (gameRound(playerChoice(), random.nextInt(3)+1)) {
                case 1:
                    playerScore++;
                    System.out.println("Le joueur gagne ce round!");
                    break;
                case -1:
                    npcScore++;
                    System.out.println("L'ordinateur gagne ce round!");
                    break;
                default:
                    System.out.println("C'est une égalité!");
            }
            System.out.println("Score actuel Joueur: " + playerScore + " | Ordinateur: " + npcScore);
        }

        System.out.println("=== FIN ===");
    }

}

