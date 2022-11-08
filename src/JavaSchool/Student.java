package JavaSchool;

public class Student {
    private String name;
    private  String email;
    private int phoneNo;
    private String height;
    private MarkSheet markSheet;

    Student (String name, String email,int phoneNo, String height, MarkSheet markSheet) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.height = height;
        this.markSheet = markSheet;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getHeight() {
        return height;
    }
    public double heightInNumbers(){
        String[] parse = height.split(" ");
        double feet = Double.parseDouble(parse[0]);
        double inch = Double.parseDouble(parse[2]);
        return feet+inch/12;
    }

    public void setHeight(String height) {
        this.height = height;
    }
    public double getGpa() {
        return markSheet.getGPa();
    }

}
