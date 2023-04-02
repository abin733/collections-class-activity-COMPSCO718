public class Movie implements Comparable<Movie> {
    private String name;
    private int year;

    public Movie(String name, int year){
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        int difference = this.year - o.year;
        if (difference>0) {
            return -1;
        }
        else if (difference<0) {
            return 1;
        } else
            return this.getName().compareTo(o.getName()) ;
    }
}
