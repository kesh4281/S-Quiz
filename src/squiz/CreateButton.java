package squiz;
import java.awt.*;
import javax.swing.*;
public class CreateButton extends JPanel
{
   JButton b;
   Label l;
   CreateButton(String str)
   {
       l=new Label("ABC");
       b=new JButton(str);
       add(b);
       setVisible(true);
       setSize(400,400);
       setLayout(null);
       b.setIcon(I);
   }
   
   
   
}
