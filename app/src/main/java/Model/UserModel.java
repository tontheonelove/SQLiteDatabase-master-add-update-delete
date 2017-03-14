package Model;

/**
 * Created by IamDeveloper on 10/10/2016.
 */
public class UserModel {
    String id;
    String name;
    String pass;
    String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return getName()+"\n"
                +getPass()+"\n"
                +getEmail();
    }
}
