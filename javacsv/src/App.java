import CSV_classes.FilmCSV;
import models.Film;

public class App {
    public static void main(String[] args) throws Exception {
        
        Film f1 = new Film("About Time", 10, false);

        FilmCSV.addFilm(f1);
        FilmCSV.addFilm(f1);

        FilmCSV.listFilm();
    }
}
