
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class CubeConundrum {
            // Define as restrições dos cubos
            int redLimit = 12;
            int greenLimit = 13;
            int blueLimit = 14;

            // Exemplo de entrada representando os jogos
            List<String> games = List.of(
                    "Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green",
                    "Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue",
                    "Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red",
                    "Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red",
                    "Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green"
            );

            // Inicializa a soma dos IDs para os jogos possíveis
            int sumOfIDs = 0;
            // Processa cada jogo
            for (String game : games) {
                if (isGamePossible(game, redLimit, greenLimit, blueLimit)) {
                    // Extrai o ID da string do jogo e adiciona à soma
                    int gameID = extractGameID(game);
                    sumOfIDs += gameID;
                }
            }

            // Imprime o resultado
            System.out.println("Soma dos IDs para jogos possíveis: " + sumOfIDs);


        // Verifica se um jogo é possível dadas as restrições dos cubos
        private static boolean isGamePossible(String game, int redLimit, int greenLimit, int blueLimit) {
            Scanner scanner = new Scanner(game);

            int redCount = 0;
            int greenCount = 0;
            int blueCount = 0;

            // Ignora a parte inicial "Game x:"
            scanner.next();

            // Processa cada token na linha do jogo
            while (scanner.hasNext()) {
                String token = scanner.next();
                if (token.equals("red")) {
                    redCount++;
                } else if (token.equals("green")) {
                    greenCount++;
                } else if (token.equals("blue")) {
                    blueCount++;
                }
            }

            // Verifica se as contagens estão dentro dos limites
            return redCount <= redLimit && greenCount <= greenLimit && blueCount <= blueLimit;
        }

        // Extrai o ID do jogo a partir da string
        private static int extractGameID(String game) {
            // Obtém a parte "Game x"
            String gameIDString = game.split(":")[0].trim().substring(5);
            return Integer.parseInt(gameIDString);
        }
}
