class Rectangle {
    double l;
    double w;

    Rectangle(double l, double w) {

        this.l = l;
        this.w = w;
    }
    void area(){
        System.out.println(l*w);
    }
    void perimeter(){
        System.out.println(2*(l+w));
    }


}
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(2,4);
        Rectangle k=new Rectangle(5,6);
        r.area();
        r.perimeter();
        k.area();
        k.perimeter();

    }
}