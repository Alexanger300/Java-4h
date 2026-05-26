import java.util.Scanner;
import java.util.Random;

public class Hmain {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

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
                case 1 -> {
                    while (playerScore < 3 && npcScore < 3) {
                        int result = gameRound(playerChoice(), random.nextInt(3) + 1);
                        switch (result) {
                            case 1 -> {
                                playerScore++;
                                System.out.println("Le joueur gagne ce round !");
                            }
                            case 2 -> {
                                npcScore++;
                                System.out.println("L'ordinateur gagne ce round !");
                            }
                            default -> System.out.println("Égalité !");
                        }
                        System.out.println("Score — Joueur: " + playerScore + " | Ordi: " + npcScore);
                    }
                    System.out.println("=== FIN : " + (playerScore == 3 ? "Joueur gagne !" : "Ordi gagne !") + " ===");
                    playerScore = 0;
                    npcScore = 0; // reset pour rejouer
                }
                case 2 -> quitter = true;
                default -> System.out.println("Choix invalide.");
            }
        }
    }

}

