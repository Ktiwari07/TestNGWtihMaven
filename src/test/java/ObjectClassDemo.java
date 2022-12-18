public class ObjectClassDemo {
    int empid;
    int salary;

    public ObjectClassDemo(int empid,int salary) {
        this.empid=empid;
        this.salary=salary;
    }

    @Override
    public int hashCode() {
        return 34;
    }

    @Override
    public boolean equals(Object obj) {

        if(((ObjectClassDemo) obj).empid!=this.empid)
        return true;
        else return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "ObjectClassDemo{" +
                "empid=" + empid +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void finalize() {
        System.out.println("Garbage collection in progress");
    }

    public static void main(String[] args) {

        ObjectClassDemo obj=new ObjectClassDemo(233,8989998);
        ObjectClassDemo obj1=new ObjectClassDemo(23,89899);
       // System.out.println(obj.hashCode());
        for(long  i=0;i<24000L;i++){
            obj=new ObjectClassDemo(34,3333);
            obj1=new ObjectClassDemo(23,89899);
        }
        System.out.println(obj);
        System.out.println(obj1);
        System.out.println( obj.equals(obj1));
    }
}
