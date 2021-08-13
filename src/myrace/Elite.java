package myrace;

public class Elite extends  Participant{

    private String status;

    public Elite(String name, String lastName, String status){
        super(name, lastName);
        this.status = status;
    }

    public String getStatus(){
        this.status = status;
        String message = "";

        if(status.equals("Podium")){
            message = "(He is in the podium)";
        }
        else{
            message ="(He is not in the podium";
        }

        return message;
    }
}
