package one.digitalinnovation;

/*
* Classe usada para representar o usuário
* in: username, password, status;
* gets
* status -> enum
* */
public class User {
    private String username;
    private String password;
    private StatusUser status;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return (this.status == StatusUser.ENABLED) ? username : "NOT ALLOWED";
    }

    public String getPassword() {
        return (this.status == StatusUser.ENABLED) ? password : "NOT ALLOWED";
    }

    public StatusUser getStatus() {
        return status;
    }

    /*
     * Método para desabilitar o usuário
     * */
    public void disable() { this.status = StatusUser.DISABLED; }
    /*
     * Método para habilitar o usuário
     * */
    public void enable() { this.status = StatusUser.ENABLED; }
    /*
    * Método para bloquear o usuário
    * */
    public void block() { this.status = StatusUser.BLOCKED; }
}