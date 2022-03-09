public class Employee extends Throwable {
    private String Title;
    private String Name;
    private String PPSID;
    private String Phone;
    private String EmType;
    private int Age;

    public Employee(String title, String name, String ppsid, String phone, String emType, int age) {
        //checking
        if(title == "Mr" || title == "Mrs" || title == "Miss"){
            Title = title;
        }
        else{
            throw new IllegalArgumentException("Wrong Title");
        }
        Name = name;
        PPSID = ppsid;
        Phone = phone;
        EmType = emType;
        Age = age;
    }

    public String getTitle() {
        return Title;
    }
}
