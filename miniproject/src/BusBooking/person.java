package BusBooking;

public class person {
    private String name;
    private int age;
    private String gender;
    private int mobileNo;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public person(String name, int age, String gender, int mobileNo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mobileNo = mobileNo;
    }

    public person(String line){
        String values[] = line.split(",");
        this.name = values[0];
        this.age = Integer.valueOf(values[1]);
        this.gender = values[2];
        this.mobileNo = Integer.valueOf(values[3]);
    }

    @Override
    public String toString() {
        return "Name: " + name + "  Age: " + age + "  Gender: " + gender + "  MobileNo: " + mobileNo;
    }

}
