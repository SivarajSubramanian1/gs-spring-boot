package main.java.com.example.springboot;

public class UserResponse {
    private Boolean status;
    private String message;


    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public UserResponse(){
    }

    // setters & getters
}