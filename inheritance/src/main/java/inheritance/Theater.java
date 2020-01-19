package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    //instance variables
    String name;
    List<String> movies;

    //constructor function
    Theater (String name) {
        this.name = name;
        this.movies = new ArrayList<>();
    }

    //instance methods
    public void addMovie (String movie) {
        this.movies.add(movie);
    }

    public void removeMovie (String movie) {
        this.movies.remove(new String (movie));
    }
}
