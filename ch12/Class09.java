package pack9.sub1; // �N CSphere ���O�ǤJ pack9.sub1 ��
 public class Class09
 {
 final static double PI=3.14;
 private double radius;

 public Class09(double r)
 {
 radius=r;



 }
 public void show()
 {
 double vol=4/3.0*PI*radius*radius*radius;

 System.out.print("radius="+radius);
 System.out.println(", volume="+vol);
 }
 }
 // CTrapezoid.java, ���ɮ׸m�� pack9\sub2 ��Ƨ���
 package pack9.sub2; // �N CTrapezoid ���O�ǤJ pack9.sub2 ��
 public class CTrapezoid
 {
 private int upper;
 private int base;
 private int height;

 public CTrapezoid(int u,int b,int h)
 {
 upper=u;
 base=b;
 height=h;
 }
 public void show()
 {
 double area=(upper+base)*height/2.0;
 System.out.print("upper="+upper);
 System.out.print(", base="+base);
 System.out.print(", height="+height);
 System.out.println(", area="+area);
 }
 }
 // hw12_9.java,���ɮ׸m�� pack9 ��Ƨ���
 package pack9; // �N app12_8 ���O�ǤJ package pack9 ��
 import pack9.sub1.CSphere;// ���J pack9.sub1 �̪� CSphere ���O
 import pack9.sub2.CTrapezoid;// ���Jpack9.sub2 �̪�CTrapezoid���O

 public class Class09
 {



 public static void main(String args[])
 {
 Class09 sp=new Class09(2);
 CTrapezoid tra=new CTrapezoid(2,3,4);
 sp.show();
 tra.show();
 }
 }