package src;
import java.util.*;

/**
 * The ActorBirth class represents the birth date of an actor.
 */
class ActorBirth {

    int bornDay;
    int bornMonth;
    int bornYear;

    /**
     * Constructs a new ActorBirth object with default values (0 for all fields).
     */
    public ActorBirth() {
        this.bornDay = 0;
        this.bornMonth = 0;
        this.bornYear = 0;
    }

    /**
     * Constructs a new ActorBirth object with specified values for day, month, and
     * year.
     * 
     * @param bornDay   The day of birth.
     * @param bornMonth The month of birth.
     * @param bornYear  The year of birth.
     */
    public ActorBirth(int bornDay, int bornMonth, int bornYear) {
        this.bornDay = bornDay;
        this.bornMonth = bornMonth;
        this.bornYear = bornYear;
    }

    /**
     * Get the day of birth.
     * 
     * @return The day of birth.
     */
    public int getBornDay() {
        return bornDay;
    }

    /**
     * Set the day of birth.
     * 
     * @param bornDay The day of birth to set.
     */
    public void setBornDay(int bornDay) {
        this.bornDay = bornDay;
    }

    /**
     * Get the month of birth.
     * 
     * @return The month of birth.
     */
    public int getBornMonth() {
        return bornMonth;
    }

    /**
     * Set the month of birth.
     * 
     * @param bornMonth The month of birth to set.
     */
    public void setBornMonth(int bornMonth) {
        this.bornMonth = bornMonth;
    }

    /**
     * Get the year of birth.
     * 
     * @return The year of birth.
     */
    public int getBornYear() {
        return bornYear;
    }

    /**
     * Set the year of birth.
     * 
     * @param bornYear The year of birth to set.
     */
    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }
}

/**
 * The ActorDeath class represents the death date of an actor.
 */
class ActorDeath {

    int deathDay;
    int deathMonth;
    int deathYear;

    /**
     * Constructs a new ActorDeath object with default values (0 for all fields).
     */
    public ActorDeath() {
        this.deathDay = 0;
        this.deathMonth = 0;
        this.deathYear = 0;
    }

    /**
     * Constructs a new ActorDeath object with specified values for day, month, and
     * year.
     * 
     * @param deathDay   The day of death.
     * @param deathMonth The month of death.
     * @param deathYear  The year of death.
     */
    public ActorDeath(int deathDay, int deathMonth, int deathYear) {
        this.deathDay = deathDay;
        this.deathMonth = deathMonth;
        this.deathYear = deathYear;
    }

    /**
     * Get the day of death.
     * 
     * @return The day of death.
     */
    public int getDeathDay() {
        return deathDay;
    }

    /**
     * Set the day of death.
     * 
     * @param deathDay The day of death to set.
     */
    public void setDeathDay(int deathDay) {
        this.deathDay = deathDay;
    }

    /**
     * Get the month of death.
     * 
     * @return The month of death.
     */
    public int getDeathMonth() {
        return deathMonth;
    }

    /**
     * Set the month of death.
     * 
     * @param deathMonth The month of death to set.
     */
    public void setDeathMonth(int deathMonth) {
        this.deathMonth = deathMonth;
    }

    /**
     * Get the year of death.
     * 
     * @return The year of death.
     */
    public int getDeathYear() {
        return deathYear;
    }

    /**
     * Set the year of death.
     * 
     * @param deathYear The year of death to set.
     */
    public void setDeathYear(int deathYear) {
        this.deathYear = deathYear;
    }
}

/**
 * The ActorData class represents data about an actor.
 */
class ActorData {

    private String actorFirstName;
    private String actorLastName;
    private String gender;
    private int actorAge;
    private int careerLength;
    private int netWorth;
    private Boolean isAlive;
    private Boolean isDead;
    List<ActorBirth> actorBirth = new ArrayList<>();
    /** List of birth dates for the actor. */
    List<ActorDeath> actorDeath = new ArrayList<>();
    /** List of death dates for the actor. */
    List<ActorData> actorList = new ArrayList<>();

    /** List of actors. */

    /**
     * Constructs a new ActorData object with default values.
     */
    public ActorData() {
        this.actorFirstName = "";
        this.actorLastName = "";
        this.gender = "";
        this.actorAge = 0;
        this.netWorth = 0;
        this.careerLength = 0;
        this.isAlive = false;
        this.isDead = false;
        this.actorBirth = new ArrayList<>();
        this.actorDeath = new ArrayList<>();
        this.actorList = new ArrayList<>();
    }

    /**
     * Constructs a new ActorData object with specified values.
     * 
     * @param actorFirstName The first name of the actor.
     * @param actorLastName  The last name of the actor.
     * @param gender         The gender of the actor.
     * @param actorAge       The age of the actor.
     * @param netWorth       The net worth of the actor.
     * @param careerLength   The length of the actor's career.
     * @param isAlive        Flag indicating whether the actor is alive.
     * @param isDead         Flag indicating whether the actor is dead.
     * @param actorList      List of actors.
     * @param actorBirth     List of birth dates for the actor.
     * @param actorDeath     List of death dates for the actor.
     */
    public ActorData(String actorFirstName, String actorLastName, String gender, int actorAge,
            int netWorth, int careerLength, Boolean isAlive, Boolean isDead, List<ActorData> actorList,
            List<ActorBirth> actorBirth, List<ActorDeath> actorDeath) {
        this.actorFirstName = actorFirstName;
        this.actorLastName = actorLastName;
        this.gender = gender;
        this.actorAge = actorAge;
        this.netWorth = netWorth;
        this.careerLength = careerLength;
        this.isAlive = true;
        this.isDead = true;
        this.actorList = actorList;
        this.actorBirth = actorBirth;
        this.actorDeath = actorDeath;
    }

    /**
     * Get the first name of the actor.
     * 
     * @return The first name of the actor.
     */
    public String getActorFirstName() {
        return actorFirstName;
    }

    /**
     * Set the first name of the actor.
     * 
     * @param actorFirstName The first name of the actor.
     */
    public void setActorFirstName(String actorFirstName) {
        this.actorFirstName = actorFirstName;
    }

    /**
     * Get the last name of the actor.
     * 
     * @return The last name of the actor.
     */
    public String getActorLastName() {
        return actorLastName;
    }

    /**
     * Set the last name of the actor.
     * 
     * @param actorLastName The last name of the actor.
     */
    public void setActorLastName(String actorLastName) {
        this.actorLastName = actorLastName;
    }

    /**
     * Get the gender of the actor.
     * 
     * @return The gender of the actor.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Set the gender of the actor.
     * 
     * @param gender The gender of the actor.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Get the age of the actor.
     * 
     * @return The age of the actor.
     */
    public int getActorAge() {
        return actorAge;
    }

    /**
     * Set the age of the actor.
     * 
     * @param actorAge The age of the actor.
     */
    public void setActorAge(int actorAge) {
        this.actorAge = actorAge;
    }

    /**
     * Get the net worth of the actor.
     * 
     * @return The net worth of the actor.
     */
    public int getNetWorth() {
        return netWorth;
    }

    /**
     * Set the net worth of the actor.
     * 
     * @param netWorth The net worth of the actor.
     */
    public void setNetWorth(int netWorth) {
        this.netWorth = netWorth;
    }

    /**
     * Get the list of birth dates for the actor.
     * 
     * @return The list of birth dates for the actor.
     */
    public List<ActorBirth> getBirthList() {
        return actorBirth;
    }

    /**
     * Set the list of birth dates for the actor.
     * 
     * @param actorBirth The list of birth dates for the actor.
     */
    public void setBirthList(List<ActorBirth> actorBirth) {
        this.actorBirth = actorBirth;
    }

    /**
     * Get the list of death dates for the actor.
     * 
     * @return The list of death dates for the actor.
     */
    public List<ActorDeath> getDeathList() {
        return actorDeath;
    }

    /**
     * Set the list of death dates for the actor.
     * 
     * @param actorDeath The list of death dates for the actor.
     */
    public void getDeathList(List<ActorDeath> actorDeath) {
        this.actorDeath = actorDeath;
    }

    /**
     * Check if the actor is alive.
     * 
     * @return True if the actor is alive, otherwise false.
     */
    public Boolean getIsAlive() {
        return this.isAlive;
    }

    /**
     * Set the status of the actor's life.
     * 
     * @param isAlive True if the actor is alive, otherwise false.
     */
    public void setIsAlive(Boolean isAlive) {
        this.isAlive = isAlive;
    }

    /**
     * Check if the actor is dead.
     * 
     * @return True if the actor is dead, otherwise false.
     */
    public Boolean getIsDead() {
        return this.isDead;
    }

    /**
     * Set the status of the actor's death.
     * 
     * @param isDead True if the actor is dead, otherwise false.
     */
    public void setIsDead(Boolean isdDead) {
        this.isDead = isdDead;
    }

    /**
     * Get the list of actors.
     * 
     * @return The list of actors.
     */
    public List<ActorData> getActorList() {
        return actorList;
    }

    /**
     * Set the list of actors.
     * 
     * @param actorList The list of actors.
     */
    public void setActorList(List<ActorData> actorList) {
        this.actorList = actorList;
    }

    /**
     * Get the length of the actor's career.
     * 
     * @return The length of the actor's career.
     */
    public int getCareerLength() {
        return this.careerLength;
    }

    /**
     * Set the length of the actor's career.
     * 
     * @param careerLength The length of the actor's career.
     */
    public void setCareerLength(int careerLength) {
        this.careerLength = careerLength;
    }

    /**
     * Get the count of actors in the list.
     * 
     * @return The count of actors.
     */
    public int ActorCount() {
        return actorList.size();
    }

    /**
     * Sort the list of actors by first name.
     * 
     * @return The sorted list of actors.
     */
    public List<ActorData> sortByFirstName() {
        List<ActorData> sortfname = new ArrayList<>();
        for (ActorData actor : actorList) {
            sortfname.add(actor);
            sortfname.sort(Comparator.comparing(ActorData::getActorFirstName));
        }
        System.out.println("Actors sorted by first names.");
        return sortfname;
    }

    /**
     * Sort the list of actors by last name.
     * 
     * @return The sorted list of actors.
     */
    public List<ActorData> sortByLastName() {
        List<ActorData> sortlname = new ArrayList<>();
        for (ActorData actor : actorList) {
            sortlname.add(actor);
            sortlname.sort(Comparator.comparing(ActorData::getActorLastName));
        }
        System.out.println("Actors sorted by last names.");
        return sortlname;
    }

    /**
     * Sort the list of actors by net worth.
     * 
     * @return The sorted list of actors.
     */
    public List<ActorData> sortbyNetworth() {
        List<ActorData> sortNetworth = new ArrayList<>();
        for (ActorData actor : actorList) {
            sortNetworth.add(actor);
            sortNetworth.sort(Comparator.comparing(ActorData::getNetWorth));
        }
        System.out.println("List of actors sorted by age.");
        return sortNetworth;
    }

    /**
     * Sort the list of actors by age.
     * 
     * @return The sorted list of actors.
     */
    public List<ActorData> sortbyAge() {
        List<ActorData> sortAge = new ArrayList<>();
        for (ActorData actor : actorList) {
            sortAge.add(actor);
            sortAge.sort(Comparator.comparing(ActorData::getActorAge));
        }
        System.out.println("List of actors sorted by age");
        return sortAge;
    }

    /**
     * Get the oldest actor from the list.
     * 
     * @param actor The actor to compare.
     * @return The oldest actor.
     */
    public String getOldest(ActorData actor) {
        List<ActorData> Oldest = new ArrayList<>();
        Oldest.add(actor);
        Oldest.sort(Comparator.comparing(ActorData::getActorAge));
        Oldest.get(0);
        String oldestActor = ("Oldest actor: " + Oldest);
        return oldestActor;
    }

    /**
     * Get the youngest actor from the list.
     * 
     * @param actor The actor to compare.
     * @return The youngest actor.
     */
    public String getYoungest(ActorData actor) {
        List<ActorData> youngest = new ArrayList<>();
        youngest.add(actor);
        youngest.sort(Comparator.comparing(ActorData::getActorAge));
        youngest.get(youngest.size() - 1);
        String youngestActor = ("Youngest actor: " + youngest);
        return youngestActor;
    }

    /**
     * Sort the list of actors by career length.
     * 
     * @return The sorted list of actors.
     */
    public List<ActorData> sortbyCareerLength() {
        List<ActorData> sortCareerLength = new ArrayList<>();
        for (ActorData actor : actorList) {
            sortCareerLength.add(actor);
            sortCareerLength.sort(Comparator.comparing(ActorData::getCareerLength));
        }
        return sortCareerLength;
    }

    /**
     * Add an actor to the list.
     * 
     * @param actor The actor to add.
     */
    public void addActor(ActorData actor) {
        if (!actorList.contains(actor)) {
            actorList.add(actor);
            System.out.println(actor + " has been added to the list of actors.");
        }
    }

    /**
     * Remove an actor from the list.
     * 
     * @param actor The actor to remove.
     */
    public void removeActor(ActorData actor) {
        if (actorList.contains(actor)) {
            actorList.remove(actor);
            System.out.println(actor + " has been removed from the list.");
        }
    }

    /**
     * Add an actor to the list of deceased actors.
     * 
     * @param actor The actor to mark as deceased.
     */
    public void addToDeadList(ActorData actor) {
        if (!actorList.contains(actor)) {
            System.out.println("Actor not found in the actor list.");
            return;
        }
        if (actor.getIsDead()) {
            System.out.println(actor.getActorFirstName() + " is already marked as deceased.");
            return;
        }
        ActorDeath death = new ActorDeath();
        death.getDeathDay();
        death.getDeathMonth();
        death.getDeathYear();
        actor.getDeathList().add(death);
        actor.setIsDead(true);
        System.out.println(actor.getActorFirstName() + " has been added to the list of deceased actors.");
    }

    /**
     * Retrieve actors within a specified age range.
     * 
     * @param minAge The minimum age of the actors to retrieve.
     * @param maxAge The maximum age of the actors to retrieve.
     * @return A list of actors within the specified age range.
     */
    public List<ActorData> retrieveActorsByAgeRange(int minAge, int maxAge) {
        List<ActorData> actorsInRange = new ArrayList<>();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for (ActorData actor : actorList) {
            int birthYear = currentYear - actor.getActorAge();
            if (birthYear >= (currentYear - maxAge) && birthYear <= (currentYear - minAge)) {
                actorsInRange.add(actor);
            }
        }
        return actorsInRange;
    }

    /**
     * Get the total net worth of all actors.
     * 
     * @return A map containing the total net worth.
     */
    public Map<String, Integer> getTotalNetworth() {
        Map<String, Integer> totalNetworth = new HashMap<>();
        int total = 0;
        for (ActorData actor : actorList) {
            System.out.println("Name: " + actor.getActorFirstName() + "Networth: " + actor.getNetWorth() + "\n");
            total += actor.getNetWorth();
            totalNetworth.put("Total networth: ", total);
        }
        return totalNetworth;
    }

    /**
     * Get the list of alive actors.
     * 
     * @return The list of alive actors.
     */
    public List<String> getAliveActors() {
        List<String> alive = new ArrayList<>();
        for (ActorData actor : actorList) {
            if (actor.getIsAlive()) {
                alive.add(actor.getActorFirstName());
            }
        }
        return alive;
    }
}
