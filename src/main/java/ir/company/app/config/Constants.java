package ir.company.app.config;

import org.springframework.web.socket.WebSocketSession;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Application constants.
 */
public final class Constants {

    //Regex for acceptable logins
    public static final String LOGIN_REGEX = "^[_'.@A-Za-z0-9-]*$";
    // Spring profile for development and production, see http://jhipster.github.io/profiles/
    public static final String SPRING_PROFILE_DEVELOPMENT = "dev";
    public static final String SPRING_PROFILE_PRODUCTION = "prod";
    // Spring profile used when deploying with Spring Cloud (used when deploying to CloudFoundry)
    public static final String SPRING_PROFILE_CLOUD = "cloud";
    // Spring profile used when deploying to Heroku
    public static final String SPRING_PROFILE_HEROKU = "heroku";
    // Spring profile used to disable swagger
    public static final String SPRING_PROFILE_SWAGGER = "swagger";
    // Spring profile used to disable running liquibase
    public static final String SPRING_PROFILE_NO_LIQUIBASE = "no-liquibase";

    public static final String SYSTEM_ACCOUNT = "system";

    public static HashMap<Long, WebSocketSession> userHashMap = new HashMap<>();

    public static AtomicLong index = new AtomicLong(0l);

    public static int perGame = 40;
    public static int friendGame = 40;
    public static int newUser = 400;
    public static int invite = 150;
    public static int invited = 150;
    public static int video = 20;
    public static int ExpandMenu = 10;
    public static int winEXP = 5;
    public static int doubleWinEXP = 6;
    public static int loseEXP = 1;
    public static int doubleLoseEXP = 0;
    public static int drawEXP = 2;
    public static int drawPrize =40 ;
    public static int winPrize = 70;
    public static int doubleWinPrize = 80;
    public static int losePrize = 10;
    public static int doubleLosePrize = 0;


    private Constants() {
    }
}
