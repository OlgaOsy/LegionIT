package lesson7;

public class MainGame {

    public static void main(String[] args) {
        Game.GameType game = Game.GameType.HOCKEY;
        String fileName = game.toString()+".txt";
        Game.createAndWriteToFile(String.valueOf(fileName), "15");
    }
}
