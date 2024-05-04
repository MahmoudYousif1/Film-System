package src;
import java.util.EnumSet;

/**
 * The FilmThemes class represents the themes of a film.
 */
public enum FilmThemes {

    // The themes of a film.
    LOVE_ROMANCE(FilmGenres.ROMANCE),
    FRIENDSHIP_COMEDY(FilmGenres.COMEDY),
    COURAGE_ADVENTURE(FilmGenres.ACTION, FilmGenres.ADVENTURE),
    FAMILY_DRAMA(FilmGenres.DRAMA),
    HEROISM_ACTION(FilmGenres.ACTION),
    SUSPENSE_THRILLER(FilmGenres.THRILLER),
    HORROR(FilmGenres.HORROR),
    MYSTERY(FilmGenres.MYSTERY),
    SCIENCE_FICTION(FilmGenres.SCIENCE_FICTION),
    HISTORICAL(FilmGenres.HISTORICAL),
    MUSIC_MUSICAL(FilmGenres.MUSICAL),
    CRIME(FilmGenres.CRIME),
    FANTASY(FilmGenres.FANTASY),
    WAR(FilmGenres.WAR),
    ANIMATION(FilmGenres.ANIMATION),
    WESTERN(FilmGenres.WESTERN);

    // The genres of the themes.
    private final EnumSet<FilmGenres> genres;

    /**
     * Constructs a new FilmThemes instance with specified values.
     * 
     * @param genres The genres of the themes.
     */
    FilmThemes(FilmGenres... genres) {
        this.genres = EnumSet.noneOf(FilmGenres.class);
        for (FilmGenres genre : genres) {
            this.genres.add(genre);
        }
    }

    /**
     * Get the genres of the themes.
     * 
     * @return The genres of the themes.
     */
    public EnumSet<FilmGenres> getGenres() {
        return genres;
    }

    public static FilmThemes getTheme(String themeName) {
        try {
            return FilmThemes.valueOf(themeName.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid theme: " + themeName);
        }
    }

}