import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Blockbuster {
    public static void main(String[] args) {
        Blockbuster blockbuster = new Blockbuster();
        blockbuster.start();
    }



    private void start() {
        List<Movie> movies = createMovies();
        System.out.println("Movies without sorting");

        printMovies(movies);
        System.out.println();

        /* TODO: (a) Sort the movies by defining the natural ordering of the movie(i.e. implements the Comparable interface)
         *           Sort the movies in the order of the most recent to the oldest. If the movies are in the same year
         *           then sort them by the movie name in alphabetical order
         */



        System.out.println("Movies sorted by natural ordering");
        //TODO: Uncomment the following statement after you complete task (a)

        Collections.sort(movies);
        printMovies(movies);
        System.out.println();

        System.out.println("Shuffle movies list");
        Collections.shuffle(movies);
        printMovies(movies);
        System.out.println();

        /* TODO: (b) Sort the movies using the comparator
         *           Sort the movies in the order of the most recent to the oldest. If the movies are in the same year
         *           then sort them by the movie name in alphabetical order (Same as task a)
         */




        System.out.println("Movies sorted by comparator");
        //TODO: Uncomment the following statement after you complete task (b)
        //printMovies(movies);
    }

    private void printMovies(List<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    private List<Movie> createMovies(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Lion Key", 2019));
        movies.add(new Movie("Titanic", 1997));
        movies.add(new Movie("Avengers: Endgame", 2019));
        return  movies;
    }

}
