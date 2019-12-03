package Model;

public class User implements Account {
    private String name,lastname;
    private String password;
    private String email;


    public User(String name, String lastname, String email, String password) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getLastname() {
        return this.lastname;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setName(String s) {
        this.name = s;
    }

    @Override
    public void setLastname(String s) {
        this.lastname = s;
    }

    @Override
    public void setPassword(String s) {
        this.password = s;
    }

    @Override
    public void setEmail(String s) {
        this.email = s;
    }
}
