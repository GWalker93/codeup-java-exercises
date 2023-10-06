package movies;

public class Movie {

    private String name;

    private String category;

    public Movie(String name, String category) {

        this.name = name;
        this.category = category;
    }

    public String getInfo() {
        return String.format("Name; %S - Categories: %s", name, category);
    }

    public static void main(String[] args){
        Movie newMovie = new Movie("Friday Night Lights", "Action");
        System.out.println(newMovie.getInfo());
    }

}
