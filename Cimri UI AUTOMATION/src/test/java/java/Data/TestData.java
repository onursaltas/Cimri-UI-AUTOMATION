package java.Data;

public class TestData {

    private String Email;
    private String Password;

    public TestData(String Email,String Password){
        this.Email=Email;
        this.Password=Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getPassword(){
        return Password;
    }
    public void setPassword(String Password){
        this.Password=Password;
    }


}
