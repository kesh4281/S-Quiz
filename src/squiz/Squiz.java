package squiz;
import javax.swing.*;
import java.awt.*;
public class Squiz extends JFrame
{
    Squiz()
    {
        subPanel sp=new subPanel();
        LoginDet ld=new LoginDet();
        setVisible(true);
        setSize(400,400);

        this.setLayout(new BorderLayout());
        add(sp,BorderLayout.LINE_START);
        add(ld,BorderLayout.PAGE_START);
    }
    public static void main(String[] args) 
    {
        Squiz sq=new Squiz();
    }
}
