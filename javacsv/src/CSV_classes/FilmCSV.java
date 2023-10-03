package CSV_classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import models.Film;

public class FilmCSV {

    private static String fileName = "./javacsv/data/Filmes.csv";

    public static void addFilm(Film film) {
        try {

            boolean isFileExists = new File(fileName).exists();

            FileWriter writer = new FileWriter(fileName, StandardCharsets.ISO_8859_1, true);

            if (!isFileExists) {
                writer.write("Name;Rating;Watching\n");
            }

            writer.write(film.getName() + ";" + film.getRating() + ";" + film.isWatching() + "\n");

            writer.flush();

            writer.close();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static ArrayList<Film> listFilm() {

        ArrayList<Film> filmList = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            boolean firstLine = true;

            while ((line = reader.readLine()) != null) {

                if (firstLine) {
                    firstLine = false;
                    continue;
                }

                String[] splitColumns = line.split(";");

                String name = splitColumns[0];
                double rating = Double.parseDouble(splitColumns[1]);
                boolean watching = Boolean.parseBoolean(splitColumns[2]);

                Film f = new Film(name, rating, watching);

                filmList.add(f);

                System.out.println("Name: " + name + " - Rating: " + rating + " - Watching: " + watching);
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return filmList;
    }
}
