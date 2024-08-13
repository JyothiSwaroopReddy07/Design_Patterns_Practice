
// Mostly useful if we need a single object only for a class. Famous use case is database initialization
public class Singleton {

    // static Keyword:  as their must be only single object for this class.
    /*  volatile keyword: It ensures that the value of the variable is always read from and written to the main memory, 
    rather than being cached in a thread's local memory. This is crucial in a multi-threaded environment where multiple threads 
    might be accessing and modifying the same variable which can affect synchronization and create more than 1 instance of Singleton object*/ 
    
    private static volatile Singleton instance;
    String database_url; // examplery data related to database like database_url


    // Constructor is private to ensure only public getInstance method has access to create new object.
    private Singleton(String data) {
        this.database_url=data;
    }

    public static Singleton getInstance(String db_url) {
        // instance is volatile variable, fetching instance from main memory is costly. 
        //  Since we need to use this varialble multiple time
        // We store in local variable to improve performance by 40%.
        Singleton result = instance;
        // double checking the lock
        if(result==null) {
            // Ensuring the creation process is thread safe.
            synchronized(Singleton.class) {
                result = instance;
                if(result==null) {
                    instance = result = new Singleton(db_url);
                }
            }
        }
        return result;
    }
    

}