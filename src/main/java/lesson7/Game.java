package lesson7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game {

            enum GameType{
                SOCCER,
                HOCKEY,
                RUGBY
            }

    public static void writeNumOfPlayersPerTeam (GameType game){
                switch (game){
                    case SOCCER:
                        createAndWriteToFile(String.valueOf(game), "11");
                        break;
                    case HOCKEY:
                        createAndWriteToFile(String.valueOf(game), "6");
                        break;
                    case RUGBY:
                        createAndWriteToFile(String.valueOf(game), "15");
                        break;
                    default:
                        System.out.println("I don't know this game");
                }
        }

        public static void createAndWriteToFile (String fileName, String numOfPlayers){
            File file = new File(fileName);
            try {
                file.createNewFile();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
                    try (FileWriter fileWriter = new FileWriter(fileName)) {
                        fileWriter.write(numOfPlayers);
                    }
                 catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }}
