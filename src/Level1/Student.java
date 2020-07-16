package Level1;

public class Student {

    private Integer id;
    private String firstName;
    private String address;


    public Student(Integer id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
