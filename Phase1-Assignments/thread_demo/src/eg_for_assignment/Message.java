package eg_for_assignment;

public class Message {
    private String msg;
    
    // message method with string argument
    public Message(String str){
        this.msg = str;
    }
    // getter
    public String getMsg() {
        return msg;
    }
    // setter
    public void setMsg(String str) {
        this.msg = str;
    }

}