package za.ac.cput.novacinemaapp.domain;

/*
Entity for User
Author : Mohamed Shiiraar (220354804)
Date : 17 May
 */

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.sql.Blob;
import java.util.Objects;
@Entity
@Getter
@Setter

public class Movie {
    @Id
    private String movieID;
    private String name;
    private String movieDescription;
    private String genre;
    private String duration;
    private String ageRestriction;

    private Byte movieIMG;

    public Movie() {
    }

    public Movie(Builder builder) {
        this.movieID = builder.movieID;
        this.name = builder.name;
        this.movieDescription = builder.movieDescription;
        this.genre = builder.genre;
        this.duration = builder.duration;
        this.ageRestriction = builder.ageRestriction;
        this.movieIMG = builder.movieIMG;
    }

    public String getMovieID() {
        return movieID;
    }

    public String getName() {
        return name;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public String getGenre() {
        return genre;
    }

    public String getDuration() {
        return duration;
    }

    public String getAgeRestriction() {
        return ageRestriction;
    }

    public byte getMovieIMG() {
        return movieIMG;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie movie)) return false;
        return Objects.equals(movieID, movie.movieID) && Objects.equals(name, movie.name) && Objects.equals(movieDescription, movie.movieDescription) && Objects.equals(genre, movie.genre) && Objects.equals(duration, movie.duration) && Objects.equals(movieIMG,movie.movieIMG);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieID, name, movieDescription, genre, duration,movieIMG);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieID='" + movieID + '\'' +
                ", name='" + name + '\'' +
                ", movieDescription='" + movieDescription + '\'' +
                ", genre='" + genre + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }

    public static class Builder {
        private String movieID;
        private String name;
        private String movieDescription;
        private String genre;
        private String duration;
        private String ageRestriction;

        private byte movieIMG;

        public Builder setMovieID(String movieID) {
            this.movieID = movieID;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMovieDescription(String movieDescription) {
            this.movieDescription = movieDescription;
            return this;
        }

        public Builder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = duration;
            return this;
        }

        public Builder setAgeRestriction(String ageRestriction) {
            this.ageRestriction = ageRestriction;
            return this;
        }
        public Builder setMovieIMG (byte movieIMG) {
            this.movieIMG = movieIMG;
            return this;
        }

        public Builder copy(Movie movie){
            this.movieID = movie.movieID;
            this.name = movie.name;
            this.movieDescription = movie.movieDescription;
            this.genre = movie.genre;
            this.duration = movie.duration;
            this.ageRestriction = movie.ageRestriction;
            this.movieIMG = movie.movieIMG;
            return this;
        }
        public Movie build() {
            return new Movie(this);
        }

    }
}
