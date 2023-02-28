package MadLibs;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to MadLib.");
        System.out.println("\n||______________________________________________||");

        System.out.println("\nPlease enter a noun: ");
        String noun1 = sc.nextLine();

        System.out.println("\nPlease enter an adjective: ");
        String adj1 = sc.nextLine();

        System.out.println("\nPlease enter another adjective: ");
        String adj2 = sc.nextLine();

        System.out.println("\nPlease enter a verb: ");
        String verb = sc.nextLine();

        System.out.println("\nPlease enter another noun: ");
        String noun2 = sc.nextLine();

        System.out.println("\nThe " + noun2 + " looked " + adj1 + ". " + "Meanwhile, the " + noun1 + " " + verb + " because of the" + noun2 + " and appeared to be " + adj2 + ".");



    }
}
