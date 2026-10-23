import java.util.Scanner;

public class Main {

    public static void main(){

        double kaffePris = 25.0;
        double kanelbullePris = 30.0;
        double smorgasPris = 55.0;
        double momsSkatt = 0.12;


        Scanner scanner = new Scanner(System.in);

        String welcome = "Välkommen till lyxloungen Java";
        System.out.println(welcome);

        System.out.print("Vad heter du?: ");
        String namn = scanner.nextLine();

        System.out.print("Hur många koppar kaffe ska du ha? (Kostar 25kr/st): " );
        int nrKaffe = scanner.nextInt();

        System.out.print("Hur många kanelbullar vill du ha? (Kostar 30kr/st): ");
        int nrKanelbulle = scanner.nextInt();

        System.out.print("Hur många smörgåsar vill du ha? (Kostar 55kr/st): " );
        int nrSmorgas = scanner.nextInt();

    scanner.close();
    }
}
