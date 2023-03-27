package module6;



import javax.swing.JFrame;
import javax.swing.JLabel;
public class gui {
    public static void main(String[] args) {
        abc obj = new abc();
        
    }
}
class abc extends JFrame {

    public abc()
    {
        //setLayout(new LayoutManager());
       // setLayout(new Flo));
        JLabel l = new JLabel("Hello World");
       JLabel l1 = new JLabel("welcome class");
        add(l);
        add(l1);
       setVisible(true);
        setSize(400,400);
    }
}