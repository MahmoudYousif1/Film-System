package src;

import java.util.*;

/**
 * The AwardsReceived class represents the awards received by an actor.
 */
class AwardsReceived {

    private String awardName;
    private int receivedYear;
    private int receivedMonth;
    private int receivedDay;
    private List<AwardsReceived> awardsList = new ArrayList<>();

    /** The list of all awards received. */

    /**
     * Constructs a new AwardsReceived instance with default values.
     */
    public AwardsReceived() {
        this.awardName = "Untitled";
        this.receivedDay = 0;
        this.receivedMonth = 0;
        this.receivedYear = 0;
        this.awardsList = new ArrayList<>();
    }

    /**
     * Constructs a new AwardsReceived instance with specified values.
     * 
     * @param awardName     The name of the award.
     * @param receivedDay   The day when the award was received.
     * @param receivedMonth The month when the award was received.
     * @param receivedYear  The year when the award was received.
     * @param awardsList    The list of all awards received.
     */
    public AwardsReceived(String awardName, int receivedDay, int receivedMonth, int receivedYear,
            List<AwardsReceived> awardsList) {
        this.awardName = awardName;
        this.receivedDay = receivedDay;
        this.receivedMonth = receivedMonth;
        this.receivedYear = receivedYear;
        this.awardsList = awardsList;
    }

    /**
     * Get the name of the award received.
     * 
     * @return The name of the award.
     */
    public String getAwardName() {
        return awardName;
    }

    /**
     * Set the name of the award received.
     * 
     * @param awardName The name of the award.
     */
    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    /**
     * Get the year when the award was received.
     * 
     * @return The year when the award was received.
     */
    public int getReceivedYear() {
        return receivedYear;
    }

    /**
     * Set the year when the award was received.
     * 
     * @param receivedYear The year when the award was received.
     */
    public void setReceivedYear(int receivedYear) {
        this.receivedYear = receivedYear;
    }

    /**
     * Get the month when the award was received.
     * 
     * @return The month when the award was received.
     */
    public int getReceivedMonth() {
        return receivedMonth;
    }

    /**
     * Set the month when the award was received.
     * 
     * @param receivedMonth The month when the award was received.
     */
    public void setReceivedMonth(int receivedMonth) {
        this.receivedMonth = receivedMonth;
    }

    /**
     * Get the day when the award was received.
     * 
     * @return The day when the award was received.
     */
    public int getReceivedDay() {
        return receivedDay;
    }

    /**
     * Set the day when the award was received.
     * 
     * @param receivedDay The day when the award was received.
     */
    public void setReceivedDay(int receivedDay) {
        this.receivedDay = receivedDay;
    }

    /**
     * Get the list of all awards received.
     * 
     * @return The list of all awards received.
     */
    public List<AwardsReceived> getAwardsList() {
        return this.awardsList;
    }

    /**
     * Set the list of all awards received.
     * 
     * @param awardsList The list of all awards received.
     */
    public void setAwardsList(List<AwardsReceived> awardsList) {
        this.awardsList = awardsList;
    }

    /**
     * Returns a string representation of the award.
     * 
     * @return A string containing the award name and date.
     */
    public String returnAward() {
        return ("Award name: " + awardName + "Received: " + receivedDay + "/" + receivedMonth + "/" + receivedYear);
    }

    /**
     * Get the full date of the award.
     * 
     * @return The full date of the award in the format "day/month/year".
     */
    public String getFullAwardDate() {
        return (receivedDay + "/" + receivedMonth + "/" + receivedYear);
    }

    /**
     * Checks if the award details match the specified values.
     * 
     * @param name  The name of the award to check.
     * @param day   The day of the award to check.
     * @param month The month of the award to check.
     * @param year  The year of the award to check.
     * @return true if the award details match the specified values, otherwise
     *         false.
     */
    public Boolean checkValidAward(String name, int day, int month, int year) {
        if (this.getAwardName().equals(name) || this.getReceivedDay() == day || this.getReceivedMonth() == month
                || this.getReceivedYear() == year) {
            return true;
        } else {
            System.out.println("Award is not valid");
            return false;
        }
    }

    /**
     * Checks if the award was received on the specified date.
     * 
     * @param day   The day to check.
     * @param month The month to check.
     * @param year  The year to check.
     * @return true if the award was received on the specified date, otherwise
     *         false.
     */
    public Boolean specifiedAwardDate(int day, int month, int year) {
        if (this.getReceivedDay() == day || this.getReceivedMonth() == month || this.getReceivedYear() == year) {
            System.out.println(this.getReceivedDay() + "/" + this.getReceivedMonth() + "/" + this.getReceivedYear());
            return true;
        } else {
            return false;
        }
    }

    /**
     * Calculate the number of awards received in a specific year.
     * 
     * @param year The year for which to calculate the number of awards.
     * @return A map containing the count of awards received in the specified year.
     */
    public Map<Integer, Integer> awardsPerYear(int year) {
        Map<Integer, Integer> perYearCount = new HashMap<>();
        int count = 0;
        for (AwardsReceived awards : awardsList) {
            if (awards.getReceivedYear() == year) {
                count++;
                perYearCount.put(awards.getReceivedYear(), count);
            }
        }
        return perYearCount;
    }
}
