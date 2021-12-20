// 多重繼承
interface iShape03
//界面iShape03 
{
    public void show();
    public int area(); 
}
interface iColor
//界面iColor
{
    public void showColor();
}
class CWin
//類別實作界面，請自行設計
{
    protected int width;
    protected int height;
    protected String color;
    public CWin(int w,int h,String str)
    //建構元
    {
        width = w;
        height = h;
        color = str;
    }
    public void show()
    //方法1
    {
        System.out.println("color="+color);
        System.out.println("width="+width);
        System.out.println("height="+height);
        System.out.println("area="+area());
    }
    public int area()
    //方法2
    {
        return width*height;
    }
    public void showColor()
    //方法3
    {
        System.out.println("color="+color);
    }
}
    public class J2
    {
        public static void main(String args[])
        {
            CWin win=new 
            CWin(5,7,"Green");
            win.show();
        }
        }
