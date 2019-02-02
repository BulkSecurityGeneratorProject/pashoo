package ir.company.app.domain.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by farzad on 7/18/17.
 */
@Entity
@DynamicUpdate
@Table(name = "Game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    User first;
    @OneToOne
    User second;
    @Enumerated
    GameStatus gameStatus;
    @OneToMany(fetch = FetchType.EAGER)
    Set<Challenge> challenges;
    @OneToMany(fetch = FetchType.EAGER)
    List<Message> messagesFirst;
    @OneToMany(fetch = FetchType.EAGER)
    List<Message> messagesSecond;

    private ZonedDateTime dateTime;
    @OneToOne
    private League league;

    private int winner = -1;
    private int firstScore = 0;
    private int SecondScore = 0;
    private Boolean friendly = false;

    public boolean isFriendly() {
        return friendly;
    }

    public void setFriendly(boolean friendly) {
        this.friendly = friendly;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getFirst() {
        return first;
    }

    public void setFirst(User first) {
        this.first = first;
    }

    public User getSecond() {
        return second;
    }

    public void setSecond(User second) {
        this.second = second;
    }

    public Set<Challenge> getChallenges() {
        if (challenges == null)
            return new HashSet<>();
        return challenges;
    }

    public void setChallenges(Set<Challenge> challenges) {
        this.challenges = challenges;
    }

    public Boolean getFriendly() {
        return friendly;
    }

    public void setFriendly(Boolean friendly) {
        this.friendly = friendly;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        if (gameStatus.equals(GameStatus.FRIENDLY))
            friendly = true;
        this.gameStatus = gameStatus;
    }

    public ZonedDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    public int getFirstScore() {
        return firstScore;
    }

    public void setFirstScore(int firstScore) {
        this.firstScore = firstScore;
    }

    public int getSecondScore() {
        return SecondScore;
    }

    public void setSecondScore(int secondScore) {
        SecondScore = secondScore;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public List<Message> getMessagesFirst() {
        if (messagesFirst == null)
            return new ArrayList<>();
        return messagesFirst;
    }

    public void setMessagesFirst(List<Message> messagesFirst) {
        this.messagesFirst = messagesFirst;
    }

    public List<Message> getMessagesSecond() {
        if (messagesSecond == null)
            return new ArrayList<>();
        return messagesSecond;
    }

    public void setMessagesSecond(List<Message> messagesSecond) {
        this.messagesSecond = messagesSecond;
    }


}
