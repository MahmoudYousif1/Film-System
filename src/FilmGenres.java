package src;

/**
 * The FilmGenres enum represents the genres of a film.
 */
public enum FilmGenres {
    ACTION,
    ADVENTURE,
    ANIMATION,
    COMEDY,
    CRIME,
    DRAMA,
    FANTASY,
    HISTORICAL,
    HORROR,
    MUSICAL,
    MYSTERY,
    ROMANCE,
    SCIENCE_FICTION,
    THRILLER,
    WAR,
    WESTERN;

    public FilmGenres getGenre(String genreName) {
        try {
            return FilmGenres.valueOf(genreName.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid genre: " + genreName);
        }
    }
}