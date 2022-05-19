public class Client {
    public String id;
    public String fuLName;

    public Client(String id, String fuLName) {
        this.id = id;
        this.fuLName = fuLName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFuLName() {
        return fuLName;
    }

    public void setFuLName(String fuLName) {
        this.fuLName = fuLName;
    }
}
