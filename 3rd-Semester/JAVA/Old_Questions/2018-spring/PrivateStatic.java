class One {
    private void mssg(){
        System.out.println("This is a private method.");
    }

    static void show(){
        System.out.println("This is a static method.");
    }
}

class PrivateStatic extends One {

    private void mssg(){
        System.out.println("Trying to override private method.");
    }

    static void show(){
        System.out.println("Trying to override static method.");
    }

    public static void main(String[] args) {
        PrivateStatic obj = new PrivateStatic();

            obj.mssg();//prints Trying to override private method.
            // it seeems as mssg() method is overridden but actually it is a new method for PrivateStatic class

            obj.show();//prints This is a static method.
    }
}