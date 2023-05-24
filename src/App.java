import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Legislador diputado1 = new Diputado("Juan", 45, "Buenos Aires");
        Legislador senador1 = new Senador("María", 50, "Córdoba");

        List<Legislador> legisladores = new ArrayList<>();
        legisladores.add(diputado1);
        legisladores.add(senador1);

        for (Legislador legislador : legisladores) {
            System.out.println(legislador.getNombre() + " trabaja en la cámara de " + legislador.getCamaraEnQueTrabaja());
        }
    }
    }
}
