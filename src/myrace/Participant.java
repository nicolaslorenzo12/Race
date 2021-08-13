package myrace;

public class Participant {

    private String name;
    private String lastName;
    private int status;

    public Participant(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public String getStatus(int status){
        this.status = status;
        String message = "";

        if(status == 1){
            message = "(Finisher)";
        }
        else{
            message = "(Not finisher)";
        }


        return message;
    }


}
