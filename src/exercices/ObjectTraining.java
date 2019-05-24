public class ObjectTraining {

    // TODO 1. Add the following private attributes :
    // - name (String)
    // - age (int)
    // - wilder (boolean)
    String name;
    int age;
    boolean wilder;

    // TODO 2. Add a Constructor with name and age arguments (in this order)
    // This constructor must initialize name and age attributes
    public ObjectTraining(String name,int age,boolean wilder){
        this.name = name;
        this.age = age;
        this.wilder = wilder;
    }
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
    public boolean isWilder() {
        return wilder;
    }

    public void setWilder(boolean wilder) {
        this.wilder = wilder;
    }
    public String whoAmI(String name,int age){
        return "My name is " + name + " and I'm " + age;
    }


    // TODO 9. Create a method 'whoAmI' that returns "My name is {name} and I'm {age}"
    // where you replace {name} and {age} with attributes values


    // Do not remove this empty constructor !
    public ObjectTraining() {
    }
}
