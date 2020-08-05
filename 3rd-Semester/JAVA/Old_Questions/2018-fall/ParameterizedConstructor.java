public class ParameterizedConstructor {

    int id;
    String name, post;
    float salary;

    ParameterizedConstructor(int id, String name, String post, float salary){
        this.id = id;
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    public void to_String(){
        System.out.println("Override this method");
    }
}

public class InnerParameterizedConstructor extends ParameterizedConstructor {

    InnerParameterizedConstructor(int id, String name, String post, float salary) {
        super(id, name, post, salary);
    }

    @Override
    public void to_String(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Post: " + post);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        InnerParameterizedConstructor obj = new InnerParameterizedConstructor(1, "Alson", "Developer", 50000.00);
        
            obj.to_String();
    }    
}