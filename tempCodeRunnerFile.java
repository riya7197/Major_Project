import java.util.Scanner;
class A
{
    
    int a,b;
    void get1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        a=sc.nextInt();
        System.out.println("enter b");
        b=sc.nextInt();
    }
}
class B extends A
{
    int c;
    void get2()
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter c:");
        c=sc.nextInt();
    }
    void mul()
    {
       
        System.out.println("result of multiplication is :"+(a*b*c));
    }
}
class C extends B
{
    int d;
    void get3()
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter d:");
        d=sc.nextInt();
    }
    void add()
    {
        System.out.println("addition of number is :"+(a+b+c+d));
    }
    public static void main(String arr[])
    {
        C obj=new C();
        obj.get1();
        obj.get2();
        obj.mul();
        obj.get3();
        obj.add();
    }
}
