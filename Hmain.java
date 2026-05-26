import java.util.Scanner;
import java.util.Random;

public class Hmain {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
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
                case 1 -> {
                    while (playerScore != 3 && npcScore != 3) {
                        int result = gameRound(playerChoice(), random.nextInt(3) + 1);
                        switch (result) {
                            case 1:
                                playerScore++;
                                System.out.println("Le joueur gagne ce round!");
                                break;
                            case 2:
                                npcScore++;
                                System.out.println("L'ordinateur gagne ce round!");
                                break;
                            default:
                                System.out.println("C'est une égalité!");
                        }
                        System.out.println("Score actuel Joueur: " + playerScore + " | Ordinateur: " + npcScore);
                    }
                    if (playerScore == 3) {
                        System.out.println("=== Le joueur remporte la partie! ===");
                    } else {
                        System.out.println("=== L'ordinateur remporte la partie! ===");
                    }
                    playerScore = 0;
                    npcScore = 0;
                }
                case 2 -> quitter = true;
                default -> System.out.println("Choix invalide.");
            }
        }

        System.out.println("=== FIN ===");
    }

    private static int playerChoice() {
        System.out.println("Choisissez: 1. Pierre  2. Papier  3. Ciseaux");
        System.out.print("Votre choix : ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    private static int gameRound(int playerChoice, int npcChoice) {
        String[] options = {"", "Pierre", "Papier", "Ciseaux"};
        System.out.println("Ordinateur a choisi: " + options[npcChoice]);

        if (playerChoice == npcChoice) return 0;     
        if ((playerChoice == 1 && npcChoice == 3) ||   
            (playerChoice == 2 && npcChoice == 1) ||   
            (playerChoice == 3 && npcChoice == 2)) {   
            return 1;
        }
        return 2; 
    }
}
