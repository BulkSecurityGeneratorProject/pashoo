package ir.company.app.service.migmig;

import java.util.List;

/**
 * Created by farzad on 8/10/2017.
 */
public class RecordDTO {
    public int rank;
    public List<User> users;
    public int score;

    public static class User {
        public String avatar;
        public long score;
        public int index;
        public String user;
    }
}
