package Boundary;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;

public class CustomerPayment extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CustomerPayment frame = new CustomerPayment();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public CustomerPayment() {
        setTitle("Welcome xxx!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));
        //content pane
        JPanel panel_N = new JPanel();
        panel_N.setBorder(new LineBorder(new Color(0, 0, 0)));
        contentPane.add(panel_N, BorderLayout.NORTH);
        panel_N.setLayout(new BorderLayout(0, 0));
        //上部的pane
        JButton btnNewButton = new JButton("Back");
        panel_N.add(btnNewButton, BorderLayout.WEST);
        //返回键，返回order
        JPanel panel_C = new JPanel();
        panel_C.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_C.setBackground(Color.WHITE);
        contentPane.add(panel_C, BorderLayout.CENTER);
        panel_C.setLayout(new BorderLayout(0, 0));
        //中部的pane
        JLabel lblNewLabel = new JLabel("view.Payment information");
        lblNewLabel.setBackground(SystemColor.menu);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBorder(BorderFactory.createLineBorder(Color.black));
        panel_C.add(lblNewLabel, BorderLayout.NORTH);

        JLabel lbl_Info = new JLabel("");
        lbl_Info.setForeground(new Color(0, 0, 0));
        lbl_Info.setBackground(Color.WHITE);
        lbl_Info.setVerticalAlignment(SwingConstants.TOP);
        lbl_Info.setHorizontalAlignment(SwingConstants.LEFT);
        lbl_Info.setBorder(BorderFactory.createLineBorder(Color.black));
        panel_C.add(lbl_Info, BorderLayout.CENTER);
        //
        JPanel panel_S = new JPanel();
        contentPane.add(panel_S, BorderLayout.SOUTH);
        panel_S.setLayout(new BorderLayout(0, 0));
        //下部的pane
        JPanel panel_select = new JPanel();
        panel_select.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_S.add(panel_select, BorderLayout.CENTER);
        panel_select.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        //选择堂食外带和支付方式的pane
        JPanel panel_E = new JPanel();
        panel_E.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_select.add(panel_E);
        panel_E.setLayout(new BorderLayout(0, 0));
        //堂食or外带
        JRadioButton rdbtn_Here = new JRadioButton("for here");
        panel_E.add(rdbtn_Here, BorderLayout.NORTH);

        JRadioButton rdbtn_Out = new JRadioButton("Take out");
        panel_E.add(rdbtn_Out, BorderLayout.SOUTH);

        ButtonGroup group1=new ButtonGroup();
        group1.add(rdbtn_Here);
        group1.add(rdbtn_Out);
        //选择堂食还是外带
        JPanel panel_W = new JPanel();
        panel_W.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_select.add(panel_W);
        panel_W.setLayout(new BorderLayout(0, 0));
        //cash or card
        JRadioButton rdbtn_Cash = new JRadioButton("Cash");
        panel_W.add(rdbtn_Cash, BorderLayout.SOUTH);

        JRadioButton rdbtn_Card = new JRadioButton("Card");
        panel_W.add(rdbtn_Card, BorderLayout.NORTH);

        ButtonGroup group2=new ButtonGroup();
        group2.add(rdbtn_Card);
        group2.add(rdbtn_Cash);
        //选择支付方式
        JPanel panel_pay = new JPanel();
        panel_S.add(panel_pay, BorderLayout.SOUTH);
        panel_pay.setLayout(new BorderLayout(0, 0));

        JButton btnNewButton_1 = new JButton("Confirm payment");
        panel_pay.add(btnNewButton_1, BorderLayout.SOUTH);
        //确认支付
        JLabel lbl_Remind = new JLabel("");
        lbl_Remind.setForeground(Color.RED);
        panel_pay.add(lbl_Remind, BorderLayout.CENTER);
        //没有选择堂食还是外带或支付方式的时候进行提醒
    }

}
