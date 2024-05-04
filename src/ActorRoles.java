package src;
import java.util.*;

/**
 * The ActorRoles class represents the roles played by an actor.
 */
class StartDate {

    private int startDay;
    private int startMonth;
    private int startYear;

    /**
     * Constructs a new StartDate instance with default values.
     */
    public StartDate() {
        this.startDay = 0;
        this.startMonth = 0;
        this.startYear = 0;
    }

    /**
     * Constructs a new StartDate instance with specified values.
     * 
     * @param startDay   The day when the role started.
     * @param startMonth The month when the role started.
     * @param startYear  The year when the role started.
     */
    public StartDate(int startDay, int startMonth, int startYear) {
        this.startDay = startDay;
        this.startMonth = startMonth;
        this.startYear = startYear;
    }

    /**
     * Get the day when the role started.
     * 
     * @return The day when the role started.
     */
    public int getStartDay() {
        return startDay;
    }

    /**
     * Set the day when the role started.
     * 
     * @param startDay The day when the role started.
     */
    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }

    /**
     * Get the month when the role started.
     * 
     * @return The month when the role started.
     */
    public int getStartMonth() {
        return startMonth;
    }

    /**
     * Set the month when the role started.
     * 
     * @param startMonth The month when the role started.
     */
    public void setStartMonth(int startMonth) {
        this.startMonth = startMonth;
    }

    /**
     * Get the year when the role started.
     * 
     * @return The year when the role started.
     */
    public int getStartYear() {
        return startYear;
    }

    /**
     * Set the year when the role started.
     * 
     * @param startYear The year when the role started.
     */
    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    /**
     * Returns a string representation of the start date.
     * 
     * @return A string representation of the start date.
     */
    public String toString() {
        return startDay + "/" + startMonth + "/" + startYear;
    }
}


/**
 * The EndDate class represents the end date of a role played by an actor.
 */
class EndDate {

    private int endDay;
    private int endMonth;
    private int endYear;

    /**
     * Constructs a new EndDate instance with default values.
     */
    public EndDate() {
        this.endDay = 0;
        this.endMonth = 0;
        this.endYear = 0;
    }

    /**
     * Constructs a new EndDate instance with specified values.
     * 
     * @param endDay   The day when the role ended.
     * @param endMonth The month when the role ended.
     * @param endYear  The year when the role ended.
     */
    public EndDate(int endDay, int endMonth, int endYear) {
        this.endDay = endDay;
        this.endMonth = endMonth;
        this.endYear = endYear;
    }

    /**
     * Get the day when the role ended.
     * 
     * @return The day when the role ended.
     */
    public int getEndDay() {
        return endDay;
    }
    
    /**
     * Set the day when the role ended.
     * 
     * @param endDay The day when the role ended.
     */
    public void setEndDay(int endDay) {
        this.endDay = endDay;
    }

    /**
     * Get the month when the role ended.
     * 
     * @return The month when the role ended.
     */
    public int getEndMonth() {
        return endMonth;
    }

    /**
     * Set the month when the role ended.
     * 
     * @param endMonth The month when the role ended.
     */
    public void setEndMonth(int endMonth) {
        this.endMonth = endMonth;
    }

    /**
     * Get the year when the role ended.
     * 
     * @return The year when the role ended.
     */
    public int getEndYear() {
        return endYear;
    }

    /**
     * Set the year when the role ended.
     * 
     * @param endYear The year when the role ended.
     */
    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    /**
     * Returns a string representation of the end date.
     * 
     * @return A string representation of the end date.
     */
    public String toString() {
        return endDay + "/" + endMonth + "/" + endYear;
    }

}

/**
 * The ActorRoles class represents the roles played by an actor.
 */
class ActorRoles {

    /* Variables */
    private String roleName;
    private String roleMovie;
    private int roleDuration;
    private List<StartDate> startDate = new ArrayList<>();
    private List<EndDate> endDate = new ArrayList<>();

    /**
     * Constructs a new ActorRoles instance with default values.
     */
    public ActorRoles() {
        this.roleName = "Untitled";
        this.roleMovie = "Untitled";
        this.roleDuration = 0;
        this.startDate = new ArrayList<>();
        this.endDate = new ArrayList<>();

    }

    /**
     * Constructs a new ActorRoles instance with specified values.
     * 
     * @param roleName     The name of the role.
     * @param roleMovie    The name of the movie where the role was played.
     * @param roleDuration The duration of the role.
     * @param startDate    The start date of the role.
     * @param endDate      The end date of the role.
     */
    public ActorRoles(String roleName, String roleMovie, int roleDuration, List<StartDate> startDate,
            List<EndDate> endDate) {
        this.roleName = roleName;
        this.roleMovie = roleMovie;
        this.roleDuration = roleDuration;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Get the name of the role.
     * 
     * @return The name of the role.
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Set the name of the role.
     * 
     * @param roleName The name of the role.
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * Get the name of the movie where the role was played.
     * 
     * @return The name of the movie.
     */
    public String getRoleMovie() {
        return roleMovie;
    }

    /**
     * Set the name of the movie where the role was played.
     * 
     * @param roleMovie The name of the movie.
     */
    public void setRoleMovie(String roleMovie) {
        this.roleMovie = roleMovie;
    }

    /**
     * Get the duration of the role.
     * 
     * @return The duration of the role.
     */
    public int getRoleDuration() {
        return roleDuration;
    }

    /**
     * Set the duration of the role.
     * 
     * @param roleDuration The duration of the role.
     */
    public void setRoleDuration(int roleDuration) {
        this.roleDuration = roleDuration;
    }

    /**
     * Get the start date of the role.
     * 
     * @return The start date of the role.
     */
    public List<StartDate> getStartDate() {
        return startDate;
    }

    /**
     * Set the start date of the role.
     * 
     * @param startDate The start date of the role.
     */
    public void setStartDate(List<StartDate> startDate) {
        this.startDate = startDate;
    }

    /**
     * Get the end date of the role.
     * 
     * @return The end date of the role.
     */
    public List<EndDate> getEndDate() {
        return endDate;
    }

    /**
     * Set the end date of the role.
     * 
     * @param endDate The end date of the role.
     */
    public void setEndDate(List<EndDate> endDate) {
        this.endDate = endDate;
    }

    /**
     * Add a start date to the role.
     * 
     * @param startDate The start date to be added.
     */
    public void add(StartDate startDate) {
        this.startDate.add(startDate);
    }

    /**
     * Add an end date to the role.
     * 
     * @param endDate The end date to be added.
     */
    public void add(EndDate endDate) {
        this.endDate.add(endDate);
    }

    /**
     * Check if the role is ongoing.
     * 
     * @return True if the role is ongoing, false otherwise.
     */
    public Boolean isRoleOngoing() {
        return endDate.isEmpty();
    }


    /**
     * Check if the role is finished.
     * 
     * @return True if the role is finished, false otherwise.
     */
    public Boolean isRoleFinished() {
        return !endDate.isEmpty();
    }


    /**
     * Calculate the duration of the role.
     * 
     * @return The duration of the role.
     */
    public int calculateRoleDuration() {
        if (isRoleOngoing()) {
            return 0;
        } else {
            return endDate.get(0).getEndYear() - startDate.get(0).getStartYear();
        }
    }

    /**
     * Returns a string representation of the actor role.
     * 
     * @return A string containing the role name, movie, duration, start date, and end date.
     */
    public String toString() {
        return "Role Name: " + roleName + "\n" + "Movie: " + roleMovie + "\n" + "Duration: " + roleDuration + "\n"
                + "Start Date: " + startDate + "\n" + "End Date: " + endDate;
    }

}
