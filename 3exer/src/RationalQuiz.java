import java.util.Random;
import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;

public class RationalQuiz{

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int corecte = 0;
        int total = 0;

        for (int i = 0; i < 5; i++) {
            // Generăm două numere raționale aleatorii
            int numarator1 = random.nextInt(26);
            int numitor1 = random.nextInt(11);
            int numarator2 = random.nextInt(26);
            int numitor2 = random.nextInt(11);

            Rational r1 = new Rational(numarator1, numitor1);
            Rational r2 = new Rational(numarator2, numitor2);

            System.out.println("Numerele rationale sunt:");
            System.out.println("R1: " + r1);
            System.out.println("R2: " + r2);

            System.out.println("Ce operație doriți să efectuați?");
            System.out.println("1. Adunare");
            System.out.println("2. Scădere");
            System.out.println("3. Înmulțire");
            System.out.println("4. Împărțire");
            System.out.print("Răspuns: ");

            int optiune = scanner.nextInt();
            Rational rezultatAsteptat = null;
            String operatie = "";

            switch (optiune) {
                case 1:
                    rezultatAsteptat = r1.adunare(r2);
                    operatie = "adunare";
                    break;
                case 2:
                    rezultatAsteptat = r1.scadere(r2);
                    operatie = "scădere";
                    break;
                case 3:
                    rezultatAsteptat = r1.inmultire(r2);
                    operatie = "înmulțire";
                    break;
                case 4:
                    rezultatAsteptat = r1.impartire(r2);
                    operatie = "împărțire";
                    break;
                default:
                    System.out.println("Opțiune invalidă. Oprirea quizului.");
                    return;
            }

            System.out.print("Introduceți rezultatul pentru " + operatie + ": ");
            int numaratorRaspuns = scanner.nextInt();
            int numitorRaspuns = scanner.nextInt();
            Rational raspunsUtilizator = new Rational(numaratorRaspuns, numitorRaspuns);

            if (rezultatAsteptat.equals(raspunsUtilizator)) {
                System.out.println("Corect!");
                corecte++;
            } else {
                System.out.println("Greșit! Răspunsul corect este: " + rezultatAsteptat);
            }
            total++;
        }

        double procentCorecte = (double) corecte / total * 100;
        System.out.println("Quiz terminat. Procentul de răspunsuri corecte: " + procentCorecte + "%");
    }
}

