package tk.codehaventech.amityapp.entities;

import com.orm.SugarRecord;

/**
 * Created by mrsmith on 9/6/14.
 * User Entity
 */
public class User extends SugarRecord<User> {

    String mUsername;
    String mFirstName;
    String mLastName;
    String mOtherNames;
    String mEmail;

    //Default constructor

    public User(){

    }

    public User(String un, String fn, String ln, String on, String email){
        this.mUsername = un;
        this.mFirstName = fn;
        this.mLastName = ln;
        this.mOtherNames = on;
        this.mEmail = email;
    }

}
