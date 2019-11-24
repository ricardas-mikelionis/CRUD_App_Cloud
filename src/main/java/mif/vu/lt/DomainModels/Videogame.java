package mif.vu.lt.DomainModels;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Videogame {

    private Long gameID;
    private String title;
    private String platform;
    private String releaseDate;
    private float price;

    public Videogame() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getGameID() {
        return gameID;
    }

    public String getTitle() {
        return title;
    }

    public String getPlatform() {
        return platform;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public float getPrice() {
        return price;
    }

    public void setGameID(Long gameID) {
        this.gameID = gameID;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(String releaseDate){
        this.releaseDate = releaseDate;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
