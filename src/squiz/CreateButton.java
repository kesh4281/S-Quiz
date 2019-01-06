package squiz;
import java.awt.*;
import javax.swing.*;
public class CreateButton extends JPanel
{
   JButton b;
   Label l;
   CreateButton(int h,int w,String str,Icon I)
   {
       l=new Label("ABC");
       b=new JButton();
       b.setSize(h,w);
       b.setBounds(20,20,20,20);
       b.setText(str);
       add(b);
       setVisible(true);
       setSize(400,400);
       setLayout(null);
       b.setIcon(I);
   }
}
