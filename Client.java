/* In this implementation, the Singleton class has a 
    private constructor, which prevents other classes 
    from instantiating it. It also has a getInstance() 
    method that returns the singleton instance of the class.

    The getInstance() method checks if the instance is already 
    created. If it's not, it creates a new instance of the 
    Singleton class and returns it. If it's already created, 
    it returns the existing instance.

    In this example, the Client gets the singleton instance 
    of the Singleton class using the getInstance() method and 
    calls the doSomething() method on it.

    Since the Singleton class can have only one instance at a time, 
    all calls to the getInstance() method return the same instance. 
    This way, the Singleton Pattern ensures that a class has only 
    one instance and provides a global point of access to it.
*/

public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }
}

