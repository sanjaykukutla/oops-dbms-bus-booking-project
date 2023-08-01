package BusBooking;

public class driver extends person {
    bus b;
    private int salary;
    private int experience;

    public bus getB() {
        return b;
    }

    public void setB(bus b) {
        this.b = b;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public driver(String name, int age, String gender, int mobileNo, bus b, int salary, int experience) {
        super(name, age, gender, mobileNo);
        this.b = b;
        this.salary = salary;
        this.experience = experience;
    }
}
