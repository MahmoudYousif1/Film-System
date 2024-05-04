package src;

class SoundTracks {

    String SoundTrackName;
    String SoundTrackArtist;
    double SoundTrackDuration;

    /**
     * Constructs a new SoundTracks instance with default values.
     */
    public SoundTracks() {
        this.SoundTrackName = "Untitled";
        this.SoundTrackArtist = "Untitled";
        this.SoundTrackDuration = 0.0;
    }


    /**
     * Constructs a new SoundTracks instance with specified values.
     * 
     * @param soundTrackName     The name of the soundtrack.
     * @param soundTrackArtist   The artist of the soundtrack.
     * @param soundTrackDuration The duration of the soundtrack.
     */
    public SoundTracks(String soundTrackName, String soundTrackArtist, double soundTrackDuration) {
        SoundTrackName = soundTrackName;
        SoundTrackArtist = soundTrackArtist;
        SoundTrackDuration = soundTrackDuration;
    }

    /**
     * Get the name of the soundtrack.
     * 
     * @return The name of the soundtrack.
     */
    public String getSoundTrackName() {
        return SoundTrackName;
    }

    /**
     * Set the name of the soundtrack.
     * 
     * @param soundTrackName The name of the soundtrack.
     */
    public void setSoundTrackName(String soundTrackName) {
        SoundTrackName = soundTrackName;
    }

    /**
     * Get the artist of the soundtrack.
     * 
     * @return The artist of the soundtrack.
     */
    public String getSoundTrackArtist() {
        return SoundTrackArtist;
    }

    /**
     * Set the artist of the soundtrack.
     * 
     * @param soundTrackArtist The artist of the soundtrack.
     */
    public void setSoundTrackArtist(String soundTrackArtist) {
        SoundTrackArtist = soundTrackArtist;
    }

    /**
     * Get the duration of the soundtrack.
     * 
     * @return The duration of the soundtrack.
     */
    public double getSoundTrackDuration() {
        return SoundTrackDuration;
    }

    /**
     * Set the duration of the soundtrack.
     * 
     * @param soundTrackDuration The duration of the soundtrack.
     */
    public void setSoundTrackDuration(double soundTrackDuration) {
        SoundTrackDuration = soundTrackDuration;
    }
}