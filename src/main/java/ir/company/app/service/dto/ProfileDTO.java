package ir.company.app.service.dto;


import java.util.ArrayList;
import java.util.List;

/**
 * A DTO representing a user's credentials
 */
public class ProfileDTO {

    private String username;
    public int coins;
    public int level;
    public boolean guest = false;
    public int gem;
    public int win;
    public int lose;
    public int draw;
    public int winInRow = 0;
    public int specialGame = 0;
    public int goldCup = 0;
    public int silverCup = 0;
    public int bronzeCup = 0;
    public double puzzle = 0d;
    public double run = 0d;
    public double skill = 0d;
    public double sport = 0d;
   public List<String> avatars= new ArrayList<>();

    public long score;
    public int maxWinInRow = 0;
    public String avatar;
    public Integer rating;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

}
