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
        if(name.getBytes().length >= 5 && name.getBytes().length <= 22){
            Name = name;
        }
        else{
            throw new IllegalArgumentException("Name is Invalid");
        }
        if(ppsid.getBytes().length >= 6){
            PPSID = ppsid;
        }
        else{
            throw new IllegalArgumentException("PPSID is Invalid");
        }
        if(phone.getBytes().length >= 7){
            Phone = phone;
        }
        else{
            throw new IllegalArgumentException("Phone is Invalid");
        }
        if(emType == "Full-Time" || emType == "Part-Time"){
            EmType = emType;
        }
        else{
            throw new IllegalArgumentException("Employee Type  is Invalid");
        }
        Age = age;
    }

    public String getTitle() {
        return Title;
    }

    public String getName() {
        return Name;
    }

    public String getPPSID() {
        return PPSID;
    }

    public String getPhone() {
        return Phone;
    }

    public String getEmType() {
        return EmType;
    }
}
