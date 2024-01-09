package exclude;

import mainPackage.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Richiedo all'user di definire la zona

        System.out.print("Inserire Zona: ");
        String zona = scanner.nextLine();

        // Richiedo all'user di definire il costo orario

        System.out.print("Inserire costo orario: ");
        double costoOrario = scanner.nextDouble();

        // Passo i parametri definiti dall'user al costruttore della classe Tariffa
        // per instanziare un nuovo oggetto "tariffa".

        Tariffa tariffa = new Tariffa(zona, costoOrario);

        // Passo l'oggetto tariffa al costruttore della classe Parcometro
        // per istanziare un nuovo oggetto "mainPackage".

        Parcometro parcometro = new Parcometro(tariffa);

        // Richiedo all'user di definire il numero di ore di sosta.

        System.out.print("Inserire numero ore di sosta: ");

        // Istanzio un nuovo oggetto "ticket" passando come parametro il numero di ore di sosta.
        //

        int ore = scanner.nextInt();

        Ticket ticket = parcometro.emettiTicket(ore);

        System.out.println(ticket);

    }
}