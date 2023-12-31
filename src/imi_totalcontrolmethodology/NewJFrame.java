package imi_totalcontrolmethodology;

//import com.formdev.flatlaf.FlatDarkLaf;
//import java.awt.Color;
//import java.awt.Image;
//import java.awt.Toolkit;
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author USer1
 */
public class NewJFrame extends JFrame {

	/**
	 * Creates new form NewJFrame
	 */
	public NewJFrame() {
		initComponents();
		this.setTitle("TOTAL CONTROL METHODOLOGY");
		this.setResizable(false);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon(this.getClass().getResource("LOGO.jpg")).getImage());
		this.setVisible(true);
		this.getContentPane().setBackground(Color.WHITE);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	private void initComponents() {
//		jPopupMenu1 = new javax.swing.JPopupMenu();
		cb_EmployeeNum = new JComboBox<String>();
		tf_Shift = new JTextField();
		bt_Continue = new javax.swing.JButton();
		Lbl_IMI_Logo = new javax.swing.JLabel();
		Lbl_Employee = new javax.swing.JLabel();
		Lbl_Shift = new javax.swing.JLabel();

		this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		this.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
		this.setForeground(java.awt.Color.white);
		this.setIconImage(getIconImage());

//		cb_EmployeeNum.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
		cb_EmployeeNum.addItem("  --  Select Employee Number  --");
		cb_EmployeeNum.setFont(new java.awt.Font("Dialog", 0, 16)); 
		cb_EmployeeNum.setEditable(true);
		cb_EmployeeNum.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cb_EmployeeNumActionPerformed(evt);
			}
		});

		tf_Shift.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
		tf_Shift.setFont(new java.awt.Font("Dialog", 0, 16)); 
		
		bt_Continue.setText("Continue");
		bt_Continue.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bt_ContinueActionPerformed(evt);
			}
		});

		Lbl_IMI_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imi_totalcontrolmethodology/image-300x150.jpg"))); // NOI18N

		Lbl_Employee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		Lbl_Employee.setText("EMPLOYEE NUMBER");

		Lbl_Shift.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		Lbl_Shift.setText("SHIFT");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(44, 44, 44)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(bt_Continue, javax.swing.GroupLayout.PREFERRED_SIZE, 85,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Lbl_IMI_Logo))
						.addContainerGap(38, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addComponent(Lbl_Shift, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(Lbl_Employee, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(cb_EmployeeNum, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(tf_Shift, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.PREFERRED_SIZE, 270,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(53, 53, 53)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addComponent(Lbl_IMI_Logo).addGap(19, 19, 19)
						.addComponent(cb_EmployeeNum, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(Lbl_Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(50, 50, 50)
						.addComponent(tf_Shift, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(Lbl_Shift, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(bt_Continue, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(49, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void cb_EmployeeNumActionPerformed(java.awt.event.ActionEvent evt) {
 		if(cb_EmployeeNum.getSelectedIndex() > 0)
 			cb_EmployeeNum.setEditable(false);
 		
 		if(cb_EmployeeNum.getSelectedIndex() == 0)
 			cb_EmployeeNum.setEditable(true);
	}
	
	private void bt_ContinueActionPerformed(java.awt.event.ActionEvent evt) {
 		if(tf_Shift.getText().length() > 7 && cb_EmployeeNum.getSelectedIndex() > 0) {
 			System.out.println(cb_EmployeeNum.getEditor().getItem());
 			dispose();
		}else
 			JOptionPane.showMessageDialog(null, "Invalid Input! Provide appropriate Information.", "Error", JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new NewJFrame().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JButton bt_Continue;
	private JLabel Lbl_IMI_Logo;
	private JLabel Lbl_Employee;
	private JLabel Lbl_Shift;
//	private JPopupMenu jPopupMenu1;
	private JComboBox<String> cb_EmployeeNum;
	private JTextField tf_Shift;
	// End of variables declaration//GEN-END:variables
}
