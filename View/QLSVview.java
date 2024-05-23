package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QLSVview extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    QLSVview frame = new QLSVview();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public QLSVview() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 762, 465);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu mnFile = new JMenu("File");
        mnFile.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        menuBar.add(mnFile);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Open File");
        mnFile.add(mntmNewMenuItem);
        
        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Close File");
        mnFile.add(mntmNewMenuItem_1);
        
        JMenuItem mntmNewMenuItem_2 = new JMenuItem("Exit");
        mnFile.add(mntmNewMenuItem_2);
        
        JMenu them = new JMenu("Thêm sinh viên");
        them.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        menuBar.add(them);
        
        // Thêm ActionListener cho mục "Thêm sinh viên"
        JMenuItem menuItemThemSV = new JMenuItem("Thêm sinh viên");
        menuItemThemSV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Them themView = new Them();
                themView.setVisible(true);
                dispose(); // Đóng cửa sổ hiện tại
            }
        });
        them.add(menuItemThemSV);
        
        JMenu sua = new JMenu("Sửa thông tin sinh viên");
        sua.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        menuBar.add(sua);
        
        // Thêm ActionListener cho mục "Sửa sinh viên"
        JMenuItem menuItemSuaSV = new JMenuItem("Sửa sinh viên");
        menuItemSuaSV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sua suaView = new Sua();
                suaView.setVisible(true);
                dispose(); // Đóng cửa sổ hiện tại
            }
        });
        sua.add(menuItemSuaSV);
        
        JMenu mnNewMenu_4 = new JMenu("Xóa sinh viên");
        mnNewMenu_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        menuBar.add(mnNewMenu_4);
        
        JMenu mnNewMenu_1 = new JMenu("Tìm sinh viên");
        mnNewMenu_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        menuBar.add(mnNewMenu_1);
        
        JMenuItem mntmNewMenuItem_3 = new JMenuItem("Tìm theo mã");
        mnNewMenu_1.add(mntmNewMenuItem_3);
        
        JMenuItem mntmNewMenuItem_4 = new JMenuItem("Tìm theo tên");
        mnNewMenu_1.add(mntmNewMenuItem_4);
        
        JMenuItem mntmNewMenuItem_5 = new JMenuItem("Tìm theo quê quán");
        mnNewMenu_1.add(mntmNewMenuItem_5);
        
        contentPane = new JPanel();
        contentPane.setForeground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Mã sinh viên");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        lblNewLabel.setBounds(562, 42, 133, 27);
        contentPane.add(lblNewLabel);
        
        JButton btnNewButton = new JButton("Tìm kiếm");
        btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btnNewButton.setBounds(10, 37, 142, 41);
        contentPane.add(btnNewButton);
        
        textField = new JTextField();
        textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        textField.setBounds(428, 43, 108, 27);
        contentPane.add(textField);
        textField.setColumns(10);
        
        this.setVisible(true);
    }
}
