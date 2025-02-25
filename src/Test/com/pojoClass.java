package Test.com;

public class pojoClass {
    private String name;
    private int age;
    private String address;

    public pojoClass(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public pojoClass() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
