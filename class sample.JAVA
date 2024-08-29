class sample
{
    String name;
    int roll;
    sample()
    {
        System.out.println("enter the detail of the student");
        this("riya",101);
    }
    sample(String s,int r)
    {
        name=s;
        roll=r;
        System.out.println("name is :"+name);
        System.out.println("roll is :"+roll);
    }
    public static void main(String arr[])
    {
        sample obj=new sample();
    }
}