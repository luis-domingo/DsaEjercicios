public class Person {
    private static int lastId;

    private int id;
    private String name;

    public Person(String name){
        this.id = lastId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "id: "+this.id + "\nname "+ this.name+"\n";
    }


    public static void main(String[] args){
        Person p1 = new Person ("Jessica");
        Person p2 = new Person ("Axel");
        Person p3 = new Person ("Marc");
        Person p4 = new Person ("Luis");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println("The number of people is "+lastId);
    }




}
