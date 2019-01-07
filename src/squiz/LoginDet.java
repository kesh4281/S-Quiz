package squiz;
import java.awt.*;
import javax.swing.*;
public class LoginDet extends JPanel
{
    Label login,signup;
    LoginDet()
    {    
        setLayout(new FlowLayout());
        JLabel login=new JLabel("Login");
        JLabel signup=new JLabel("Signup");
        add(login);
        add(signup);
        login.setMinimumSize(new Dimension(75,20));
        signup.setMinimumSize(new Dimension(75,20));
    } 
//    public static void main(String args[])
//    {
//        JFrame f=new JFrame();
//        LoginDet ld=new LoginDet();
//        f.add(ld);
//        f.setVisible(true);
//        f.setSize(400,400);
//    }    
}
