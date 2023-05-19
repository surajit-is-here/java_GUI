import java.util.Scanner;

public class prog7 {
    void go() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number in p/q format (q!=0)");
        int p1= sc.nextInt();
        int q1= sc.nextInt();
        int p2= sc.nextInt();
        int q2= sc.nextInt();
        int q3 = find_lcm(q1,q2);
        int p3=(q3/q1)*p1+(q3/q2)*p2;
        int hcf=find_hcf(p3,q3);
        if(hcf==1)
            display(p1,q1,p2,q2,p3,q3);
        else
            display(p1,q1,p2,q2,(p3/hcf),(q3/hcf));
    }
    static int find_hcf(int p,int q)
    {
        if(q==0)
            return p;
        else
            return find_hcf(q,(p%q));
    }
    static int find_lcm(int q1, int q2)
    {
        return (q1*q2)/find_hcf(q1,q2);
    }
    static void display(int p1,int q1,int p2,int q2, int p3,int q3)
    {
        if(q3!=1)
            System.out.println(p1+"/"+q1+" + "+p2+"/"+q2+" = "+ p3+"/"+q3);
        else
            System.out.println(p1+"/"+q1+" + "+p2+"/"+q2+" = "+ p3);
    }
}
