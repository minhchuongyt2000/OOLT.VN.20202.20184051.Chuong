public class PlayerException extends Exception {
    private String message;
    public PlayerException(String message) {
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }
    public static void main(String[] args) {

    }
}