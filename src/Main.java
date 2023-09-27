import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String party = "";

        System.out.println("What is your party affiliation? Democrat, Republican, or Independent? (D/R/I)");
        if (scanner.hasNextLine()) {
            party = scanner.nextLine();
            party = party.toLowerCase();

            if (party.equals("d")) {
                System.out.println("You get a democratic donkey!");
            } else if (party.equals("r")) {
                System.out.println("You get a republican elephant!");
            } else if (party.equals("i")) {
                System.out.println("You get an independent inguana!");
            } else {
                System.out.println("You get an other otter!");
            }
        }
    }
}