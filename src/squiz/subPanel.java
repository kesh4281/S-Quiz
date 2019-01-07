package squiz;
import javax.swing.*;
import java.awt.Dimension;
public class subPanel extends JPanel
{
    subPanel()
    {
        JButton a,b,c,d;
        GroupLayout gp=new GroupLayout(this);
        setLayout(gp);
        //jp.setLayout(new GroupLayout(jp));
        a=new JButton(" Physics");
        b=new JButton(" Math ");
        c=new JButton("Chemistry");
        d=new JButton(" English ");
        a.setMinimumSize(new Dimension(100,20));     
        b.setMinimumSize(new Dimension(100,20));
        c.setMinimumSize(new Dimension(100,20));
        d.setMinimumSize(new Dimension(100,20));        
        add(a);
        add(b);
        add(c);
        add(d);  
        gp.setAutoCreateGaps(true);
        gp.setAutoCreateContainerGaps(true);
        gp.setHorizontalGroup(
                gp.createParallelGroup().addComponent(a).addComponent(b).addComponent(c).addComponent(d)
        );
        
        gp.setVerticalGroup(
                gp.createSequentialGroup().addComponent(a).addComponent(b).addComponent(c).addComponent(d)
        );
                
    }
//    public static void main(String args[])
//    {
//        JFrame f=new JFrame();
//        subPanel sp=new subPanel();
//        f.add(sp);
//        f.setVisible(true);
//        f.setSize(400,400);
//    }
}
