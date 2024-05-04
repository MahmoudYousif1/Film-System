package src;
import java.util.*;

/**
 * The SystemFilms class represents the system of films.
 */
class SystemFilms {

    List<ActorData> listOfActors = new ArrayList<>(); // List of actors
    List<ActorRoles> listOfActorRoles = new ArrayList<>(); // List of actor roles
    List<FilmData> listOfFilmData = new ArrayList<>(); // List of film data
    List<SoundTracks> listOfSoundTracks = new ArrayList<>(); // List of soundtracks
    List<AwardsReceived> lisofAwards = new ArrayList<>(); // List of awards received
    List<FilmGenres> listOfFilmGenres = new ArrayList<>(); // List of film genres
    List<FilmThemes> listOfFilmThemes = new ArrayList<>(); // List of film themes

    /**
     * Constructs a new SystemFilms instance with default values.
     */
    public SystemFilms() {
        this.listOfActors = new ArrayList<>();
        this.listOfActorRoles = new ArrayList<>();
        this.listOfFilmData = new ArrayList<>();
        this.listOfSoundTracks = new ArrayList<>();
        this.lisofAwards = new ArrayList<>();
        this.listOfFilmGenres = new ArrayList<>();
        this.listOfFilmThemes = new ArrayList<>();
    }

    /**
     * Constructs a new SystemFilms instance with specified values.
     * 
     * @param listOfActors      The list of actors.
     * @param listOfActorRoles  The list of actor roles.
     * @param listOfFilmData    The list of film data.
     * @param listOfSoundTracks The list of soundtracks.
     * @param lisofAwards       The list of awards received.
     * @param listOfFilmGenres  The list of film genres.
     * @param listOfFilmThemes  The list of film themes.
     */
    public SystemFilms(List<ActorData> listOfActors, List<ActorRoles> listOfActorRoles, List<FilmData> listOfFilmData,
            List<SoundTracks> listOfSoundTracks, List<AwardsReceived> lisofAwards, List<FilmGenres> listOfFilmGenres,
            List<FilmThemes> listOfFilmThemes) {
        this.listOfActors = listOfActors;
        this.listOfActorRoles = listOfActorRoles;
        this.listOfFilmData = listOfFilmData;
        this.listOfSoundTracks = listOfSoundTracks;
        this.lisofAwards = lisofAwards;
        this.listOfFilmGenres = listOfFilmGenres;
        this.listOfFilmThemes = listOfFilmThemes;
    }

    /**
     * Get the list of actors.
     * 
     * @return The list of actors.
     */
    public List<ActorData> getListOfActors() {
        return listOfActors;
    }

    /**
     * Set the list of actors.
     * 
     * @param listOfActors The list of actors.
     */
    public void setListOfActors(List<ActorData> listOfActors) {
        this.listOfActors = listOfActors;
    }

    /**
     * Get the list of actor roles.
     * 
     * @return The list of actor roles.
     */
    public List<ActorRoles> getListOfActorRoles() {
        return listOfActorRoles;
    }

    /**
     * Set the list of actor roles.
     * 
     * @param listOfActorRoles The list of actor roles.
     */
    public void setListOfActorRoles(List<ActorRoles> listOfActorRoles) {
        this.listOfActorRoles = listOfActorRoles;
    }

    /**
     * Get the list of film data.
     * 
     * @return The list of film data.
     */
    public List<FilmData> getListOfFilmData() {
        return listOfFilmData;
    }

    /**
     * Set the list of film data.
     * 
     * @param listOfFilmData The list of film data.
     */
    public void setListOfFilmData(List<FilmData> listOfFilmData) {
        this.listOfFilmData = listOfFilmData;
    }

    /**
     * Get the list of soundtracks.
     * 
     * @return The list of soundtracks.
     */
    public List<SoundTracks> getListOfSoundTracks() {
        return listOfSoundTracks;
    }

    /**
     * Set the list of soundtracks.
     * 
     * @param listOfSoundTracks The list of soundtracks.
     */
    public void setListOfSoundTracks(List<SoundTracks> listOfSoundTracks) {
        this.listOfSoundTracks = listOfSoundTracks;
    }

    /**
     * Get the list of awards received.
     * 
     * @return The list of awards received.
     */
    public List<AwardsReceived> getLisofAwards() {
        return lisofAwards;
    }

    /**
     * Set the list of awards received.
     * 
     * @param lisofAwards The list of awards received.
     */
    public void setLisofAwards(List<AwardsReceived> lisofAwards) {
        this.lisofAwards = lisofAwards;
    }

    /**
     * Get the list of film genres.
     * 
     * @return The list of film genres.
     */
    public List<FilmGenres> getListOfFilmGenres() {
        return listOfFilmGenres;
    }

    /**
     * Set the list of film genres.
     * 
     * @param listOfFilmGenres The list of film genres.
     */
    public void setListOfFilmGenres(List<FilmGenres> listOfFilmGenres) {
        this.listOfFilmGenres = listOfFilmGenres;
    }

    /**
     * Get the list of film themes.
     * 
     * @return The list of film themes.
     */
    public List<FilmThemes> getListOfFilmThemes() {
        return listOfFilmThemes;
    }

    /**
     * Set the list of film themes.
     * 
     * @param listOfFilmThemes The list of film themes.
     */
    public void setListOfFilmThemes(List<FilmThemes> listOfFilmThemes) {
        this.listOfFilmThemes = listOfFilmThemes;
    }

    /**
     * Add an actor to the list of actors.
     * 
     * @param actor The actor to be added.
     */
    public void addActor(ActorData actor) {
        this.listOfActors.add(actor);
    }

    /**
     * Add an actor role to the list of actor roles.
     * 
     * @param actorRole The actor role to be added.
     */
    public void addActorRole(ActorRoles actorRole) {
        this.listOfActorRoles.add(actorRole);
    }

    /**
     * Add film data to the list of film data.
     * 
     * @param filmData The film data to be added.
     */
    public void addFilmData(FilmData filmData) {
        this.listOfFilmData.add(filmData);
    }

    /**
     * Add a soundtrack to the list of soundtracks.
     * 
     * @param soundTrack The soundtrack to be added.
     */
    public void addSoundTrack(SoundTracks soundTrack) {
        this.listOfSoundTracks.add(soundTrack);
    }

    /**
     * Add an award to the list of awards received.
     * 
     * @param award The award to be added.
     */
    public void addAward(AwardsReceived award) {
        this.lisofAwards.add(award);
    }

    /**
     * Add a film genre to the list of film genres.
     * 
     * @param filmGenre The film genre to be added.
     */
    public void addFilmGenre(FilmGenres filmGenre) {
        this.listOfFilmGenres.add(filmGenre);
    }

    /**
     * Add a film theme to the list of film themes.
     * 
     * @param filmTheme The film theme to be added.
     */
    public void addFilmTheme(FilmThemes filmTheme) {
        this.listOfFilmThemes.add(filmTheme);
    }

    /**
     * Remove an actor from the list of actors.
     * 
     * @param actor The actor to be removed.
     */
    public void removeActor(ActorData actor) {
        this.listOfActors.remove(actor);
    }

    /**
     * Remove an actor role from the list of actor roles.
     * 
     * @param actorRole The actor role to be removed.
     */
    public void removeActorRole(ActorRoles actorRole) {
        this.listOfActorRoles.remove(actorRole);
    }

    /**
     * Remove film data from the list of film data.
     * 
     * @param filmData The film data to be removed.
     */
    public void removeFilmData(FilmData filmData) {
        this.listOfFilmData.remove(filmData);
    }

    /**
     * Remove a soundtrack from the list of soundtracks.
     * 
     * @param soundTrack The soundtrack to be removed.
     */
    public void removeSoundTrack(SoundTracks soundTrack) {
        this.listOfSoundTracks.remove(soundTrack);
    }

    /**
     * Remove an award from the list of awards received.
     * 
     * @param award The award to be removed.
     */
    public void removeAward(AwardsReceived award) {
        this.lisofAwards.remove(award);
    }

    /**
     * Remove a film genre from the list of film genres.
     * 
     * @param filmGenre The film genre to be removed.
     */
    public void removeFilmGenre(FilmGenres filmGenre) {
        this.listOfFilmGenres.remove(filmGenre);
    }

    /**
     * Remove a film theme from the list of film themes.
     * 
     * @param filmTheme The film theme to be removed.
     */
    public void removeFilmTheme(FilmThemes filmTheme) {
        this.listOfFilmThemes.remove(filmTheme);
    }

   
    /**
     * Calculate the average age of all actors.
     * 
     * @return The average age of all actors.
     */
    public int averageActorAge() {
        int sum = 0;
        for (ActorData actor : listOfActors) {
            sum += actor.getActorAge();
        }
        return sum / listOfActors.size();
    }

    public int averageFilmDuration() {
        int sum = 0;
        for (FilmData film : listOfFilmData) {
            sum += film.getDuration();
        }
        return sum / listOfFilmData.size();
    }

    /**
     * Calculate the average budget of all films.
     * 
     * @return The average budget of all films.
     */
    public int averageFilmBudget() {
        int sum = 0;
        for (FilmData film : listOfFilmData) {
            sum += film.getBudget();
        }
        return sum / listOfFilmData.size();
    }

    /**
     * Calculate the average box office revenue of all films.
     * 
     * @return The average box office revenue of all films.
     */
    public int averageFilmBoxOfficeRevenue() {
        int sum = 0;
        for (FilmData film : listOfFilmData) {
            sum += film.getBoxOfficeRevenue();
        }
        return sum / listOfFilmData.size();
    }

    /**
     * Sort the actors by first name.
     * 
     * @return The sorted list of actors.
     */
    public List<ActorData> sortActorsByFirstName() {
        List<ActorData> sortedActors = new ArrayList<>(listOfActors);
        Collections.sort(sortedActors, new Comparator<ActorData>() {
            @Override
            public int compare(ActorData actor1, ActorData actor2) {
                return actor1.getActorFirstName().compareTo(actor2.getActorFirstName());
            }
        });
        return sortedActors;
    }


    /**
     * Sort the actors by last name.
     * 
     * @return The sorted list of actors.
     */
    public List<ActorData> sortActorsByLastName() {
        List<ActorData> sortedActors = new ArrayList<>(listOfActors);
        Collections.sort(sortedActors, new Comparator<ActorData>() {
            @Override
            public int compare(ActorData actor1, ActorData actor2) {
                return actor1.getActorLastName().compareTo(actor2.getActorLastName());
            }
        });
        return sortedActors;
    }


    /**
     * Sort the actors by age.
     * 
     * @return The sorted list of actors.
     */
    public List<ActorData> sortActorsByAge() {
        List<ActorData> sortedActors = new ArrayList<>(listOfActors);
        Collections.sort(sortedActors, new Comparator<ActorData>() {
            @Override
            public int compare(ActorData actor1, ActorData actor2) {
                return actor1.getActorAge() - actor2.getActorAge();
            }
        });
        return sortedActors;
    }


    public List<ActorRoles> sortActorRolesByRoleName() {
        List<ActorRoles> sortedActorRoles = new ArrayList<>(listOfActorRoles);
        Collections.sort(sortedActorRoles, new Comparator<ActorRoles>() {
            @Override
            public int compare(ActorRoles actorRole1, ActorRoles actorRole2) {
                return actorRole1.getRoleName().compareTo(actorRole2.getRoleName());
            }
        });
        return sortedActorRoles;
    }


    public List<ActorRoles> sortActorRolesByRoleMovie() {
        List<ActorRoles> sortedActorRoles = new ArrayList<>(listOfActorRoles);
        Collections.sort(sortedActorRoles, new Comparator<ActorRoles>() {
            @Override
            public int compare(ActorRoles actorRole1, ActorRoles actorRole2) {
                return actorRole1.getRoleMovie().compareTo(actorRole2.getRoleMovie());
            }
        });
        return sortedActorRoles;
    }


    public List<ActorRoles> sortActorRolesByRoleDuration() {
        List<ActorRoles> sortedActorRoles = new ArrayList<>(listOfActorRoles);
        Collections.sort(sortedActorRoles, new Comparator<ActorRoles>() {
            @Override
            public int compare(ActorRoles actorRole1, ActorRoles actorRole2) {
                return actorRole1.getRoleDuration() - actorRole2.getRoleDuration();
            }
        });
        return sortedActorRoles;
    }


    public List<AwardsReceived> sortAwardsByAwardName() {
        List<AwardsReceived> sortedAwards = new ArrayList<>(lisofAwards);
        Collections.sort(sortedAwards, new Comparator<AwardsReceived>() {
            @Override
            public int compare(AwardsReceived award1, AwardsReceived award2) {
                return award1.getAwardName().compareTo(award2.getAwardName());
            }
        });
        return sortedAwards;
    }


    public List<AwardsReceived> sortAwardsByReceivedYear() {
        List<AwardsReceived> sortedAwards = new ArrayList<>(lisofAwards);
        Collections.sort(sortedAwards, new Comparator<AwardsReceived>() {
            @Override
            public int compare(AwardsReceived award1, AwardsReceived award2) {
                return award1.getReceivedYear() - award2.getReceivedYear();
            }
        });
        return sortedAwards;
    }


    public List<FilmGenres> sortFilmGenresByGenre() {
        List<FilmGenres> sortedFilmGenres = new ArrayList<>(listOfFilmGenres);
        Collections.sort(sortedFilmGenres, new Comparator<FilmGenres>() {
            @Override
            public int compare(FilmGenres filmGenre1, FilmGenres filmGenre2) {
                return filmGenre1.getGenre(null).compareTo((FilmGenres) filmGenre2.getGenre(null));
            }
        });
        return sortedFilmGenres;
    }

  

    /**
     * Sort the films by title.
     * 
     * @return The sorted list of films.
     */
    public List<FilmData> sortFilmsByTitle() {
        List<FilmData> sortedFilms = new ArrayList<>(listOfFilmData);
        Collections.sort(sortedFilms, new Comparator<FilmData>() {
            @Override
            public int compare(FilmData film1, FilmData film2) {
                return film1.getTitle().compareTo(film2.getTitle());
            }
        });
        return sortedFilms;
    }


    /**
     * Sort the films by year.
     * 
     * @return The sorted list of films.
     */
    public List<FilmData> sortFilmsByYear() {
        List<FilmData> sortedFilms = new ArrayList<>(listOfFilmData);
        Collections.sort(sortedFilms, new Comparator<FilmData>() {
            @Override
            public int compare(FilmData film1, FilmData film2) {
                return film1.getReleasedYear() - film2.getReleasedYear();
            }
        });
        return sortedFilms;
    }

    /**
     * Sort the films by budget.
     * 
     * @return The sorted list of films.
     */
    public List<FilmData> sortFilmsByBudget() {
        List<FilmData> sortedFilms = new ArrayList<>(listOfFilmData);
        Collections.sort(sortedFilms, new Comparator<FilmData>() {
            @Override
            public int compare(FilmData film1, FilmData film2) {
                return (int) (film1.getBudget() - film2.getBudget());
            }
        });
        return sortedFilms;
    }

    
    /**
     * Sort the films by box office revenue.
     * 
     * @return The sorted list of films.
     */
    public List<FilmData> sortFilmsByBoxOfficeRevenue() {
        List<FilmData> sortedFilms = new ArrayList<>(listOfFilmData);
        Collections.sort(sortedFilms, new Comparator<FilmData>() {
            @Override
            public int compare(FilmData film1, FilmData film2) {
                return (int) (film1.getBoxOfficeRevenue() - film2.getBoxOfficeRevenue());
            }
        });
        return sortedFilms;
    }

    /**
     * Sort the actors by first name.
     * 
     * @return The sorted list of actors.
     */
    public List<SoundTracks> sortSoundTracksByTitle() {
        List<SoundTracks> sortedSoundTracks = new ArrayList<>(listOfSoundTracks);
        Collections.sort(sortedSoundTracks, new Comparator<SoundTracks>() {
            @Override
            public int compare(SoundTracks soundTrack1, SoundTracks soundTrack2) {
                return soundTrack1.getSoundTrackName().compareTo(soundTrack2.getSoundTrackName());
            }
        });
        return sortedSoundTracks;
    }

   
    public List<SoundTracks> sortSoundTracksByArtist() {
        List<SoundTracks> sortedSoundTracks = new ArrayList<>(listOfSoundTracks);
        Collections.sort(sortedSoundTracks, new Comparator<SoundTracks>() {
            @Override
            public int compare(SoundTracks soundTrack1, SoundTracks soundTrack2) {
                return soundTrack1.getSoundTrackArtist().compareTo(soundTrack2.getSoundTrackArtist());
            }
        });
        return sortedSoundTracks;
    }

}

