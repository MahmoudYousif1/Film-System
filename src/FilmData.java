package src;
import java.util.*;

/**
 * The FilmData class represents the data of a film.
 */
public class FilmData {

    protected String Title; // The title of the film.
    protected String Description; // The description of the film.
    protected String Director; // The director of the film.
    protected String ProductionCompany; // The production company of the film.
    protected String Rating; // The rating of the film.
    protected int Duration; // The duration of the film.
    protected int ReleasedYear; // The year when the film was released.
    protected double Budget; // The budget of the film.
    protected double BoxOfficeRevenue; // The box office revenue of the film.
    protected List<ActorData> ActorList = new ArrayList<>(); // The list of actors in the film.
    protected List<FilmThemes> ThemeList = new ArrayList<>(); // The list of themes in the film.
    protected List<SoundTracks> SoundTrackList = new ArrayList<>(); // The list of soundtracks in the film.
    protected List<AwardsReceived> AwardsList = new ArrayList<>(); // The list of awards received by the film.

    /**
     * Constructs a new FilmData instance with default values.
     */
    public FilmData() {

        this.Title = "untitled";
        this.Description = "";
        this.Director = "";
        this.ProductionCompany = "";
        this.Rating = "";
        this.Duration = 0;
        this.ReleasedYear = 0;
        this.Budget = 0;
        this.BoxOfficeRevenue = 0;
        this.ActorList = new ArrayList<>();
        this.ThemeList = new ArrayList<>();
        this.SoundTrackList = new ArrayList<>();
        this.AwardsList = new ArrayList<>();

    }

    /**
     * Constructs a new FilmData instance with specified values.
     * 
     * @param Title             The title of the film.
     * @param Description       The description of the film.
     * @param Director          The director of the film.
     * @param ProductionCompany The production company of the film.
     * @param Rating            The rating of the film.
     * @param Duration          The duration of the film.
     * @param ReleasedYear      The year when the film was released.
     * @param Budget            The budget of the film.
     * @param BoxOfficeRevenue  The box office revenue of the film.
     * @param ActorList         The list of actors in the film.
     * @param ThemeList         The list of themes in the film.
     * @param SoundTrackList    The list of soundtracks in the film.
     * @param AwardsList        The list of awards received by the film.
     */
    public FilmData(String Title, String Description, String Rating, int Duration, int ReleasedYear,
            List<ActorData> ActorList) {

        this.Title = Title;
        this.Description = Description;
        this.Duration = Duration;
        this.Rating = Rating + " / 10";
        this.ReleasedYear = ReleasedYear;
        this.ActorList = ActorList;
    }

    /**
     * Constructs a new FilmData instance with specified values.
     * 
     * @param Title             The title of the film.
     * @param Description       The description of the film.
     * @param Director          The director of the film.
     * @param ProductionCompany The production company of the film.
     * @param Duration          The duration of the film.
     * @param ReleasedYear      The year when the film was released.
     * @param Budget            The budget of the film.
     * @param BoxOfficeRevenue  The box office revenue of the film.
     * @param ActorList         The list of actors in the film.
     * @param ThemeList         The list of themes in the film.
     * @param SoundTrackList    The list of soundtracks in the film.
     * @param AwardsList        The list of awards received by the film.
     */
    public FilmData(String Title, String Description, String Director, String ProductionCompany,
            int Duration, int ReleasedYear, int Budget, int BoxOfficeRevenue, List<ActorData> ActorList,
            List<FilmThemes> ThemeList, List<SoundTracks> SoundTrackList, List<AwardsReceived> AwardsList) {

        this.Title = Title;
        this.Description = Description;
        this.Director = Director;
        this.ProductionCompany = ProductionCompany;
        this.Duration = Duration;
        this.ReleasedYear = ReleasedYear;
        this.Budget = Budget;
        this.BoxOfficeRevenue = BoxOfficeRevenue;
        this.ActorList = ActorList;
        this.ThemeList = ThemeList;
        this.SoundTrackList = SoundTrackList;
        this.AwardsList = AwardsList;

    }

    /**
     * Get the title of the film.
     * 
     * @return The title of the film.
     */
    public String getTitle() {
        return Title;
    }

    /**
     * Set the title of the film.
     * 
     * @param title The title of the film.
     */
    public void setTitle(String title) {
        Title = title;
    }

    /**
     * Get the description of the film.
     * 
     * @return The description of the film.
     */
    public String getDescription() {
        return Description;
    }

    /**
     * Set the description of the film.
     * 
     * @param description The description of the film.
     */
    public void setDescription(String description) {
        Description = description;
    }

    /**
     * Get the director of the film.
     * 
     * @return The director of the film.
     */
    public String getDirector() {
        return Director;
    }

    /**
     * Set the director of the film.
     * 
     * @param director The director of the film.
     */
    public void setDirector(String director) {
        Director = director;
    }

    /**
     * Get the production company of the film.
     * 
     * @return The production company of the film.
     */
    public String getProductionCompany() {
        return ProductionCompany;
    }

    /**
     * Set the production company of the film.
     * 
     * @param productionCompany The production company of the film.
     */
    public void setProductionCompany(String productionCompany) {
        ProductionCompany = productionCompany;
    }

    /**
     * Get the duration of the film.
     * 
     * @return The duration of the film.
     */
    public int getDuration() {
        return Duration;
    }

    /**
     * Set the duration of the film.
     * 
     * @param duration The duration of the film.
     */
    public void setDuration(int duration) {
        Duration = duration;
    }

    /**
     * Get the rating of the film.
     * 
     * @return The rating of the film.
     */
    public String getRating() {
        return Rating;
    }

    /**
     * Set the rating of the film.
     * 
     * @param rating The rating of the film.
     */
    public void setRating(String rating) {
        Rating = rating;
    }

    /**
     * Get the year when the film was released.
     * 
     * @return The year when the film was released.
     */
    public int getReleasedYear() {
        return ReleasedYear;
    }

    /**
     * Set the year when the film was released.
     * 
     * @param releasedYear The year when the film was released.
     */
    public void setReleasedYear(int releasedYear) {
        ReleasedYear = releasedYear;
    }

    /**
     * Get the budget of the film.
     * 
     * @return The budget of the film.
     */
    public double getBudget() {
        return Budget;
    }

    /**
     * Set the budget of the film.
     * 
     * @param budget The budget of the film.
     */
    public void setBudget(double budget) {
        Budget = budget;
    }

    /**
     * Get the box office revenue of the film.
     * 
     * @return The box office revenue of the film.
     */
    public double getBoxOfficeRevenue() {
        return BoxOfficeRevenue;
    }

    /**
     * Set the box office revenue of the film.
     * 
     * @param boxOfficeRevenue The box office revenue of the film.
     */
    public void setBoxOfficeRevenue(double boxOfficeRevenue) {
        BoxOfficeRevenue = boxOfficeRevenue;
    }

    /**
     * Get the list of actors in the film.
     * 
     * @return The list of actors in the film.
     */
    public List<ActorData> getActorList() {
        return ActorList;
    }

    /**
     * Set the list of actors in the film.
     * 
     * @param actorList The list of actors in the film.
     */
    public void setActorList(List<ActorData> actorList) {
        ActorList = actorList;
    }

    /**
     * Get the list of themes in the film.
     * 
     * @return The list of themes in the film.
     */
    public List<FilmThemes> getThemeList() {
        return ThemeList;
    }

    /**
     * Set the list of themes in the film.
     * 
     * @param themeList The list of themes in the film.
     */
    public void setThemeList(List<FilmThemes> themeList) {
        ThemeList = themeList;
    }

    /**
     * Get the list of soundtracks in the film.
     * 
     * @return The list of soundtracks in the film.
     */
    public List<SoundTracks> getSoundTrackList() {
        return SoundTrackList;
    }

    /**
     * Set the list of soundtracks in the film.
     * 
     * @param soundTrackList The list of soundtracks in the film.
     */
    public void setSoundTrackList(List<SoundTracks> soundTrackList) {
        SoundTrackList = soundTrackList;
    }

    /**
     * Get the list of awards received by the film.
     * 
     * @return The list of awards received by the film.
     */
    public List<AwardsReceived> getAwardsList() {
        return AwardsList;
    }

    /**
     * Set the list of awards received by the film.
     * 
     * @param awardsList The list of awards received by the film.
     */
    public void setAwardsList(List<AwardsReceived> awardsList) {
        AwardsList = awardsList;
    }

}
