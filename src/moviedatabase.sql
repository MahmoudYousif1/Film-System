CREATE DATABASE moviedatabase;
USE moviedatabase;

CREATE TABLE Actors (
    actor_id INT  PRIMARY KEY,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    date_of_birth DATE,
    nationality VARCHAR(100)
);

CREATE TABLE Films (
    film_id INT  PRIMARY KEY,
    title VARCHAR(255),
    release_year YEAR,
    director VARCHAR(100),
    language VARCHAR(50)
);

CREATE TABLE ActorRoles (
    role_id INT PRIMARY KEY,
    actor_id INT,
    film_id INT,
    role_name VARCHAR(100),
    FOREIGN KEY (actor_id) REFERENCES Actors(actor_id),
    FOREIGN KEY (film_id) REFERENCES Films(film_id)
);

CREATE TABLE Awards (
    award_id INT  PRIMARY KEY,
    award_name VARCHAR(255),
    year YEAR,
    actor_id INT,
    FOREIGN KEY (actor_id) REFERENCES Actors(actor_id)
);

CREATE TABLE Genres (
    genre_id INT  PRIMARY KEY,
    genre_name VARCHAR(100)
);

CREATE TABLE FilmGenres (
    film_id INT,
    genre_id INT,
    PRIMARY KEY (film_id, genre_id),
    FOREIGN KEY (film_id) REFERENCES Films(film_id),
    FOREIGN KEY (genre_id) REFERENCES Genres(genre_id)
);

CREATE TABLE Themes (
    theme_id INT  PRIMARY KEY,
    theme_name VARCHAR(100)
);

CREATE TABLE FilmThemes (
    film_id INT,
    theme_id INT,
    PRIMARY KEY (film_id, theme_id),
    FOREIGN KEY (film_id) REFERENCES Films(film_id),
    FOREIGN KEY (theme_id) REFERENCES Themes(theme_id)
);

CREATE TABLE Soundtracks (
    track_id INT PRIMARY KEY,
    film_id INT,
    track_name VARCHAR(255),
    composer VARCHAR(100),
    FOREIGN KEY (film_id) REFERENCES Films(film_id)
);
